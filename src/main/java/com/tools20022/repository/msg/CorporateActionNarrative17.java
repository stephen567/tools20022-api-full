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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.UpdatedAdditionalInformation4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information such as the taxation conditions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative17#mmAdditionalText
 * CorporateActionNarrative17.mmAdditionalText}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative17#mmNarrativeVersion
 * CorporateActionNarrative17.mmNarrativeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative17#mmInformationConditions
 * CorporateActionNarrative17.mmInformationConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative17#mmInformationToComplyWith
 * CorporateActionNarrative17.mmInformationToComplyWith}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative17#mmTaxationConditions
 * CorporateActionNarrative17.mmTaxationConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative17#mmDisclaimer
 * CorporateActionNarrative17.mmDisclaimer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative17#mmPartyContactNarrative
 * CorporateActionNarrative17.mmPartyContactNarrative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative17#mmDeclarationDetails
 * CorporateActionNarrative17.mmDeclarationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative17#mmRegistrationDetails
 * CorporateActionNarrative17.mmRegistrationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative17#mmBasketOrIndexInformation
 * CorporateActionNarrative17.mmBasketOrIndexInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionEvent
 * CorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionNarrative17"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information such as the taxation conditions."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInforrmationRule#forCorporateActionNarrative17
 * ConstraintAdditionalInforrmationRule.forCorporateActionNarrative17}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionNarrative17", propOrder = {"additionalText", "narrativeVersion", "informationConditions", "informationToComplyWith", "taxationConditions", "disclaimer", "partyContactNarrative", "declarationDetails",
		"registrationDetails", "basketOrIndexInformation"})
public class CorporateActionNarrative17 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AddtlTxt")
	protected UpdatedAdditionalInformation4 additionalText;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation4
	 * UpdatedAdditionalInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative17
	 * CorporateActionNarrative17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlTxt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalText"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information or specifies in more detail the content of a message. This field may only be used when the information to be transmitted, cannot be coded."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::ADTX</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionNarrative17, Optional<UpdatedAdditionalInformation4>> mmAdditionalText = new MMMessageAssociationEnd<CorporateActionNarrative17, Optional<UpdatedAdditionalInformation4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative17.mmObject();
			isDerived = false;
			xmlTag = "AddtlTxt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::ADTX"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalText";
			definition = "Provides additional information or specifies in more detail the content of a message. This field may only be used when the information to be transmitted, cannot be coded.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UpdatedAdditionalInformation4.mmObject();
		}

		@Override
		public Optional<UpdatedAdditionalInformation4> getValue(CorporateActionNarrative17 obj) {
			return obj.getAdditionalText();
		}

		@Override
		public void setValue(CorporateActionNarrative17 obj, Optional<UpdatedAdditionalInformation4> value) {
			obj.setAdditionalText(value.orElse(null));
		}
	};
	@XmlElement(name = "NrrtvVrsn")
	protected UpdatedAdditionalInformation4 narrativeVersion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation4
	 * UpdatedAdditionalInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative17
	 * CorporateActionNarrative17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NrrtvVrsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NarrativeVersion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information that can be ignored for automated processing; - reiteration of information that has been included within structured fields of this message, - or narrative information not needed for automatic processing."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::TXNR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionNarrative17, Optional<UpdatedAdditionalInformation4>> mmNarrativeVersion = new MMMessageAssociationEnd<CorporateActionNarrative17, Optional<UpdatedAdditionalInformation4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative17.mmObject();
			isDerived = false;
			xmlTag = "NrrtvVrsn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::TXNR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NarrativeVersion";
			definition = "Provides information that can be ignored for automated processing; - reiteration of information that has been included within structured fields of this message, - or narrative information not needed for automatic processing.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UpdatedAdditionalInformation4.mmObject();
		}

		@Override
		public Optional<UpdatedAdditionalInformation4> getValue(CorporateActionNarrative17 obj) {
			return obj.getNarrativeVersion();
		}

		@Override
		public void setValue(CorporateActionNarrative17 obj, Optional<UpdatedAdditionalInformation4> value) {
			obj.setNarrativeVersion(value.orElse(null));
		}
	};
	@XmlElement(name = "InfConds")
	protected UpdatedAdditionalInformation4 informationConditions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation4
	 * UpdatedAdditionalInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmInformationConditions
	 * CorporateActionEvent.mmInformationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative17
	 * CorporateActionNarrative17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InfConds"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformationConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides conditional information related to the event, for example, an offer is subject to 50 percent acceptance, the offeror allows the securities holder to set some conditions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::INCO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionNarrative17, Optional<UpdatedAdditionalInformation4>> mmInformationConditions = new MMMessageAssociationEnd<CorporateActionNarrative17, Optional<UpdatedAdditionalInformation4>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmInformationConditions;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative17.mmObject();
			isDerived = false;
			xmlTag = "InfConds";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::INCO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InformationConditions";
			definition = "Provides conditional information related to the event, for example, an offer is subject to 50 percent acceptance, the offeror allows the securities holder to set some conditions.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UpdatedAdditionalInformation4.mmObject();
		}

		@Override
		public Optional<UpdatedAdditionalInformation4> getValue(CorporateActionNarrative17 obj) {
			return obj.getInformationConditions();
		}

		@Override
		public void setValue(CorporateActionNarrative17 obj, Optional<UpdatedAdditionalInformation4> value) {
			obj.setInformationConditions(value.orElse(null));
		}
	};
	@XmlElement(name = "InfToCmplyWth")
	protected UpdatedAdditionalInformation4 informationToComplyWith;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation4
	 * UpdatedAdditionalInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmInformationToComplyWith
	 * BiddingConditions.mmInformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative17
	 * CorporateActionNarrative17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InfToCmplyWth"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformationToComplyWith"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information conditions to the account owner that are to be complied with, for example, not open to US/Canadian residents, Qualified Institutional Buyers (QIB) or SIL (Sophisticated Investor Letter) to be provided."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::COMP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionNarrative17, Optional<UpdatedAdditionalInformation4>> mmInformationToComplyWith = new MMMessageAssociationEnd<CorporateActionNarrative17, Optional<UpdatedAdditionalInformation4>>() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmInformationToComplyWith;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative17.mmObject();
			isDerived = false;
			xmlTag = "InfToCmplyWth";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::COMP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InformationToComplyWith";
			definition = "Provides information conditions to the account owner that are to be complied with, for example, not open to US/Canadian residents, Qualified Institutional Buyers (QIB) or SIL (Sophisticated Investor Letter) to be provided.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UpdatedAdditionalInformation4.mmObject();
		}

		@Override
		public Optional<UpdatedAdditionalInformation4> getValue(CorporateActionNarrative17 obj) {
			return obj.getInformationToComplyWith();
		}

		@Override
		public void setValue(CorporateActionNarrative17 obj, Optional<UpdatedAdditionalInformation4> value) {
			obj.setInformationToComplyWith(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxtnConds")
	protected UpdatedAdditionalInformation4 taxationConditions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation4
	 * UpdatedAdditionalInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmTaxationConditions
	 * Tax.mmTaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative17
	 * CorporateActionNarrative17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxtnConds"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxationConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides taxation conditions that cannot be included within the structured fields of this message and has not been mentioned in the Service Level Agreement (SLA)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::TAXE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionNarrative17, Optional<UpdatedAdditionalInformation4>> mmTaxationConditions = new MMMessageAssociationEnd<CorporateActionNarrative17, Optional<UpdatedAdditionalInformation4>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmTaxationConditions;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative17.mmObject();
			isDerived = false;
			xmlTag = "TaxtnConds";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::TAXE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxationConditions";
			definition = "Provides taxation conditions that cannot be included within the structured fields of this message and has not been mentioned in the Service Level Agreement (SLA).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UpdatedAdditionalInformation4.mmObject();
		}

		@Override
		public Optional<UpdatedAdditionalInformation4> getValue(CorporateActionNarrative17 obj) {
			return obj.getTaxationConditions();
		}

		@Override
		public void setValue(CorporateActionNarrative17 obj, Optional<UpdatedAdditionalInformation4> value) {
			obj.setTaxationConditions(value.orElse(null));
		}
	};
	@XmlElement(name = "Dsclmr")
	protected UpdatedAdditionalInformation4 disclaimer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation4
	 * UpdatedAdditionalInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative17
	 * CorporateActionNarrative17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dsclmr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Disclaimer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides a disclaimer relative to the information provided in the message. It may be ignored for automated processing."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::DISC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionNarrative17, Optional<UpdatedAdditionalInformation4>> mmDisclaimer = new MMMessageAssociationEnd<CorporateActionNarrative17, Optional<UpdatedAdditionalInformation4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative17.mmObject();
			isDerived = false;
			xmlTag = "Dsclmr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::DISC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Disclaimer";
			definition = "Provides a disclaimer relative to the information provided in the message. It may be ignored for automated processing.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UpdatedAdditionalInformation4.mmObject();
		}

		@Override
		public Optional<UpdatedAdditionalInformation4> getValue(CorporateActionNarrative17 obj) {
			return obj.getDisclaimer();
		}

		@Override
		public void setValue(CorporateActionNarrative17 obj, Optional<UpdatedAdditionalInformation4> value) {
			obj.setDisclaimer(value.orElse(null));
		}
	};
	@XmlElement(name = "PtyCtctNrrtv")
	protected UpdatedAdditionalInformation4 partyContactNarrative;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation4
	 * UpdatedAdditionalInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Role#mmContactPersonRole
	 * Role.mmContactPersonRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative17
	 * CorporateActionNarrative17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtyCtctNrrtv"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyContactNarrative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information regarding the party, for example, the contact unit or person responsible for the transaction identified in the message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::PACO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionNarrative17, Optional<UpdatedAdditionalInformation4>> mmPartyContactNarrative = new MMMessageAssociationEnd<CorporateActionNarrative17, Optional<UpdatedAdditionalInformation4>>() {
		{
			businessElementTrace_lazy = () -> Role.mmContactPersonRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative17.mmObject();
			isDerived = false;
			xmlTag = "PtyCtctNrrtv";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::PACO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyContactNarrative";
			definition = "Provides additional information regarding the party, for example, the contact unit or person responsible for the transaction identified in the message.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UpdatedAdditionalInformation4.mmObject();
		}

		@Override
		public Optional<UpdatedAdditionalInformation4> getValue(CorporateActionNarrative17 obj) {
			return obj.getPartyContactNarrative();
		}

		@Override
		public void setValue(CorporateActionNarrative17 obj, Optional<UpdatedAdditionalInformation4> value) {
			obj.setPartyContactNarrative(value.orElse(null));
		}
	};
	@XmlElement(name = "DclrtnDtls")
	protected UpdatedAdditionalInformation4 declarationDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation4
	 * UpdatedAdditionalInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmDeclarationDetails
	 * Security.mmDeclarationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative17
	 * CorporateActionNarrative17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DclrtnDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclarationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides declaration details narrative relative to the financial instrument, for example, beneficial ownership."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::DECL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionNarrative17, Optional<UpdatedAdditionalInformation4>> mmDeclarationDetails = new MMMessageAssociationEnd<CorporateActionNarrative17, Optional<UpdatedAdditionalInformation4>>() {
		{
			businessElementTrace_lazy = () -> Security.mmDeclarationDetails;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative17.mmObject();
			isDerived = false;
			xmlTag = "DclrtnDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::DECL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclarationDetails";
			definition = "Provides declaration details narrative relative to the financial instrument, for example, beneficial ownership.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UpdatedAdditionalInformation4.mmObject();
		}

		@Override
		public Optional<UpdatedAdditionalInformation4> getValue(CorporateActionNarrative17 obj) {
			return obj.getDeclarationDetails();
		}

		@Override
		public void setValue(CorporateActionNarrative17 obj, Optional<UpdatedAdditionalInformation4> value) {
			obj.setDeclarationDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "RegnDtls")
	protected UpdatedAdditionalInformation4 registrationDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation4
	 * UpdatedAdditionalInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmRegistrationDetails
	 * CorporateActionEvent.mmRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative17
	 * CorporateActionNarrative17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegnDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information required for the registration."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::REGI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionNarrative17, Optional<UpdatedAdditionalInformation4>> mmRegistrationDetails = new MMMessageAssociationEnd<CorporateActionNarrative17, Optional<UpdatedAdditionalInformation4>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmRegistrationDetails;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative17.mmObject();
			isDerived = false;
			xmlTag = "RegnDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::REGI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationDetails";
			definition = "Provides information required for the registration.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UpdatedAdditionalInformation4.mmObject();
		}

		@Override
		public Optional<UpdatedAdditionalInformation4> getValue(CorporateActionNarrative17 obj) {
			return obj.getRegistrationDetails();
		}

		@Override
		public void setValue(CorporateActionNarrative17 obj, Optional<UpdatedAdditionalInformation4> value) {
			obj.setRegistrationDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "BsktOrIndxInf")
	protected UpdatedAdditionalInformation4 basketOrIndexInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation4
	 * UpdatedAdditionalInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmBasketOrIndexInformation
	 * CorporateActionEvent.mmBasketOrIndexInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative17
	 * CorporateActionNarrative17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BsktOrIndxInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BasketOrIndexInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information on the basket or index underlying a security, for example a warrant."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::BAIN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionNarrative17, Optional<UpdatedAdditionalInformation4>> mmBasketOrIndexInformation = new MMMessageAssociationEnd<CorporateActionNarrative17, Optional<UpdatedAdditionalInformation4>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmBasketOrIndexInformation;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative17.mmObject();
			isDerived = false;
			xmlTag = "BsktOrIndxInf";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::BAIN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BasketOrIndexInformation";
			definition = "Provides additional information on the basket or index underlying a security, for example a warrant.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UpdatedAdditionalInformation4.mmObject();
		}

		@Override
		public Optional<UpdatedAdditionalInformation4> getValue(CorporateActionNarrative17 obj) {
			return obj.getBasketOrIndexInformation();
		}

		@Override
		public void setValue(CorporateActionNarrative17 obj, Optional<UpdatedAdditionalInformation4> value) {
			obj.setBasketOrIndexInformation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionNarrative17.mmAdditionalText, com.tools20022.repository.msg.CorporateActionNarrative17.mmNarrativeVersion,
						com.tools20022.repository.msg.CorporateActionNarrative17.mmInformationConditions, com.tools20022.repository.msg.CorporateActionNarrative17.mmInformationToComplyWith,
						com.tools20022.repository.msg.CorporateActionNarrative17.mmTaxationConditions, com.tools20022.repository.msg.CorporateActionNarrative17.mmDisclaimer,
						com.tools20022.repository.msg.CorporateActionNarrative17.mmPartyContactNarrative, com.tools20022.repository.msg.CorporateActionNarrative17.mmDeclarationDetails,
						com.tools20022.repository.msg.CorporateActionNarrative17.mmRegistrationDetails, com.tools20022.repository.msg.CorporateActionNarrative17.mmBasketOrIndexInformation);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInforrmationRule.forCorporateActionNarrative17);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionNarrative17";
				definition = "Provides additional information such as the taxation conditions.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<UpdatedAdditionalInformation4> getAdditionalText() {
		return additionalText == null ? Optional.empty() : Optional.of(additionalText);
	}

	public CorporateActionNarrative17 setAdditionalText(UpdatedAdditionalInformation4 additionalText) {
		this.additionalText = additionalText;
		return this;
	}

	public Optional<UpdatedAdditionalInformation4> getNarrativeVersion() {
		return narrativeVersion == null ? Optional.empty() : Optional.of(narrativeVersion);
	}

	public CorporateActionNarrative17 setNarrativeVersion(UpdatedAdditionalInformation4 narrativeVersion) {
		this.narrativeVersion = narrativeVersion;
		return this;
	}

	public Optional<UpdatedAdditionalInformation4> getInformationConditions() {
		return informationConditions == null ? Optional.empty() : Optional.of(informationConditions);
	}

	public CorporateActionNarrative17 setInformationConditions(UpdatedAdditionalInformation4 informationConditions) {
		this.informationConditions = informationConditions;
		return this;
	}

	public Optional<UpdatedAdditionalInformation4> getInformationToComplyWith() {
		return informationToComplyWith == null ? Optional.empty() : Optional.of(informationToComplyWith);
	}

	public CorporateActionNarrative17 setInformationToComplyWith(UpdatedAdditionalInformation4 informationToComplyWith) {
		this.informationToComplyWith = informationToComplyWith;
		return this;
	}

	public Optional<UpdatedAdditionalInformation4> getTaxationConditions() {
		return taxationConditions == null ? Optional.empty() : Optional.of(taxationConditions);
	}

	public CorporateActionNarrative17 setTaxationConditions(UpdatedAdditionalInformation4 taxationConditions) {
		this.taxationConditions = taxationConditions;
		return this;
	}

	public Optional<UpdatedAdditionalInformation4> getDisclaimer() {
		return disclaimer == null ? Optional.empty() : Optional.of(disclaimer);
	}

	public CorporateActionNarrative17 setDisclaimer(UpdatedAdditionalInformation4 disclaimer) {
		this.disclaimer = disclaimer;
		return this;
	}

	public Optional<UpdatedAdditionalInformation4> getPartyContactNarrative() {
		return partyContactNarrative == null ? Optional.empty() : Optional.of(partyContactNarrative);
	}

	public CorporateActionNarrative17 setPartyContactNarrative(UpdatedAdditionalInformation4 partyContactNarrative) {
		this.partyContactNarrative = partyContactNarrative;
		return this;
	}

	public Optional<UpdatedAdditionalInformation4> getDeclarationDetails() {
		return declarationDetails == null ? Optional.empty() : Optional.of(declarationDetails);
	}

	public CorporateActionNarrative17 setDeclarationDetails(UpdatedAdditionalInformation4 declarationDetails) {
		this.declarationDetails = declarationDetails;
		return this;
	}

	public Optional<UpdatedAdditionalInformation4> getRegistrationDetails() {
		return registrationDetails == null ? Optional.empty() : Optional.of(registrationDetails);
	}

	public CorporateActionNarrative17 setRegistrationDetails(UpdatedAdditionalInformation4 registrationDetails) {
		this.registrationDetails = registrationDetails;
		return this;
	}

	public Optional<UpdatedAdditionalInformation4> getBasketOrIndexInformation() {
		return basketOrIndexInformation == null ? Optional.empty() : Optional.of(basketOrIndexInformation);
	}

	public CorporateActionNarrative17 setBasketOrIndexInformation(UpdatedAdditionalInformation4 basketOrIndexInformation) {
		this.basketOrIndexInformation = basketOrIndexInformation;
		return this;
	}
}