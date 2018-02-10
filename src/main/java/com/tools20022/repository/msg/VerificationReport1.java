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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.acmt.IdentificationVerificationReportV01;
import com.tools20022.repository.choice.VerificationReason1Choice;
import com.tools20022.repository.datatype.IdentificationVerificationIndicator;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements used to provide information concerning the verification of
 * identification data for which verification was requested.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VerificationReport1#mmOriginalIdentification
 * VerificationReport1.mmOriginalIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VerificationReport1#mmVerification
 * VerificationReport1.mmVerification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.VerificationReport1#mmReason
 * VerificationReport1.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VerificationReport1#mmOriginalPartyAndAccountIdentification
 * VerificationReport1.mmOriginalPartyAndAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VerificationReport1#mmUpdatedPartyAndAccountIdentification
 * VerificationReport1.mmUpdatedPartyAndAccountIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.IdentificationVerificationReportV01#mmReport
 * IdentificationVerificationReportV01.mmReport}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "VerificationReport1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements used  to provide information concerning the verification of identification data for which verification was requested."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "VerificationReport1", propOrder = {"originalIdentification", "verification", "reason", "originalPartyAndAccountIdentification", "updatedPartyAndAccountIdentification"})
public class VerificationReport1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OrgnlId", required = true)
	protected Max35Text originalIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.VerificationReport1
	 * VerificationReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by a sending party, to unambiguously identify the party and account identification information group within the original message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.VerificationReport1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalIdentification";
			definition = "Unique identification, as assigned by a sending party, to unambiguously identify the party and account identification information group within the original message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "Vrfctn", required = true)
	protected IdentificationVerificationIndicator verification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.IdentificationVerificationIndicator
	 * IdentificationVerificationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VerificationReport1
	 * VerificationReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Vrfctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Verification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies whether the party and/or account information received is correct."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVerification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.VerificationReport1.mmObject();
			isDerived = false;
			xmlTag = "Vrfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Verification";
			definition = "Identifies whether the party and/or account information received is correct.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> IdentificationVerificationIndicator.mmObject();
		}
	};
	@XmlElement(name = "Rsn")
	protected VerificationReason1Choice reason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.VerificationReason1Choice
	 * VerificationReason1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VerificationReport1
	 * VerificationReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the verified identification information is incorrect."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReason = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.VerificationReport1.mmObject();
			isDerived = false;
			xmlTag = "Rsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reason";
			definition = "Specifies the reason why the verified identification information is incorrect.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> VerificationReason1Choice.mmObject();
		}
	};
	@XmlElement(name = "OrgnlPtyAndAcctId")
	protected IdentificationInformation1 originalPartyAndAccountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.IdentificationInformation1
	 * IdentificationInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VerificationReport1
	 * VerificationReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlPtyAndAcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalPartyAndAccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides party and/or account identification information as given in the original message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalPartyAndAccountIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.VerificationReport1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlPtyAndAcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalPartyAndAccountIdentification";
			definition = "Provides party and/or account identification information as given in the original message.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.IdentificationInformation1.mmObject();
		}
	};
	@XmlElement(name = "UpdtdPtyAndAcctId")
	protected IdentificationInformation1 updatedPartyAndAccountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.IdentificationInformation1
	 * IdentificationInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VerificationReport1
	 * VerificationReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UpdtdPtyAndAcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UpdatedPartyAndAccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides party and/or account identification information."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUpdatedPartyAndAccountIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.VerificationReport1.mmObject();
			isDerived = false;
			xmlTag = "UpdtdPtyAndAcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpdatedPartyAndAccountIdentification";
			definition = "Provides party and/or account identification information.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.IdentificationInformation1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.VerificationReport1.mmOriginalIdentification, com.tools20022.repository.msg.VerificationReport1.mmVerification,
						com.tools20022.repository.msg.VerificationReport1.mmReason, com.tools20022.repository.msg.VerificationReport1.mmOriginalPartyAndAccountIdentification,
						com.tools20022.repository.msg.VerificationReport1.mmUpdatedPartyAndAccountIdentification);
				messageBuildingBlock_lazy = () -> Arrays.asList(IdentificationVerificationReportV01.mmReport);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "VerificationReport1";
				definition = "Set of elements used  to provide information concerning the verification of identification data for which verification was requested.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getOriginalIdentification() {
		return originalIdentification;
	}

	public VerificationReport1 setOriginalIdentification(Max35Text originalIdentification) {
		this.originalIdentification = Objects.requireNonNull(originalIdentification);
		return this;
	}

	public IdentificationVerificationIndicator getVerification() {
		return verification;
	}

	public VerificationReport1 setVerification(IdentificationVerificationIndicator verification) {
		this.verification = Objects.requireNonNull(verification);
		return this;
	}

	public Optional<VerificationReason1Choice> getReason() {
		return reason == null ? Optional.empty() : Optional.of(reason);
	}

	public VerificationReport1 setReason(VerificationReason1Choice reason) {
		this.reason = reason;
		return this;
	}

	public Optional<IdentificationInformation1> getOriginalPartyAndAccountIdentification() {
		return originalPartyAndAccountIdentification == null ? Optional.empty() : Optional.of(originalPartyAndAccountIdentification);
	}

	public VerificationReport1 setOriginalPartyAndAccountIdentification(com.tools20022.repository.msg.IdentificationInformation1 originalPartyAndAccountIdentification) {
		this.originalPartyAndAccountIdentification = originalPartyAndAccountIdentification;
		return this;
	}

	public Optional<IdentificationInformation1> getUpdatedPartyAndAccountIdentification() {
		return updatedPartyAndAccountIdentification == null ? Optional.empty() : Optional.of(updatedPartyAndAccountIdentification);
	}

	public VerificationReport1 setUpdatedPartyAndAccountIdentification(com.tools20022.repository.msg.IdentificationInformation1 updatedPartyAndAccountIdentification) {
		this.updatedPartyAndAccountIdentification = updatedPartyAndAccountIdentification;
		return this;
	}
}