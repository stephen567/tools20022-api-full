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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Profile of the customer selected by an ATM.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCustomerProfile2#mmProfileReference
 * ATMCustomerProfile2.mmProfileReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCustomerProfile2#mmCustomerIdentification
 * ATMCustomerProfile2.mmCustomerIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMCustomerProfile2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Profile of the customer selected by an ATM."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCustomerProfile3
 * ATMCustomerProfile3}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ATMCustomerProfile1
 * ATMCustomerProfile1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMCustomerProfile2", propOrder = {"profileReference", "customerIdentification"})
public class ATMCustomerProfile2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PrflRef")
	protected Max35Text profileReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCustomerProfile2
	 * ATMCustomerProfile2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrflRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProfileReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference of the customer profile."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMCustomerProfile3#mmProfileReference
	 * ATMCustomerProfile3.mmProfileReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMCustomerProfile1#mmProfileReference
	 * ATMCustomerProfile1.mmProfileReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMCustomerProfile2, Optional<Max35Text>> mmProfileReference = new MMMessageAttribute<ATMCustomerProfile2, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCustomerProfile2.mmObject();
			isDerived = false;
			xmlTag = "PrflRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProfileReference";
			definition = "Reference of the customer profile.";
			nextVersions_lazy = () -> Arrays.asList(ATMCustomerProfile3.mmProfileReference);
			previousVersion_lazy = () -> ATMCustomerProfile1.mmProfileReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ATMCustomerProfile2 obj) {
			return obj.getProfileReference();
		}

		@Override
		public void setValue(ATMCustomerProfile2 obj, Optional<Max35Text> value) {
			obj.setProfileReference(value.orElse(null));
		}
	};
	@XmlElement(name = "CstmrId")
	protected Max35Text customerIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCustomerProfile2
	 * ATMCustomerProfile2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CstmrId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the customer for the bank."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMCustomerProfile3#mmCustomerIdentification
	 * ATMCustomerProfile3.mmCustomerIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMCustomerProfile1#mmCustomerIdentification
	 * ATMCustomerProfile1.mmCustomerIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMCustomerProfile2, Optional<Max35Text>> mmCustomerIdentification = new MMMessageAttribute<ATMCustomerProfile2, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCustomerProfile2.mmObject();
			isDerived = false;
			xmlTag = "CstmrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerIdentification";
			definition = "Identification of the customer for the bank.";
			nextVersions_lazy = () -> Arrays.asList(ATMCustomerProfile3.mmCustomerIdentification);
			previousVersion_lazy = () -> ATMCustomerProfile1.mmCustomerIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ATMCustomerProfile2 obj) {
			return obj.getCustomerIdentification();
		}

		@Override
		public void setValue(ATMCustomerProfile2 obj, Optional<Max35Text> value) {
			obj.setCustomerIdentification(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMCustomerProfile2.mmProfileReference, com.tools20022.repository.msg.ATMCustomerProfile2.mmCustomerIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMCustomerProfile2";
				definition = "Profile of the customer selected by an ATM.";
				nextVersions_lazy = () -> Arrays.asList(ATMCustomerProfile3.mmObject());
				previousVersion_lazy = () -> ATMCustomerProfile1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getProfileReference() {
		return profileReference == null ? Optional.empty() : Optional.of(profileReference);
	}

	public ATMCustomerProfile2 setProfileReference(Max35Text profileReference) {
		this.profileReference = profileReference;
		return this;
	}

	public Optional<Max35Text> getCustomerIdentification() {
		return customerIdentification == null ? Optional.empty() : Optional.of(customerIdentification);
	}

	public ATMCustomerProfile2 setCustomerIdentification(Max35Text customerIdentification) {
		this.customerIdentification = customerIdentification;
		return this;
	}
}