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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.SuspendedStatusReason3Code;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification1;
import com.tools20022.repository.msg.SuspendedStatusReason2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of formats for a suspended status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SuspendedStatusReason5Choice#mmCode
 * SuspendedStatusReason5Choice.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SuspendedStatusReason5Choice#mmProprietary
 * SuspendedStatusReason5Choice.mmProprietary}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SuspendedStatusReason5Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of formats for a suspended status."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SuspendedStatusReason2
 * SuspendedStatusReason2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SuspendedStatusReason5Choice", propOrder = {"code", "proprietary"})
public class SuspendedStatusReason5Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Cd", required = true)
	protected SuspendedStatusReason3Code code;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SuspendedStatusReason3Code
	 * SuspendedStatusReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SuspendedStatusReason5Choice
	 * SuspendedStatusReason5Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Code"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Suspended reason expressed as a code."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.ConditionallyAcceptedStatusReason3Choice#mmCode
	 * ConditionallyAcceptedStatusReason3Choice.mmCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SuspendedStatusReason5Choice, SuspendedStatusReason3Code> mmCode = new MMMessageAttribute<SuspendedStatusReason5Choice, SuspendedStatusReason3Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.SuspendedStatusReason5Choice.mmObject();
			isDerived = false;
			xmlTag = "Cd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Code";
			definition = "Suspended reason expressed as a code.";
			previousVersion_lazy = () -> ConditionallyAcceptedStatusReason3Choice.mmCode;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SuspendedStatusReason3Code.mmObject();
		}

		@Override
		public SuspendedStatusReason3Code getValue(SuspendedStatusReason5Choice obj) {
			return obj.getCode();
		}

		@Override
		public void setValue(SuspendedStatusReason5Choice obj, SuspendedStatusReason3Code value) {
			obj.setCode(value);
		}
	};
	@XmlElement(name = "Prtry", required = true)
	protected GenericIdentification1 proprietary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.GenericIdentification1
	 * GenericIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SuspendedStatusReason5Choice
	 * SuspendedStatusReason5Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Suspended reason expressed as a proprietary code."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.ConditionallyAcceptedStatusReason3Choice#mmProprietary
	 * ConditionallyAcceptedStatusReason3Choice.mmProprietary}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SuspendedStatusReason5Choice, GenericIdentification1> mmProprietary = new MMMessageAssociationEnd<SuspendedStatusReason5Choice, GenericIdentification1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.SuspendedStatusReason5Choice.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Suspended reason expressed as a proprietary code.";
			previousVersion_lazy = () -> ConditionallyAcceptedStatusReason3Choice.mmProprietary;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification1.mmObject();
		}

		@Override
		public GenericIdentification1 getValue(SuspendedStatusReason5Choice obj) {
			return obj.getProprietary();
		}

		@Override
		public void setValue(SuspendedStatusReason5Choice obj, GenericIdentification1 value) {
			obj.setProprietary(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SuspendedStatusReason5Choice.mmCode, com.tools20022.repository.choice.SuspendedStatusReason5Choice.mmProprietary);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SuspendedStatusReason5Choice";
				definition = "Choice of formats for a suspended status.";
				previousVersion_lazy = () -> SuspendedStatusReason2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public SuspendedStatusReason3Code getCode() {
		return code;
	}

	public SuspendedStatusReason5Choice setCode(SuspendedStatusReason3Code code) {
		this.code = Objects.requireNonNull(code);
		return this;
	}

	public GenericIdentification1 getProprietary() {
		return proprietary;
	}

	public SuspendedStatusReason5Choice setProprietary(GenericIdentification1 proprietary) {
		this.proprietary = Objects.requireNonNull(proprietary);
		return this;
	}
}