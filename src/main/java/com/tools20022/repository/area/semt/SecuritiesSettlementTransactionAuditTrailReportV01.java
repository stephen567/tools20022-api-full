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

package com.tools20022.repository.area.semt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesManagementArchive;
import com.tools20022.repository.choice.PartyIdentification36Choice;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * Scope
 * 
 * This message is sent by the Market Infrastructure to the CSD to advise of the
 * history of all the statuses, modifications, replacement and cancellation of a
 * specific transaction during its whole life cycle when the instructing party
 * is a direct participant to the Settlement Infrastructure.
 * 
 * 
 * Usage
 * 
 * The message may also be used to:
 * 
 * - re-send a message sent by the market infrastructure to the direct
 * participant,
 * 
 * - provide a third party with a copy of a message being sent by the market
 * infrastructure for information,
 * 
 * - re-send to a third party a copy of a message being sent by the market
 * infrastructure for information using the relevant elements in the Business
 * Application Header.
 * 
 * ISO 15022 - 20022 Coexistence This ISO 20022 message is reversed engineered
 * from ISO 15022. Both standards will coexist for a certain number of years.
 * Until this coexistence period ends, the usage of certain data types is
 * restricted to ensure interoperability between ISO 15022 and 20022 users.
 * Compliance to these rules is mandatory in a coexistence environment. The
 * coexistence restrictions are described in a Textual Rule linked to the
 * Message Items they concern. These coexistence textual rules are clearly
 * identified as follows: “CoexistenceXxxxRule”.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code semt.022.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesManagementArchive
 * SecuritiesManagementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV01#mmPagination
 * SecuritiesSettlementTransactionAuditTrailReportV01.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV01#mmQueryReference
 * SecuritiesSettlementTransactionAuditTrailReportV01.mmQueryReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV01#mmTransactionIdentification
 * SecuritiesSettlementTransactionAuditTrailReportV01.
 * mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV01#mmSafekeepingAccount
 * SecuritiesSettlementTransactionAuditTrailReportV01.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV01#mmAccountOwner
 * SecuritiesSettlementTransactionAuditTrailReportV01.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV01#mmStatusTrail
 * SecuritiesSettlementTransactionAuditTrailReportV01.mmStatusTrail}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "SctiesSttlmTxAudtTrlRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesSettlementTransactionAuditTrailReportV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\n\nThis message is sent by the Market Infrastructure to the CSD to advise of the history of all the statuses, modifications, replacement and cancellation of a specific transaction during its whole life cycle when the instructing party is a direct participant to the Settlement Infrastructure.\n\n\nUsage\n\nThe message may also be used to: \n\n- re-send a message sent by the market infrastructure to the direct participant,\n\n- provide a third party with a copy of a message being sent by the market infrastructure for information,\n\n- re-send to a third party a copy of a message being sent by the market infrastructure for information\nusing the relevant elements in the Business Application Header.\n\nISO 15022 - 20022 Coexistence\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment. The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows: “CoexistenceXxxxRule”."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_semt_SecuritiesSettlementTransactionAuditTrailReportV01
 * ConstraintCoexistenceCharacterSetXRule.
 * for_semt_SecuritiesSettlementTransactionAuditTrailReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule#for_semt_SecuritiesSettlementTransactionAuditTrailReportV01
 * ConstraintCoexistenceIdentificationRule.
 * for_semt_SecuritiesSettlementTransactionAuditTrailReportV01}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV02
 * SecuritiesSettlementTransactionAuditTrailReportV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesSettlementTransactionAuditTrailReportV01", propOrder = {"pagination", "queryReference", "transactionIdentification", "safekeepingAccount", "accountOwner", "statusTrail"})
public class SecuritiesSettlementTransactionAuditTrailReportV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Pgntn", required = true)
	protected Pagination pagination;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Pagination
	 * Pagination}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pgntn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pagination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Page number of the message (within a statement) and continuation indicator to indicate that the statement is to continue or that the message is the last page of the statement."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV02#mmPagination
	 * SecuritiesSettlementTransactionAuditTrailReportV02.mmPagination}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionAuditTrailReportV01, Pagination> mmPagination = new MMMessageBuildingBlock<SecuritiesSettlementTransactionAuditTrailReportV01, Pagination>() {
		{
			xmlTag = "Pgntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pagination";
			definition = "Page number of the message (within a statement) and continuation indicator to indicate that the statement is to continue or that the message is the last page of the statement.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionAuditTrailReportV02.mmPagination);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Pagination.mmObject();
		}

		@Override
		public Pagination getValue(SecuritiesSettlementTransactionAuditTrailReportV01 obj) {
			return obj.getPagination();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionAuditTrailReportV01 obj, Pagination value) {
			obj.setPagination(value);
		}
	};
	@XmlElement(name = "QryRef")
	protected Identification1 queryReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Identification1
	 * Identification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QryRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the SecuritiesStatusQuery message sent to request this report."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV02#mmQueryReference
	 * SecuritiesSettlementTransactionAuditTrailReportV02.mmQueryReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionAuditTrailReportV01, Optional<Identification1>> mmQueryReference = new MMMessageBuildingBlock<SecuritiesSettlementTransactionAuditTrailReportV01, Optional<Identification1>>() {
		{
			xmlTag = "QryRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryReference";
			definition = "Identification of the SecuritiesStatusQuery message sent to request this report.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionAuditTrailReportV02.mmQueryReference);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Identification1.mmObject();
		}

		@Override
		public Optional<Identification1> getValue(SecuritiesSettlementTransactionAuditTrailReportV01 obj) {
			return obj.getQueryReference();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionAuditTrailReportV01 obj, Optional<Identification1> value) {
			obj.setQueryReference(value.orElse(null));
		}
	};
	@XmlElement(name = "TxId")
	protected TransactionIdentifications15 transactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications15
	 * TransactionIdentifications15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides unambiguous transaction identification information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV02#mmTransactionIdentification
	 * SecuritiesSettlementTransactionAuditTrailReportV02.
	 * mmTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionAuditTrailReportV01, Optional<TransactionIdentifications15>> mmTransactionIdentification = new MMMessageBuildingBlock<SecuritiesSettlementTransactionAuditTrailReportV01, Optional<TransactionIdentifications15>>() {
		{
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Provides unambiguous transaction identification information.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionAuditTrailReportV02.mmTransactionIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TransactionIdentifications15.mmObject();
		}

		@Override
		public Optional<TransactionIdentifications15> getValue(SecuritiesSettlementTransactionAuditTrailReportV01 obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionAuditTrailReportV01 obj, Optional<TransactionIdentifications15> value) {
			obj.setTransactionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "SfkpgAcct", required = true)
	protected SecuritiesAccount13 safekeepingAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount13
	 * SecuritiesAccount13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a securities entry is made."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV02#mmSafekeepingAccount
	 * SecuritiesSettlementTransactionAuditTrailReportV02.mmSafekeepingAccount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionAuditTrailReportV01, SecuritiesAccount13> mmSafekeepingAccount = new MMMessageBuildingBlock<SecuritiesSettlementTransactionAuditTrailReportV01, SecuritiesAccount13>() {
		{
			xmlTag = "SfkpgAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			definition = "Account to or from which a securities entry is made.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionAuditTrailReportV02.mmSafekeepingAccount);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesAccount13.mmObject();
		}

		@Override
		public SecuritiesAccount13 getValue(SecuritiesSettlementTransactionAuditTrailReportV01 obj) {
			return obj.getSafekeepingAccount();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionAuditTrailReportV01 obj, SecuritiesAccount13 value) {
			obj.setSafekeepingAccount(value);
		}
	};
	@XmlElement(name = "AcctOwnr")
	protected PartyIdentification36Choice accountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification36Choice
	 * PartyIdentification36Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that legally owns the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV02#mmAccountOwner
	 * SecuritiesSettlementTransactionAuditTrailReportV02.mmAccountOwner}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionAuditTrailReportV01, Optional<PartyIdentification36Choice>> mmAccountOwner = new MMMessageBuildingBlock<SecuritiesSettlementTransactionAuditTrailReportV01, Optional<PartyIdentification36Choice>>() {
		{
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the account.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionAuditTrailReportV02.mmAccountOwner);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification36Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification36Choice> getValue(SecuritiesSettlementTransactionAuditTrailReportV01 obj) {
			return obj.getAccountOwner();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionAuditTrailReportV01 obj, Optional<PartyIdentification36Choice> value) {
			obj.setAccountOwner(value.orElse(null));
		}
	};
	@XmlElement(name = "StsTrl")
	protected List<StatusTrail2> statusTrail;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.StatusTrail2
	 * StatusTrail2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsTrl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusTrail"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * " Provides the history of status and reasons for a pending, posted or cancelled transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV02#mmStatusTrail
	 * SecuritiesSettlementTransactionAuditTrailReportV02.mmStatusTrail}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionAuditTrailReportV01, List<StatusTrail2>> mmStatusTrail = new MMMessageBuildingBlock<SecuritiesSettlementTransactionAuditTrailReportV01, List<StatusTrail2>>() {
		{
			xmlTag = "StsTrl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusTrail";
			definition = " Provides the history of status and reasons for a pending, posted or cancelled transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionAuditTrailReportV02.mmStatusTrail);
			minOccurs = 0;
			complexType_lazy = () -> StatusTrail2.mmObject();
		}

		@Override
		public List<StatusTrail2> getValue(SecuritiesSettlementTransactionAuditTrailReportV01 obj) {
			return obj.getStatusTrail();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionAuditTrailReportV01 obj, List<StatusTrail2> value) {
			obj.setStatusTrail(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_semt_SecuritiesSettlementTransactionAuditTrailReportV01,
						com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule.for_semt_SecuritiesSettlementTransactionAuditTrailReportV01);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesSettlementTransactionAuditTrailReportV01";
				definition = "Scope\n\nThis message is sent by the Market Infrastructure to the CSD to advise of the history of all the statuses, modifications, replacement and cancellation of a specific transaction during its whole life cycle when the instructing party is a direct participant to the Settlement Infrastructure.\n\n\nUsage\n\nThe message may also be used to: \n\n- re-send a message sent by the market infrastructure to the direct participant,\n\n- provide a third party with a copy of a message being sent by the market infrastructure for information,\n\n- re-send to a third party a copy of a message being sent by the market infrastructure for information\nusing the relevant elements in the Business Application Header.\n\nISO 15022 - 20022 Coexistence\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment. The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows: “CoexistenceXxxxRule”.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionAuditTrailReportV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "SctiesSttlmTxAudtTrlRpt";
				businessArea_lazy = () -> SecuritiesManagementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV01.mmPagination,
						com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV01.mmQueryReference,
						com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV01.mmTransactionIdentification,
						com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV01.mmSafekeepingAccount, com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV01.mmAccountOwner,
						com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV01.mmStatusTrail);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "semt";
						messageFunctionality = "022";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesSettlementTransactionAuditTrailReportV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Pagination getPagination() {
		return pagination;
	}

	public SecuritiesSettlementTransactionAuditTrailReportV01 setPagination(Pagination pagination) {
		this.pagination = Objects.requireNonNull(pagination);
		return this;
	}

	public Optional<Identification1> getQueryReference() {
		return queryReference == null ? Optional.empty() : Optional.of(queryReference);
	}

	public SecuritiesSettlementTransactionAuditTrailReportV01 setQueryReference(Identification1 queryReference) {
		this.queryReference = queryReference;
		return this;
	}

	public Optional<TransactionIdentifications15> getTransactionIdentification() {
		return transactionIdentification == null ? Optional.empty() : Optional.of(transactionIdentification);
	}

	public SecuritiesSettlementTransactionAuditTrailReportV01 setTransactionIdentification(TransactionIdentifications15 transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
		return this;
	}

	public SecuritiesAccount13 getSafekeepingAccount() {
		return safekeepingAccount;
	}

	public SecuritiesSettlementTransactionAuditTrailReportV01 setSafekeepingAccount(SecuritiesAccount13 safekeepingAccount) {
		this.safekeepingAccount = Objects.requireNonNull(safekeepingAccount);
		return this;
	}

	public Optional<PartyIdentification36Choice> getAccountOwner() {
		return accountOwner == null ? Optional.empty() : Optional.of(accountOwner);
	}

	public SecuritiesSettlementTransactionAuditTrailReportV01 setAccountOwner(PartyIdentification36Choice accountOwner) {
		this.accountOwner = accountOwner;
		return this;
	}

	public List<StatusTrail2> getStatusTrail() {
		return statusTrail == null ? statusTrail = new ArrayList<>() : statusTrail;
	}

	public SecuritiesSettlementTransactionAuditTrailReportV01 setStatusTrail(List<StatusTrail2> statusTrail) {
		this.statusTrail = Objects.requireNonNull(statusTrail);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.022.001.01")
	static public class Document {
		@XmlElement(name = "SctiesSttlmTxAudtTrlRpt", required = true)
		public SecuritiesSettlementTransactionAuditTrailReportV01 messageBody;
	}
}