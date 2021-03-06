/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.FinancialInstrumentQuantitySearch1Choice;
import com.tools20022.repository.entity.SecuritiesQuantity;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.FinancialInstrumentQuantitySearch1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of format for the quantity.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.QuantitySearch1Choice#mmQuantity
 * QuantitySearch1Choice.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.QuantitySearch1Choice#mmOriginalAndCurrentFace
 * QuantitySearch1Choice.mmOriginalAndCurrentFace}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
 * SecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "QuantitySearch1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of format for the quantity."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "QuantitySearch1Choice", propOrder = {"quantity", "originalAndCurrentFace"})
public class QuantitySearch1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Qty", required = true)
	protected FinancialInstrumentQuantitySearch1Choice quantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantitySearch1Choice
	 * FinancialInstrumentQuantitySearch1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.QuantitySearch1Choice
	 * QuantitySearch1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Qty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of financial instrument in units, original face amount or current face amount."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<QuantitySearch1Choice, FinancialInstrumentQuantitySearch1Choice> mmQuantity = new MMMessageAssociationEnd<QuantitySearch1Choice, FinancialInstrumentQuantitySearch1Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.QuantitySearch1Choice.mmObject();
			isDerived = false;
			xmlTag = "Qty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quantity";
			definition = "Quantity of financial instrument in units, original face amount or current face amount.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantitySearch1Choice.mmObject();
		}

		@Override
		public FinancialInstrumentQuantitySearch1Choice getValue(QuantitySearch1Choice obj) {
			return obj.getQuantity();
		}

		@Override
		public void setValue(QuantitySearch1Choice obj, FinancialInstrumentQuantitySearch1Choice value) {
			obj.setQuantity(value);
		}
	};
	@XmlElement(name = "OrgnlAndCurFace", required = true)
	protected FinancialInstrumentQuantitySearch1 originalAndCurrentFace;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantitySearch1
	 * FinancialInstrumentQuantitySearch1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.QuantitySearch1Choice
	 * QuantitySearch1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlAndCurFace"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalAndCurrentFace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original and current value of an asset-back instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<QuantitySearch1Choice, FinancialInstrumentQuantitySearch1> mmOriginalAndCurrentFace = new MMMessageAssociationEnd<QuantitySearch1Choice, FinancialInstrumentQuantitySearch1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.QuantitySearch1Choice.mmObject();
			isDerived = false;
			xmlTag = "OrgnlAndCurFace";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalAndCurrentFace";
			definition = "Original and current value of an asset-back instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantitySearch1.mmObject();
		}

		@Override
		public FinancialInstrumentQuantitySearch1 getValue(QuantitySearch1Choice obj) {
			return obj.getOriginalAndCurrentFace();
		}

		@Override
		public void setValue(QuantitySearch1Choice obj, FinancialInstrumentQuantitySearch1 value) {
			obj.setOriginalAndCurrentFace(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.QuantitySearch1Choice.mmQuantity, com.tools20022.repository.choice.QuantitySearch1Choice.mmOriginalAndCurrentFace);
				trace_lazy = () -> SecuritiesQuantity.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "QuantitySearch1Choice";
				definition = "Choice of format for the quantity.";
			}
		});
		return mmObject_lazy.get();
	}

	public FinancialInstrumentQuantitySearch1Choice getQuantity() {
		return quantity;
	}

	public QuantitySearch1Choice setQuantity(FinancialInstrumentQuantitySearch1Choice quantity) {
		this.quantity = Objects.requireNonNull(quantity);
		return this;
	}

	public FinancialInstrumentQuantitySearch1 getOriginalAndCurrentFace() {
		return originalAndCurrentFace;
	}

	public QuantitySearch1Choice setOriginalAndCurrentFace(FinancialInstrumentQuantitySearch1 originalAndCurrentFace) {
		this.originalAndCurrentFace = Objects.requireNonNull(originalAndCurrentFace);
		return this;
	}
}