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

package com.tools20022.repository.area.sese;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesSettlementArchive;
import com.tools20022.repository.choice.MatchingStatus19Choice;
import com.tools20022.repository.choice.ProcessingStatus37Choice;
import com.tools20022.repository.choice.SettlementStatus7Choice;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msg.TransactionDetails61;
import com.tools20022.repository.msg.TransactionIdentifications16;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * Scope An account servicer sends a SecuritiesSettlementTransactionStatusAdvice
 * to an account owner to advise the status of a securities settlement
 * transaction instruction previously sent by the account owner or the status of
 * a settlement transaction existing in the books of the servicer for the
 * account of the owner. The status may be a processing, pending processing,
 * internal matching, matching and/or settlement status. The status advice may
 * be sent as a response to the request of the account owner or not. The account
 * servicer/owner relationship may be: - a central securities depository or
 * another settlement market infrastructure acting on behalf of their
 * participants - an agent (sub-custodian) acting on behalf of their global
 * custodian customer, or - a custodian acting on behalf of an investment
 * management institution or a broker/dealer.
 * 
 * Usage The message may also be used to: - re-send a message previously sent, -
 * provide a third party with a copy of a message for information, - re-send to
 * a third party a copy of a message for information using the relevant elements
 * in the Business Application Header.
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
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV05#mmTransactionIdentification
 * SecuritiesSettlementTransactionStatusAdviceV05.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV05#mmProcessingStatus
 * SecuritiesSettlementTransactionStatusAdviceV05.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV05#mmInferredMatchingStatus
 * SecuritiesSettlementTransactionStatusAdviceV05.mmInferredMatchingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV05#mmMatchingStatus
 * SecuritiesSettlementTransactionStatusAdviceV05.mmMatchingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV05#mmSettlementStatus
 * SecuritiesSettlementTransactionStatusAdviceV05.mmSettlementStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV05#mmTransactionDetails
 * SecuritiesSettlementTransactionStatusAdviceV05.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV05#mmSupplementaryData
 * SecuritiesSettlementTransactionStatusAdviceV05.mmSupplementaryData}</li>
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
 * xmlTag} = "SctiesSttlmTxStsAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementArchive
 * SecuritiesSettlementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.024.001.05}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintProcessingStatusPresenceRule#forSecuritiesSettlementTransactionStatusAdviceV05
 * ConstraintProcessingStatusPresenceRule.
 * forSecuritiesSettlementTransactionStatusAdviceV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMatchingStatusPresenceRule#forSecuritiesSettlementTransactionStatusAdviceV05
 * ConstraintMatchingStatusPresenceRule.
 * forSecuritiesSettlementTransactionStatusAdviceV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementStatusPresenceRule#forSecuritiesSettlementTransactionStatusAdviceV05
 * ConstraintSettlementStatusPresenceRule.
 * forSecuritiesSettlementTransactionStatusAdviceV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInferredMatchingStatusStatusPresenceRule#forSecuritiesSettlementTransactionStatusAdviceV05
 * ConstraintInferredMatchingStatusStatusPresenceRule.
 * forSecuritiesSettlementTransactionStatusAdviceV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesSettlementTransactionStatusAdviceV05
 * ConstraintCoexistenceCharacterSetXRule.
 * forSecuritiesSettlementTransactionStatusAdviceV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule#forSecuritiesSettlementTransactionStatusAdviceV05
 * ConstraintCoexistenceIdentificationRule.
 * forSecuritiesSettlementTransactionStatusAdviceV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule#forSecuritiesSettlementTransactionStatusAdviceV05
 * ConstraintSettlementStatusAndMatchedRule.
 * forSecuritiesSettlementTransactionStatusAdviceV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesSettlementTransactionStatusAdviceV05
 * ConstraintSecuritiesMarketPracticeGroupGuideline.
 * forSecuritiesSettlementTransactionStatusAdviceV05}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesSettlementTransactionStatusAdviceV05"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\nAn account servicer sends a SecuritiesSettlementTransactionStatusAdvice to an account owner to advise the status of a securities settlement transaction instruction previously sent by the account owner or the status of a settlement transaction existing in the books of the servicer for the account of the owner. The status may be a processing, pending processing, internal matching, matching and/or settlement status.\nThe status advice may be sent as a response to the request of the account owner or not.\nThe account servicer/owner relationship may be:\n- a central securities depository or another settlement market infrastructure acting on behalf of their participants\n- an agent (sub-custodian) acting on behalf of their global custodian customer, or\n- a custodian acting on behalf of an investment management institution or a broker/dealer.\n\nUsage\nThe message may also be used to:\n- re-send a message previously sent,\n- provide a third party with a copy of a message for information,\n- re-send to a third party a copy of a message for information\nusing the relevant elements in the Business Application Header.\n\nISO 15022 - 20022 Coexistence\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment.  The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows:  “CoexistenceXxxxRule”."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV06
 * SecuritiesSettlementTransactionStatusAdviceV06}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV04
 * SecuritiesSettlementTransactionStatusAdviceV04}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesSettlementTransactionStatusAdviceV05", propOrder = {"transactionIdentification", "processingStatus", "inferredMatchingStatus", "matchingStatus", "settlementStatus", "transactionDetails", "supplementaryData"})
public class SecuritiesSettlementTransactionStatusAdviceV05 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TxId", required = true)
	protected TransactionIdentifications16 transactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications16
	 * TransactionIdentifications16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides unambiguous transaction identification information."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV06#mmTransactionIdentification
	 * SecuritiesSettlementTransactionStatusAdviceV06.
	 * mmTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV04#mmTransactionIdentification
	 * SecuritiesSettlementTransactionStatusAdviceV04.
	 * mmTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransactionIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Provides unambiguous transaction identification information.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionStatusAdviceV06.mmTransactionIdentification);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV04.mmTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TransactionIdentifications16.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionStatusAdviceV05.class.getMethod("getTransactionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "PrcgSts")
	protected ProcessingStatus37Choice processingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus37Choice
	 * ProcessingStatus37Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details on the processing status of the transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV06#mmProcessingStatus
	 * SecuritiesSettlementTransactionStatusAdviceV06.mmProcessingStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV04#mmProcessingStatus
	 * SecuritiesSettlementTransactionStatusAdviceV04.mmProcessingStatus}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmProcessingStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "PrcgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingStatus";
			definition = "Provides details on the processing status of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionStatusAdviceV06.mmProcessingStatus);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV04.mmProcessingStatus;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ProcessingStatus37Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionStatusAdviceV05.class.getMethod("getProcessingStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "IfrrdMtchgSts")
	protected MatchingStatus19Choice inferredMatchingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus19Choice
	 * MatchingStatus19Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IfrrdMtchgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InferredMatchingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the matching status of an instruction as per the account servicer based on an allegement. At this time no matching took place on the market (at the CSD/ICSD)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV06#mmInferredMatchingStatus
	 * SecuritiesSettlementTransactionStatusAdviceV06.mmInferredMatchingStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV04#mmInferredMatchingStatus
	 * SecuritiesSettlementTransactionStatusAdviceV04.mmInferredMatchingStatus}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmInferredMatchingStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "IfrrdMtchgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InferredMatchingStatus";
			definition = "Provides the matching status of an instruction as per the account servicer based on an allegement. At this time no matching took place on the market (at the CSD/ICSD).";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionStatusAdviceV06.mmInferredMatchingStatus);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV04.mmInferredMatchingStatus;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MatchingStatus19Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionStatusAdviceV05.class.getMethod("getInferredMatchingStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "MtchgSts")
	protected MatchingStatus19Choice matchingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus19Choice
	 * MatchingStatus19Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtchgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the matching status of the instruction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV06#mmMatchingStatus
	 * SecuritiesSettlementTransactionStatusAdviceV06.mmMatchingStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV04#mmMatchingStatus
	 * SecuritiesSettlementTransactionStatusAdviceV04.mmMatchingStatus}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMatchingStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "MtchgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchingStatus";
			definition = "Provides the matching status of the instruction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionStatusAdviceV06.mmMatchingStatus);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV04.mmMatchingStatus;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MatchingStatus19Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionStatusAdviceV05.class.getMethod("getMatchingStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "SttlmSts")
	protected SettlementStatus7Choice settlementStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus7Choice
	 * SettlementStatus7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the status of settlement of a transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV06#mmSettlementStatus
	 * SecuritiesSettlementTransactionStatusAdviceV06.mmSettlementStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV04#mmSettlementStatus
	 * SecuritiesSettlementTransactionStatusAdviceV04.mmSettlementStatus}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSettlementStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "SttlmSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatus";
			definition = "Provides the status of settlement of a transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionStatusAdviceV06.mmSettlementStatus);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV04.mmSettlementStatus;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementStatus7Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionStatusAdviceV05.class.getMethod("getSettlementStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "TxDtls")
	protected TransactionDetails61 transactionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails61
	 * TransactionDetails61}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the details of the transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV06#mmTransactionDetails
	 * SecuritiesSettlementTransactionStatusAdviceV06.mmTransactionDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV04#mmTransactionDetails
	 * SecuritiesSettlementTransactionStatusAdviceV04.mmTransactionDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransactionDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "TxDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDetails";
			definition = "Identifies the details of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionStatusAdviceV06.mmTransactionDetails);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV04.mmTransactionDetails;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TransactionDetails61.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionStatusAdviceV05.class.getMethod("getTransactionDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV06#mmSupplementaryData
	 * SecuritiesSettlementTransactionStatusAdviceV06.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV04#mmSupplementaryData
	 * SecuritiesSettlementTransactionStatusAdviceV04.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionStatusAdviceV06.mmSupplementaryData);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV04.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionStatusAdviceV05.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintProcessingStatusPresenceRule.forSecuritiesSettlementTransactionStatusAdviceV05,
						com.tools20022.repository.constraints.ConstraintMatchingStatusPresenceRule.forSecuritiesSettlementTransactionStatusAdviceV05,
						com.tools20022.repository.constraints.ConstraintSettlementStatusPresenceRule.forSecuritiesSettlementTransactionStatusAdviceV05,
						com.tools20022.repository.constraints.ConstraintInferredMatchingStatusStatusPresenceRule.forSecuritiesSettlementTransactionStatusAdviceV05,
						com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesSettlementTransactionStatusAdviceV05,
						com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule.forSecuritiesSettlementTransactionStatusAdviceV05,
						com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule.forSecuritiesSettlementTransactionStatusAdviceV05,
						com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesSettlementTransactionStatusAdviceV05);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesSettlementTransactionStatusAdviceV05";
				definition = "Scope\nAn account servicer sends a SecuritiesSettlementTransactionStatusAdvice to an account owner to advise the status of a securities settlement transaction instruction previously sent by the account owner or the status of a settlement transaction existing in the books of the servicer for the account of the owner. The status may be a processing, pending processing, internal matching, matching and/or settlement status.\nThe status advice may be sent as a response to the request of the account owner or not.\nThe account servicer/owner relationship may be:\n- a central securities depository or another settlement market infrastructure acting on behalf of their participants\n- an agent (sub-custodian) acting on behalf of their global custodian customer, or\n- a custodian acting on behalf of an investment management institution or a broker/dealer.\n\nUsage\nThe message may also be used to:\n- re-send a message previously sent,\n- provide a third party with a copy of a message for information,\n- re-send to a third party a copy of a message for information\nusing the relevant elements in the Business Application Header.\n\nISO 15022 - 20022 Coexistence\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment.  The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows:  “CoexistenceXxxxRule”.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionStatusAdviceV06.mmObject());
				previousVersion_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV04.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "SctiesSttlmTxStsAdvc";
				businessArea_lazy = () -> SecuritiesSettlementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV05.mmTransactionIdentification,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV05.mmProcessingStatus, com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV05.mmInferredMatchingStatus,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV05.mmMatchingStatus, com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV05.mmSettlementStatus,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV05.mmTransactionDetails, com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV05.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "024";
						version = "05";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesSettlementTransactionStatusAdviceV05.class;
			}
		});
		return mmObject_lazy.get();
	}

	public TransactionIdentifications16 getTransactionIdentification() {
		return transactionIdentification;
	}

	public SecuritiesSettlementTransactionStatusAdviceV05 setTransactionIdentification(TransactionIdentifications16 transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public Optional<ProcessingStatus37Choice> getProcessingStatus() {
		return processingStatus == null ? Optional.empty() : Optional.of(processingStatus);
	}

	public SecuritiesSettlementTransactionStatusAdviceV05 setProcessingStatus(ProcessingStatus37Choice processingStatus) {
		this.processingStatus = processingStatus;
		return this;
	}

	public Optional<MatchingStatus19Choice> getInferredMatchingStatus() {
		return inferredMatchingStatus == null ? Optional.empty() : Optional.of(inferredMatchingStatus);
	}

	public SecuritiesSettlementTransactionStatusAdviceV05 setInferredMatchingStatus(MatchingStatus19Choice inferredMatchingStatus) {
		this.inferredMatchingStatus = inferredMatchingStatus;
		return this;
	}

	public Optional<MatchingStatus19Choice> getMatchingStatus() {
		return matchingStatus == null ? Optional.empty() : Optional.of(matchingStatus);
	}

	public SecuritiesSettlementTransactionStatusAdviceV05 setMatchingStatus(MatchingStatus19Choice matchingStatus) {
		this.matchingStatus = matchingStatus;
		return this;
	}

	public Optional<SettlementStatus7Choice> getSettlementStatus() {
		return settlementStatus == null ? Optional.empty() : Optional.of(settlementStatus);
	}

	public SecuritiesSettlementTransactionStatusAdviceV05 setSettlementStatus(SettlementStatus7Choice settlementStatus) {
		this.settlementStatus = settlementStatus;
		return this;
	}

	public Optional<TransactionDetails61> getTransactionDetails() {
		return transactionDetails == null ? Optional.empty() : Optional.of(transactionDetails);
	}

	public SecuritiesSettlementTransactionStatusAdviceV05 setTransactionDetails(TransactionDetails61 transactionDetails) {
		this.transactionDetails = transactionDetails;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public SecuritiesSettlementTransactionStatusAdviceV05 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.024.001.05")
	static public class Document {
		@XmlElement(name = "SctiesSttlmTxStsAdvc", required = true)
		public SecuritiesSettlementTransactionStatusAdviceV05 messageBody;
	}
}