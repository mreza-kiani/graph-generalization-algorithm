package org.lsmr.vending.software3.communication;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.lsmr.vending.hardware.Display;
import org.lsmr.vending.hardware.SelectionButton;
import org.lsmr.vending.hardware.SelectionButtonListener;
import org.lsmr.vending.hardware.VendingMachine;
import org.lsmr.vending.software3.Product;

/**
 * Contains all communication functionality, which currently means, it deals
 * with users' selections and the display.
 *
 * @author Robert J. Walker
 */
public class Communications {
	private final Display display;
	private final Set<CommunicationListener> listeners = new HashSet<>();
	private Map<SelectionButton, Product> buttonToProductBindings = new HashMap<>();

	private class InnerListener implements SelectionButtonListener {
		@Override
		public void pressed(SelectionButton button) {
			notifySelected(buttonToProductBindings.get(button));
		}
	}

	/**
	 * Basic constructor.
	 *
	 * @param vendingMachine
	 *            The device facade to be used to implement low-level functionality.
	 */
	public Communications(VendingMachine vendingMachine) {
		InnerListener innerListener = new InnerListener();
		int count = vendingMachine.getNumberOfSelectionButtons();

		for(int i = 0; i < count; i++)
			vendingMachine.getSelectionButton(i).register(innerListener);

		display = vendingMachine.getDisplay();
	}

	/**
	 * Permits bindings between {@link SelectionButton}s and {@link Product} s to be
	 * specified.
	 *
	 * @param bindings
	 *            A map of the bindings from {@link SelectionButton}s to
	 *            {@link Product}s. More than one {@link SelectionButton} can map to
	 *            a given {@link Product}.
	 */
	public void configure(Map<SelectionButton, Product> bindings) {
		this.buttonToProductBindings.putAll(bindings);
	}

	/**
	 * Registers the given listener so that it will receive events from this
	 * communication facade.
	 *
	 * @param listener
	 *            The listener to be registered. If it is already registered, this
	 *            call has no effect.
	 */
	public void register(CommunicationListener listener) {
		listeners.add(listener);
	}

	/**
	 * Communicates the indicated message.
	 *
	 * @param message
	 *            The message to communicate.
	 */
	public void sendMessage(String message) {
		display.display(message);
	}

	private void notifySelected(Product pk) {
		for(CommunicationListener listener : listeners)
			listener.selected(this, pk);
	}
}
