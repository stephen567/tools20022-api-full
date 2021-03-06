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

import com.tools20022.metamodel.ext.DTCCSynonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max8Text;
import com.tools20022.repository.datatype.PhoneNumber;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PartyIdentificationSD4;
import com.tools20022.repository.msg.PostalAddress1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information regarding the existing agent component.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD2#mmPlaceAndName
 * PartyIdentificationSD2.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD2#mmAgentIdentification
 * PartyIdentificationSD2.mmAgentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD2#mmAgentTelephoneNumber
 * PartyIdentificationSD2.mmAgentTelephoneNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD2#mmContactInformation
 * PartyIdentificationSD2.mmContactInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD2#mmAgentEmailAddress
 * PartyIdentificationSD2.mmAgentEmailAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD2#mmAgentAddress
 * PartyIdentificationSD2.mmAgentAddress}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PartyIdentificationSD2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding the existing agent component."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAgentExtensionRule#forPartyIdentificationSD2
 * ConstraintAgentExtensionRule.forPartyIdentificationSD2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentificationSD6
 * PartyIdentificationSD6}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PartyIdentificationSD2", propOrder = {"placeAndName", "agentIdentification", "agentTelephoneNumber", "contactInformation", "agentEmailAddress", "agentAddress"})
public class PartyIdentificationSD2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm", required = true)
	protected Max350Text placeAndName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD2
	 * PartyIdentificationSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "xPath to the element that is being extended."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD6#mmPlaceAndName
	 * PartyIdentificationSD6.mmPlaceAndName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyIdentificationSD2, Max350Text> mmPlaceAndName = new MMMessageAttribute<PartyIdentificationSD2, Max350Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentificationSD2.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			nextVersions_lazy = () -> Arrays.asList(PartyIdentificationSD6.mmPlaceAndName);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(PartyIdentificationSD2 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(PartyIdentificationSD2 obj, Max350Text value) {
			obj.setPlaceAndName(value);
		}
	};
	@XmlElement(name = "AgtId")
	protected Max8Text agentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max8Text
	 * Max8Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD2
	 * PartyIdentificationSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgtId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "DTC agent identification number."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Agent ID</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD6#mmAgentIdentification
	 * PartyIdentificationSD6.mmAgentIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyIdentificationSD2, Optional<Max8Text>> mmAgentIdentification = new MMMessageAttribute<PartyIdentificationSD2, Optional<Max8Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentificationSD2.mmObject();
			isDerived = false;
			xmlTag = "AgtId";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Agent ID"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentIdentification";
			definition = "DTC agent identification number.";
			nextVersions_lazy = () -> Arrays.asList(PartyIdentificationSD6.mmAgentIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max8Text.mmObject();
		}

		@Override
		public Optional<Max8Text> getValue(PartyIdentificationSD2 obj) {
			return obj.getAgentIdentification();
		}

		@Override
		public void setValue(PartyIdentificationSD2 obj, Optional<Max8Text> value) {
			obj.setAgentIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "AgtTelNb")
	protected PhoneNumber agentTelephoneNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.PhoneNumber
	 * PhoneNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD2
	 * PartyIdentificationSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgtTelNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentTelephoneNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Telephone number of the agent."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Agent Telephone Number</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD6#mmAgentTelephoneNumber
	 * PartyIdentificationSD6.mmAgentTelephoneNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyIdentificationSD2, Optional<PhoneNumber>> mmAgentTelephoneNumber = new MMMessageAttribute<PartyIdentificationSD2, Optional<PhoneNumber>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentificationSD2.mmObject();
			isDerived = false;
			xmlTag = "AgtTelNb";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Agent Telephone Number"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentTelephoneNumber";
			definition = "Telephone number of the agent.";
			nextVersions_lazy = () -> Arrays.asList(PartyIdentificationSD6.mmAgentTelephoneNumber);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PhoneNumber.mmObject();
		}

		@Override
		public Optional<PhoneNumber> getValue(PartyIdentificationSD2 obj) {
			return obj.getAgentTelephoneNumber();
		}

		@Override
		public void setValue(PartyIdentificationSD2 obj, Optional<PhoneNumber> value) {
			obj.setAgentTelephoneNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "CtctInf")
	protected PartyIdentificationSD4 contactInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentificationSD4
	 * PartyIdentificationSD4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD2
	 * PartyIdentificationSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtctInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agent designated contact information details."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Contact Information Address</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD6#mmContactInformation
	 * PartyIdentificationSD6.mmContactInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PartyIdentificationSD2, Optional<PartyIdentificationSD4>> mmContactInformation = new MMMessageAssociationEnd<PartyIdentificationSD2, Optional<PartyIdentificationSD4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentificationSD2.mmObject();
			isDerived = false;
			xmlTag = "CtctInf";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Contact Information Address"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactInformation";
			definition = "Agent designated contact information details.";
			nextVersions_lazy = () -> Arrays.asList(PartyIdentificationSD6.mmContactInformation);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentificationSD4.mmObject();
		}

		@Override
		public Optional<PartyIdentificationSD4> getValue(PartyIdentificationSD2 obj) {
			return obj.getContactInformation();
		}

		@Override
		public void setValue(PartyIdentificationSD2 obj, Optional<PartyIdentificationSD4> value) {
			obj.setContactInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "AgtEmailAdr")
	protected Max256Text agentEmailAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD2
	 * PartyIdentificationSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgtEmailAdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentEmailAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Email address of the event agent."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Agent E-Mail</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD6#mmAgentEmailAddress
	 * PartyIdentificationSD6.mmAgentEmailAddress}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyIdentificationSD2, Optional<Max256Text>> mmAgentEmailAddress = new MMMessageAttribute<PartyIdentificationSD2, Optional<Max256Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentificationSD2.mmObject();
			isDerived = false;
			xmlTag = "AgtEmailAdr";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Agent E-Mail"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentEmailAddress";
			definition = "Email address of the event agent.";
			nextVersions_lazy = () -> Arrays.asList(PartyIdentificationSD6.mmAgentEmailAddress);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max256Text.mmObject();
		}

		@Override
		public Optional<Max256Text> getValue(PartyIdentificationSD2 obj) {
			return obj.getAgentEmailAddress();
		}

		@Override
		public void setValue(PartyIdentificationSD2 obj, Optional<Max256Text> value) {
			obj.setAgentEmailAddress(value.orElse(null));
		}
	};
	@XmlElement(name = "AgtAdr")
	protected PostalAddress1 agentAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.PostalAddress1
	 * PostalAddress1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD2
	 * PartyIdentificationSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgtAdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event agent address."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Agent Address</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD6#mmAgentAddress
	 * PartyIdentificationSD6.mmAgentAddress}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyIdentificationSD2, Optional<PostalAddress1>> mmAgentAddress = new MMMessageAttribute<PartyIdentificationSD2, Optional<PostalAddress1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentificationSD2.mmObject();
			isDerived = false;
			xmlTag = "AgtAdr";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Agent Address"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentAddress";
			definition = "Event agent address.";
			nextVersions_lazy = () -> Arrays.asList(PartyIdentificationSD6.mmAgentAddress);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PostalAddress1.mmObject();
		}

		@Override
		public Optional<PostalAddress1> getValue(PartyIdentificationSD2 obj) {
			return obj.getAgentAddress();
		}

		@Override
		public void setValue(PartyIdentificationSD2 obj, Optional<PostalAddress1> value) {
			obj.setAgentAddress(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartyIdentificationSD2.mmPlaceAndName, com.tools20022.repository.msg.PartyIdentificationSD2.mmAgentIdentification,
						com.tools20022.repository.msg.PartyIdentificationSD2.mmAgentTelephoneNumber, com.tools20022.repository.msg.PartyIdentificationSD2.mmContactInformation,
						com.tools20022.repository.msg.PartyIdentificationSD2.mmAgentEmailAddress, com.tools20022.repository.msg.PartyIdentificationSD2.mmAgentAddress);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAgentExtensionRule.forPartyIdentificationSD2);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyIdentificationSD2";
				definition = "Provides additional information regarding the existing agent component.";
				nextVersions_lazy = () -> Arrays.asList(PartyIdentificationSD6.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public PartyIdentificationSD2 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = Objects.requireNonNull(placeAndName);
		return this;
	}

	public Optional<Max8Text> getAgentIdentification() {
		return agentIdentification == null ? Optional.empty() : Optional.of(agentIdentification);
	}

	public PartyIdentificationSD2 setAgentIdentification(Max8Text agentIdentification) {
		this.agentIdentification = agentIdentification;
		return this;
	}

	public Optional<PhoneNumber> getAgentTelephoneNumber() {
		return agentTelephoneNumber == null ? Optional.empty() : Optional.of(agentTelephoneNumber);
	}

	public PartyIdentificationSD2 setAgentTelephoneNumber(PhoneNumber agentTelephoneNumber) {
		this.agentTelephoneNumber = agentTelephoneNumber;
		return this;
	}

	public Optional<PartyIdentificationSD4> getContactInformation() {
		return contactInformation == null ? Optional.empty() : Optional.of(contactInformation);
	}

	public PartyIdentificationSD2 setContactInformation(PartyIdentificationSD4 contactInformation) {
		this.contactInformation = contactInformation;
		return this;
	}

	public Optional<Max256Text> getAgentEmailAddress() {
		return agentEmailAddress == null ? Optional.empty() : Optional.of(agentEmailAddress);
	}

	public PartyIdentificationSD2 setAgentEmailAddress(Max256Text agentEmailAddress) {
		this.agentEmailAddress = agentEmailAddress;
		return this;
	}

	public Optional<PostalAddress1> getAgentAddress() {
		return agentAddress == null ? Optional.empty() : Optional.of(agentAddress);
	}

	public PartyIdentificationSD2 setAgentAddress(PostalAddress1 agentAddress) {
		this.agentAddress = agentAddress;
		return this;
	}
}