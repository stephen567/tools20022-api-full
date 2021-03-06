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
import com.tools20022.repository.codeset.SideIndicator1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.ClearingBrokerIdentification;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the reference number assigned by the clearing broker. A distinction
 * can be made between the reference for the Central Counterparty (CCP) leg and
 * the reference for the client leg of the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingBrokerIdentification1#mmSideIndicator
 * ClearingBrokerIdentification1.mmSideIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingBrokerIdentification1#mmClearingBrokerIdentification
 * ClearingBrokerIdentification1.mmClearingBrokerIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.ClearingBrokerIdentification
 * ClearingBrokerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ClearingBrokerIdentification1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reference number assigned by the clearing broker. A distinction can be made between the reference for the Central Counterparty (CCP) leg and the reference for the client leg of the transaction."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ClearingBrokerIdentification1", propOrder = {"sideIndicator", "clearingBrokerIdentification"})
public class ClearingBrokerIdentification1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SdInd", required = true)
	protected SideIndicator1Code sideIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SideIndicator1Code
	 * SideIndicator1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ClearingBrokerIdentification#mmSideIndicator
	 * ClearingBrokerIdentification.mmSideIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ClearingBrokerIdentification1
	 * ClearingBrokerIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SdInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SideIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Distinguishes the client leg from the central counterparty (CCP) leg in the clearing broker identification."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ClearingBrokerIdentification1, SideIndicator1Code> mmSideIndicator = new MMMessageAttribute<ClearingBrokerIdentification1, SideIndicator1Code>() {
		{
			businessElementTrace_lazy = () -> ClearingBrokerIdentification.mmSideIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.ClearingBrokerIdentification1.mmObject();
			isDerived = false;
			xmlTag = "SdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SideIndicator";
			definition = "Distinguishes the client leg from the central counterparty (CCP) leg in the clearing broker identification.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SideIndicator1Code.mmObject();
		}

		@Override
		public SideIndicator1Code getValue(ClearingBrokerIdentification1 obj) {
			return obj.getSideIndicator();
		}

		@Override
		public void setValue(ClearingBrokerIdentification1 obj, SideIndicator1Code value) {
			obj.setSideIndicator(value);
		}
	};
	@XmlElement(name = "ClrBrkrId", required = true)
	protected Max35Text clearingBrokerIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ClearingBrokerIdentification#mmIdentification
	 * ClearingBrokerIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ClearingBrokerIdentification1
	 * ClearingBrokerIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrBrkrId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingBrokerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the identification assigned to the clearing broker."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ClearingBrokerIdentification1, Max35Text> mmClearingBrokerIdentification = new MMMessageAttribute<ClearingBrokerIdentification1, Max35Text>() {
		{
			businessElementTrace_lazy = () -> ClearingBrokerIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ClearingBrokerIdentification1.mmObject();
			isDerived = false;
			xmlTag = "ClrBrkrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingBrokerIdentification";
			definition = "Specifies the identification assigned to the clearing broker.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(ClearingBrokerIdentification1 obj) {
			return obj.getClearingBrokerIdentification();
		}

		@Override
		public void setValue(ClearingBrokerIdentification1 obj, Max35Text value) {
			obj.setClearingBrokerIdentification(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ClearingBrokerIdentification1.mmSideIndicator, com.tools20022.repository.msg.ClearingBrokerIdentification1.mmClearingBrokerIdentification);
				trace_lazy = () -> ClearingBrokerIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ClearingBrokerIdentification1";
				definition = "Specifies the reference number assigned by the clearing broker. A distinction can be made between the reference for the Central Counterparty (CCP) leg and the reference for the client leg of the transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public SideIndicator1Code getSideIndicator() {
		return sideIndicator;
	}

	public ClearingBrokerIdentification1 setSideIndicator(SideIndicator1Code sideIndicator) {
		this.sideIndicator = Objects.requireNonNull(sideIndicator);
		return this;
	}

	public Max35Text getClearingBrokerIdentification() {
		return clearingBrokerIdentification;
	}

	public ClearingBrokerIdentification1 setClearingBrokerIdentification(Max35Text clearingBrokerIdentification) {
		this.clearingBrokerIdentification = Objects.requireNonNull(clearingBrokerIdentification);
		return this;
	}
}