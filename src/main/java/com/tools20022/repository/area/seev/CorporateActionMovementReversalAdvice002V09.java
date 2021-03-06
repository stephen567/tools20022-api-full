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

package com.tools20022.repository.area.seev;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesEventsLatestversionsubsetvariant;
import com.tools20022.repository.choice.PartyIdentification104Choice;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.CorporateActionsISO15022VariantsISOLatestversion;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An account servicer sends the CorporateActionMovementReversalAdvice message
 * to an account owner or its designated agent to reverse previously confirmed
 * posting of securities or cash.<br>
 * <b>Usage</b><br>
 * The message may also be used to:<br>
 * - re-send a message previously sent (the sub-function of the message is
 * Duplicate),<br>
 * - provide a third party with a copy of a message for information (the
 * sub-function of the message is Copy),<br>
 * - re-send to a third party a copy of a message for information (the
 * sub-function of the message is Copy Duplicate),<br>
 * using the relevant elements in the business application header (BAH).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.037.002.09}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsLatestversionsubsetvariant
 * SecuritiesEventsLatestversionsubsetvariant}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V09#mmMovementConfirmationIdentification
 * CorporateActionMovementReversalAdvice002V09.
 * mmMovementConfirmationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V09#mmOtherDocumentIdentification
 * CorporateActionMovementReversalAdvice002V09.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V09#mmEventsLinkage
 * CorporateActionMovementReversalAdvice002V09.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V09#mmReversalReason
 * CorporateActionMovementReversalAdvice002V09.mmReversalReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V09#mmCorporateActionGeneralInformation
 * CorporateActionMovementReversalAdvice002V09.
 * mmCorporateActionGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V09#mmAccountDetails
 * CorporateActionMovementReversalAdvice002V09.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V09#mmCorporateActionDetails
 * CorporateActionMovementReversalAdvice002V09.mmCorporateActionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V09#mmCorporateActionConfirmationDetails
 * CorporateActionMovementReversalAdvice002V09.
 * mmCorporateActionConfirmationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V09#mmAdditionalInformation
 * CorporateActionMovementReversalAdvice002V09.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V09#mmIssuerAgent
 * CorporateActionMovementReversalAdvice002V09.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V09#mmPayingAgent
 * CorporateActionMovementReversalAdvice002V09.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V09#mmSubPayingAgent
 * CorporateActionMovementReversalAdvice002V09.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V09#mmSupplementaryData
 * CorporateActionMovementReversalAdvice002V09.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CorporateActionsISO15022VariantsISOLatestversion
 * CorporateActionsISO15022VariantsISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "CorpActnMvmntRvslAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionMovementReversalAdvice002V09"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account servicer sends the CorporateActionMovementReversalAdvice message to an account owner or its designated agent to reverse previously confirmed posting of securities or cash.\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent (the sub-function of the message is Duplicate),\r\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\r\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate),\r\nusing the relevant elements in the business application header (BAH)."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionNumberRule#for_seev_CorporateActionMovementReversalAdvice002V09
 * ConstraintOptionNumberRule.
 * for_seev_CorporateActionMovementReversalAdvice002V09}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#for_seev_CorporateActionMovementReversalAdvice002V09
 * ConstraintAdditionalInformationRule.
 * for_seev_CorporateActionMovementReversalAdvice002V09}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline#for_seev_CorporateActionMovementReversalAdvice002V09
 * ConstraintIssuerAgentGuideline.
 * for_seev_CorporateActionMovementReversalAdvice002V09}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionMovementReversalAdvice002V09", propOrder = {"movementConfirmationIdentification", "otherDocumentIdentification", "eventsLinkage", "reversalReason", "corporateActionGeneralInformation", "accountDetails",
		"corporateActionDetails", "corporateActionConfirmationDetails", "additionalInformation", "issuerAgent", "payingAgent", "subPayingAgent", "supplementaryData"})
public class CorporateActionMovementReversalAdvice002V09 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MvmntConfId", required = true)
	protected DocumentIdentification37 movementConfirmationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification37
	 * DocumentIdentification37}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MvmntConfId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MovementConfirmationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a previously sent movement confirmation document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementReversalAdvice002V09, DocumentIdentification37> mmMovementConfirmationIdentification = new MMMessageBuildingBlock<CorporateActionMovementReversalAdvice002V09, DocumentIdentification37>() {
		{
			xmlTag = "MvmntConfId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MovementConfirmationIdentification";
			definition = "Identification of a previously sent movement confirmation document.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification37.mmObject();
		}

		@Override
		public DocumentIdentification37 getValue(CorporateActionMovementReversalAdvice002V09 obj) {
			return obj.getMovementConfirmationIdentification();
		}

		@Override
		public void setValue(CorporateActionMovementReversalAdvice002V09 obj, DocumentIdentification37 value) {
			obj.setMovementConfirmationIdentification(value);
		}
	};
	@XmlElement(name = "OthrDocId")
	protected List<DocumentIdentification38> otherDocumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification38
	 * DocumentIdentification38}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrDocId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherDocumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of other documents as well as the document number."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementReversalAdvice002V09, List<DocumentIdentification38>> mmOtherDocumentIdentification = new MMMessageBuildingBlock<CorporateActionMovementReversalAdvice002V09, List<DocumentIdentification38>>() {
		{
			xmlTag = "OthrDocId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherDocumentIdentification";
			definition = "Identification of other documents as well as the document number.";
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification38.mmObject();
		}

		@Override
		public List<DocumentIdentification38> getValue(CorporateActionMovementReversalAdvice002V09 obj) {
			return obj.getOtherDocumentIdentification();
		}

		@Override
		public void setValue(CorporateActionMovementReversalAdvice002V09 obj, List<DocumentIdentification38> value) {
			obj.setOtherDocumentIdentification(value);
		}
	};
	@XmlElement(name = "EvtsLkg")
	protected List<CorporateActionEventReference4> eventsLinkage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReference4
	 * CorporateActionEventReference4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtsLkg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventsLinkage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of another corporate action event that needs to be closely linked to the processing of the event notified in this document."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementReversalAdvice002V09, List<CorporateActionEventReference4>> mmEventsLinkage = new MMMessageBuildingBlock<CorporateActionMovementReversalAdvice002V09, List<CorporateActionEventReference4>>() {
		{
			xmlTag = "EvtsLkg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventsLinkage";
			definition = "Identification of another corporate action event that needs to be closely linked to the processing of the event notified in this document.";
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionEventReference4.mmObject();
		}

		@Override
		public List<CorporateActionEventReference4> getValue(CorporateActionMovementReversalAdvice002V09 obj) {
			return obj.getEventsLinkage();
		}

		@Override
		public void setValue(CorporateActionMovementReversalAdvice002V09 obj, List<CorporateActionEventReference4> value) {
			obj.setEventsLinkage(value);
		}
	};
	@XmlElement(name = "RvslRsn")
	protected CorporateActionReversalReason4 reversalReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionReversalReason4
	 * CorporateActionReversalReason4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RvslRsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the reversal."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementReversalAdvice002V09, Optional<CorporateActionReversalReason4>> mmReversalReason = new MMMessageBuildingBlock<CorporateActionMovementReversalAdvice002V09, Optional<CorporateActionReversalReason4>>() {
		{
			xmlTag = "RvslRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalReason";
			definition = "Reason for the reversal.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionReversalReason4.mmObject();
		}

		@Override
		public Optional<CorporateActionReversalReason4> getValue(CorporateActionMovementReversalAdvice002V09 obj) {
			return obj.getReversalReason();
		}

		@Override
		public void setValue(CorporateActionMovementReversalAdvice002V09 obj, Optional<CorporateActionReversalReason4> value) {
			obj.setReversalReason(value.orElse(null));
		}
	};
	@XmlElement(name = "CorpActnGnlInf", required = true)
	protected CorporateActionGeneralInformation130 corporateActionGeneralInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation130
	 * CorporateActionGeneralInformation130}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnGnlInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionGeneralInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "General information about the corporate action event."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementReversalAdvice002V09, CorporateActionGeneralInformation130> mmCorporateActionGeneralInformation = new MMMessageBuildingBlock<CorporateActionMovementReversalAdvice002V09, CorporateActionGeneralInformation130>() {
		{
			xmlTag = "CorpActnGnlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionGeneralInformation";
			definition = "General information about the corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionGeneralInformation130.mmObject();
		}

		@Override
		public CorporateActionGeneralInformation130 getValue(CorporateActionMovementReversalAdvice002V09 obj) {
			return obj.getCorporateActionGeneralInformation();
		}

		@Override
		public void setValue(CorporateActionMovementReversalAdvice002V09 obj, CorporateActionGeneralInformation130 value) {
			obj.setCorporateActionGeneralInformation(value);
		}
	};
	@XmlElement(name = "AcctDtls", required = true)
	protected AccountAndBalance40 accountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance40
	 * AccountAndBalance40}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "General information about the safekeeping account, owner and account balance."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementReversalAdvice002V09, AccountAndBalance40> mmAccountDetails = new MMMessageBuildingBlock<CorporateActionMovementReversalAdvice002V09, AccountAndBalance40>() {
		{
			xmlTag = "AcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountDetails";
			definition = "General information about the safekeeping account, owner and account balance.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountAndBalance40.mmObject();
		}

		@Override
		public AccountAndBalance40 getValue(CorporateActionMovementReversalAdvice002V09 obj) {
			return obj.getAccountDetails();
		}

		@Override
		public void setValue(CorporateActionMovementReversalAdvice002V09 obj, AccountAndBalance40 value) {
			obj.setAccountDetails(value);
		}
	};
	@XmlElement(name = "CorpActnDtls")
	protected CorporateAction47 corporateActionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction47
	 * CorporateAction47}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about the corporate action event."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementReversalAdvice002V09, Optional<CorporateAction47>> mmCorporateActionDetails = new MMMessageBuildingBlock<CorporateActionMovementReversalAdvice002V09, Optional<CorporateAction47>>() {
		{
			xmlTag = "CorpActnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionDetails";
			definition = "Information about the corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateAction47.mmObject();
		}

		@Override
		public Optional<CorporateAction47> getValue(CorporateActionMovementReversalAdvice002V09 obj) {
			return obj.getCorporateActionDetails();
		}

		@Override
		public void setValue(CorporateActionMovementReversalAdvice002V09 obj, Optional<CorporateAction47> value) {
			obj.setCorporateActionDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "CorpActnConfDtls", required = true)
	protected CorporateActionOption149 corporateActionConfirmationDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption149
	 * CorporateActionOption149}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnConfDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionConfirmationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about the corporate action option."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementReversalAdvice002V09, CorporateActionOption149> mmCorporateActionConfirmationDetails = new MMMessageBuildingBlock<CorporateActionMovementReversalAdvice002V09, CorporateActionOption149>() {
		{
			xmlTag = "CorpActnConfDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionConfirmationDetails";
			definition = "Information about the corporate action option.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionOption149.mmObject();
		}

		@Override
		public CorporateActionOption149 getValue(CorporateActionMovementReversalAdvice002V09 obj) {
			return obj.getCorporateActionConfirmationDetails();
		}

		@Override
		public void setValue(CorporateActionMovementReversalAdvice002V09 obj, CorporateActionOption149 value) {
			obj.setCorporateActionConfirmationDetails(value);
		}
	};
	@XmlElement(name = "AddtlInf")
	protected CorporateActionNarrative35 additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative35
	 * CorporateActionNarrative35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides additional information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementReversalAdvice002V09, Optional<CorporateActionNarrative35>> mmAdditionalInformation = new MMMessageBuildingBlock<CorporateActionMovementReversalAdvice002V09, Optional<CorporateActionNarrative35>>() {
		{
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Provides additional information.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionNarrative35.mmObject();
		}

		@Override
		public Optional<CorporateActionNarrative35> getValue(CorporateActionMovementReversalAdvice002V09 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(CorporateActionMovementReversalAdvice002V09 obj, Optional<CorporateActionNarrative35> value) {
			obj.setAdditionalInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "IssrAgt")
	protected List<PartyIdentification104Choice> issuerAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification104Choice
	 * PartyIdentification104Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssrAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party appointed to administer the event on behalf of the issuer company/offeror. The party may be contacted for more information about the event."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementReversalAdvice002V09, List<PartyIdentification104Choice>> mmIssuerAgent = new MMMessageBuildingBlock<CorporateActionMovementReversalAdvice002V09, List<PartyIdentification104Choice>>() {
		{
			xmlTag = "IssrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerAgent";
			definition = "Party appointed to administer the event on behalf of the issuer company/offeror. The party may be contacted for more information about the event.";
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification104Choice.mmObject();
		}

		@Override
		public List<PartyIdentification104Choice> getValue(CorporateActionMovementReversalAdvice002V09 obj) {
			return obj.getIssuerAgent();
		}

		@Override
		public void setValue(CorporateActionMovementReversalAdvice002V09 obj, List<PartyIdentification104Choice> value) {
			obj.setIssuerAgent(value);
		}
	};
	@XmlElement(name = "PngAgt")
	protected List<PartyIdentification104Choice> payingAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification104Choice
	 * PartyIdentification104Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PngAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent (principal or fiscal paying agent) appointed to execute the payment for the corporate action event on behalf of the issuer company/offeror."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementReversalAdvice002V09, List<PartyIdentification104Choice>> mmPayingAgent = new MMMessageBuildingBlock<CorporateActionMovementReversalAdvice002V09, List<PartyIdentification104Choice>>() {
		{
			xmlTag = "PngAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayingAgent";
			definition = "Agent (principal or fiscal paying agent) appointed to execute the payment for the corporate action event on behalf of the issuer company/offeror.";
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification104Choice.mmObject();
		}

		@Override
		public List<PartyIdentification104Choice> getValue(CorporateActionMovementReversalAdvice002V09 obj) {
			return obj.getPayingAgent();
		}

		@Override
		public void setValue(CorporateActionMovementReversalAdvice002V09 obj, List<PartyIdentification104Choice> value) {
			obj.setPayingAgent(value);
		}
	};
	@XmlElement(name = "SubPngAgt")
	protected List<PartyIdentification104Choice> subPayingAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification104Choice
	 * PartyIdentification104Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubPngAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubPayingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sub-agent appointed to execute the payment for the corporate action event on behalf of the issuer company/offeror."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementReversalAdvice002V09, List<PartyIdentification104Choice>> mmSubPayingAgent = new MMMessageBuildingBlock<CorporateActionMovementReversalAdvice002V09, List<PartyIdentification104Choice>>() {
		{
			xmlTag = "SubPngAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubPayingAgent";
			definition = "Sub-agent appointed to execute the payment for the corporate action event on behalf of the issuer company/offeror.";
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification104Choice.mmObject();
		}

		@Override
		public List<PartyIdentification104Choice> getValue(CorporateActionMovementReversalAdvice002V09 obj) {
			return obj.getSubPayingAgent();
		}

		@Override
		public void setValue(CorporateActionMovementReversalAdvice002V09 obj, List<PartyIdentification104Choice> value) {
			obj.setSubPayingAgent(value);
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that can not be captured in the structured fields and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementReversalAdvice002V09, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<CorporateActionMovementReversalAdvice002V09, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(CorporateActionMovementReversalAdvice002V09 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(CorporateActionMovementReversalAdvice002V09 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOptionNumberRule.for_seev_CorporateActionMovementReversalAdvice002V09,
						com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.for_seev_CorporateActionMovementReversalAdvice002V09,
						com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline.for_seev_CorporateActionMovementReversalAdvice002V09);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionMovementReversalAdvice002V09";
				definition = "Scope\r\nAn account servicer sends the CorporateActionMovementReversalAdvice message to an account owner or its designated agent to reverse previously confirmed posting of securities or cash.\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent (the sub-function of the message is Duplicate),\r\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\r\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate),\r\nusing the relevant elements in the business application header (BAH).";
				messageSet_lazy = () -> Arrays.asList(CorporateActionsISO15022VariantsISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "CorpActnMvmntRvslAdvc";
				businessArea_lazy = () -> SecuritiesEventsLatestversionsubsetvariant.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V09.mmMovementConfirmationIdentification,
						com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V09.mmOtherDocumentIdentification, com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V09.mmEventsLinkage,
						com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V09.mmReversalReason, com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V09.mmCorporateActionGeneralInformation,
						com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V09.mmAccountDetails, com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V09.mmCorporateActionDetails,
						com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V09.mmCorporateActionConfirmationDetails,
						com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V09.mmAdditionalInformation, com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V09.mmIssuerAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V09.mmPayingAgent, com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V09.mmSubPayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V09.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "037";
						version = "09";
						flavour = "002";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CorporateActionMovementReversalAdvice002V09.class;
			}
		});
		return mmObject_lazy.get();
	}

	public DocumentIdentification37 getMovementConfirmationIdentification() {
		return movementConfirmationIdentification;
	}

	public CorporateActionMovementReversalAdvice002V09 setMovementConfirmationIdentification(DocumentIdentification37 movementConfirmationIdentification) {
		this.movementConfirmationIdentification = Objects.requireNonNull(movementConfirmationIdentification);
		return this;
	}

	public List<DocumentIdentification38> getOtherDocumentIdentification() {
		return otherDocumentIdentification == null ? otherDocumentIdentification = new ArrayList<>() : otherDocumentIdentification;
	}

	public CorporateActionMovementReversalAdvice002V09 setOtherDocumentIdentification(List<DocumentIdentification38> otherDocumentIdentification) {
		this.otherDocumentIdentification = Objects.requireNonNull(otherDocumentIdentification);
		return this;
	}

	public List<CorporateActionEventReference4> getEventsLinkage() {
		return eventsLinkage == null ? eventsLinkage = new ArrayList<>() : eventsLinkage;
	}

	public CorporateActionMovementReversalAdvice002V09 setEventsLinkage(List<CorporateActionEventReference4> eventsLinkage) {
		this.eventsLinkage = Objects.requireNonNull(eventsLinkage);
		return this;
	}

	public Optional<CorporateActionReversalReason4> getReversalReason() {
		return reversalReason == null ? Optional.empty() : Optional.of(reversalReason);
	}

	public CorporateActionMovementReversalAdvice002V09 setReversalReason(CorporateActionReversalReason4 reversalReason) {
		this.reversalReason = reversalReason;
		return this;
	}

	public CorporateActionGeneralInformation130 getCorporateActionGeneralInformation() {
		return corporateActionGeneralInformation;
	}

	public CorporateActionMovementReversalAdvice002V09 setCorporateActionGeneralInformation(CorporateActionGeneralInformation130 corporateActionGeneralInformation) {
		this.corporateActionGeneralInformation = Objects.requireNonNull(corporateActionGeneralInformation);
		return this;
	}

	public AccountAndBalance40 getAccountDetails() {
		return accountDetails;
	}

	public CorporateActionMovementReversalAdvice002V09 setAccountDetails(AccountAndBalance40 accountDetails) {
		this.accountDetails = Objects.requireNonNull(accountDetails);
		return this;
	}

	public Optional<CorporateAction47> getCorporateActionDetails() {
		return corporateActionDetails == null ? Optional.empty() : Optional.of(corporateActionDetails);
	}

	public CorporateActionMovementReversalAdvice002V09 setCorporateActionDetails(CorporateAction47 corporateActionDetails) {
		this.corporateActionDetails = corporateActionDetails;
		return this;
	}

	public CorporateActionOption149 getCorporateActionConfirmationDetails() {
		return corporateActionConfirmationDetails;
	}

	public CorporateActionMovementReversalAdvice002V09 setCorporateActionConfirmationDetails(CorporateActionOption149 corporateActionConfirmationDetails) {
		this.corporateActionConfirmationDetails = Objects.requireNonNull(corporateActionConfirmationDetails);
		return this;
	}

	public Optional<CorporateActionNarrative35> getAdditionalInformation() {
		return additionalInformation == null ? Optional.empty() : Optional.of(additionalInformation);
	}

	public CorporateActionMovementReversalAdvice002V09 setAdditionalInformation(CorporateActionNarrative35 additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}

	public List<PartyIdentification104Choice> getIssuerAgent() {
		return issuerAgent == null ? issuerAgent = new ArrayList<>() : issuerAgent;
	}

	public CorporateActionMovementReversalAdvice002V09 setIssuerAgent(List<PartyIdentification104Choice> issuerAgent) {
		this.issuerAgent = Objects.requireNonNull(issuerAgent);
		return this;
	}

	public List<PartyIdentification104Choice> getPayingAgent() {
		return payingAgent == null ? payingAgent = new ArrayList<>() : payingAgent;
	}

	public CorporateActionMovementReversalAdvice002V09 setPayingAgent(List<PartyIdentification104Choice> payingAgent) {
		this.payingAgent = Objects.requireNonNull(payingAgent);
		return this;
	}

	public List<PartyIdentification104Choice> getSubPayingAgent() {
		return subPayingAgent == null ? subPayingAgent = new ArrayList<>() : subPayingAgent;
	}

	public CorporateActionMovementReversalAdvice002V09 setSubPayingAgent(List<PartyIdentification104Choice> subPayingAgent) {
		this.subPayingAgent = Objects.requireNonNull(subPayingAgent);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public CorporateActionMovementReversalAdvice002V09 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.037.002.09")
	static public class Document {
		@XmlElement(name = "CorpActnMvmntRvslAdvc", required = true)
		public CorporateActionMovementReversalAdvice002V09 messageBody;
	}
}