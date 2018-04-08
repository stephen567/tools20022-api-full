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

package com.tools20022.repository.area.pacs;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.PaymentsClearingandSettlementArchive;
import com.tools20022.repository.msg.GroupHeader53;
import com.tools20022.repository.msg.OriginalGroupHeader1;
import com.tools20022.repository.msg.PaymentTransaction52;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The FinancialInstitutionToFinancialInstitutionPaymentStatusReport message is
 * sent by an instructed agent to the previous party in the payment chain. It is
 * used to inform this party about the positive or negative status of an
 * instruction (either single or file). It is also used to report on a pending
 * instruction.<br>
 * <b>Usage</b><br>
 * The FIToFIPaymentStatusReport message is exchanged between agents to provide
 * status information about instructions previously sent. Its usage will always
 * be governed by a bilateral agreement between the agents.<br>
 * The FIToFIPaymentStatusReport message can be used to provide information
 * about the status (e.g. rejection, acceptance) of a credit transfer
 * instruction, a direct debit instruction, as well as other intra-agent
 * instructions (for example FIToFIPaymentCancellationRequest).<br>
 * The FIToFIPaymentStatusReport message refers to the original instruction(s)
 * by means of references only or by means of references and a set of elements
 * from the original instruction.<br>
 * The FIToFIPaymentStatusReport message can be used in domestic and
 * cross-border scenarios.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV06#mmGroupHeader
 * FIToFIPaymentStatusReportV06.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV06#mmOriginalGroupInformationAndStatus
 * FIToFIPaymentStatusReportV06.mmOriginalGroupInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV06#mmTransactionInformationAndStatus
 * FIToFIPaymentStatusReportV06.mmTransactionInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV06#mmSupplementaryData
 * FIToFIPaymentStatusReportV06.mmSupplementaryData}</li>
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
 * xmlTag} = "FIToFIPmtStsRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.PaymentsClearingandSettlementArchive
 * PaymentsClearingandSettlementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code pacs.002.001.06}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupStatusAcceptedRule#for_pacs_FIToFIPaymentStatusReportV06
 * ConstraintGroupStatusAcceptedRule.for_pacs_FIToFIPaymentStatusReportV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupStatusPendingRule#for_pacs_FIToFIPaymentStatusReportV06
 * ConstraintGroupStatusPendingRule.for_pacs_FIToFIPaymentStatusReportV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupStatusRejectedRule#for_pacs_FIToFIPaymentStatusReportV06
 * ConstraintGroupStatusRejectedRule.for_pacs_FIToFIPaymentStatusReportV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupStatusReceivedRule#for_pacs_FIToFIPaymentStatusReportV06
 * ConstraintGroupStatusReceivedRule.for_pacs_FIToFIPaymentStatusReportV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pacs_FIToFIPaymentStatusReportV06
 * ConstraintSupplementaryDataRule.for_pacs_FIToFIPaymentStatusReportV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOriginalGroupInformationAbsenceRule#for_pacs_FIToFIPaymentStatusReportV06
 * ConstraintOriginalGroupInformationAbsenceRule.
 * for_pacs_FIToFIPaymentStatusReportV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOriginalGroupInformationSinglePresenceRule#for_pacs_FIToFIPaymentStatusReportV06
 * ConstraintOriginalGroupInformationSinglePresenceRule.
 * for_pacs_FIToFIPaymentStatusReportV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOriginalGroupInformationMultiplePresenceRule#for_pacs_FIToFIPaymentStatusReportV06
 * ConstraintOriginalGroupInformationMultiplePresenceRule.
 * for_pacs_FIToFIPaymentStatusReportV06}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FIToFIPaymentStatusReportV06"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe FinancialInstitutionToFinancialInstitutionPaymentStatusReport message is sent by an instructed agent to the previous party in the payment chain. It is used to inform this party about the positive or negative status of an instruction (either single or file). It is also used to report on a pending instruction.\r\nUsage\r\nThe FIToFIPaymentStatusReport message is exchanged between agents to provide status information about instructions previously sent. Its usage will always be governed by a bilateral agreement between the agents.\r\nThe FIToFIPaymentStatusReport message can be used to provide information about the status (e.g. rejection, acceptance) of a credit transfer instruction, a direct debit instruction, as well as other intra-agent instructions (for example FIToFIPaymentCancellationRequest).\r\nThe FIToFIPaymentStatusReport message refers to the original instruction(s) by means of references only or by means of references and a set of elements from the original instruction.\r\nThe FIToFIPaymentStatusReport message can be used in domestic and cross-border scenarios."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV07
 * FIToFIPaymentStatusReportV07}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV05
 * FIToFIPaymentStatusReportV05}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FIToFIPaymentStatusReportV06", propOrder = {"groupHeader", "originalGroupInformationAndStatus", "transactionInformationAndStatus", "supplementaryData"})
public class FIToFIPaymentStatusReportV06 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GrpHdr", required = true)
	protected GroupHeader53 groupHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.GroupHeader53
	 * GroupHeader53}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrpHdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of characteristics shared by all individual transactions included in the status report message."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV07#mmGroupHeader
	 * FIToFIPaymentStatusReportV07.mmGroupHeader}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV05#mmGroupHeader
	 * FIToFIPaymentStatusReportV05.mmGroupHeader}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<FIToFIPaymentStatusReportV06, GroupHeader53> mmGroupHeader = new MMMessageBuildingBlock<FIToFIPaymentStatusReportV06, GroupHeader53>() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Set of characteristics shared by all individual transactions included in the status report message.";
			nextVersions_lazy = () -> Arrays.asList(FIToFIPaymentStatusReportV07.mmGroupHeader);
			previousVersion_lazy = () -> FIToFIPaymentStatusReportV05.mmGroupHeader;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GroupHeader53.mmObject();
		}

		@Override
		public GroupHeader53 getValue(FIToFIPaymentStatusReportV06 obj) {
			return obj.getGroupHeader();
		}

		@Override
		public void setValue(FIToFIPaymentStatusReportV06 obj, GroupHeader53 value) {
			obj.setGroupHeader(value);
		}
	};
	@XmlElement(name = "OrgnlGrpInfAndSts")
	protected List<OriginalGroupHeader1> originalGroupInformationAndStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader1
	 * OriginalGroupHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlGrpInfAndSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalGroupInformationAndStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Original group information concerning the group of transactions, to which the status report message refers to."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV07#mmOriginalGroupInformationAndStatus
	 * FIToFIPaymentStatusReportV07.mmOriginalGroupInformationAndStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV05#mmOriginalGroupInformationAndStatus
	 * FIToFIPaymentStatusReportV05.mmOriginalGroupInformationAndStatus}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<FIToFIPaymentStatusReportV06, List<OriginalGroupHeader1>> mmOriginalGroupInformationAndStatus = new MMMessageBuildingBlock<FIToFIPaymentStatusReportV06, List<OriginalGroupHeader1>>() {
		{
			xmlTag = "OrgnlGrpInfAndSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalGroupInformationAndStatus";
			definition = "Original group information concerning the group of transactions, to which the status report message refers to.";
			nextVersions_lazy = () -> Arrays.asList(FIToFIPaymentStatusReportV07.mmOriginalGroupInformationAndStatus);
			previousVersion_lazy = () -> FIToFIPaymentStatusReportV05.mmOriginalGroupInformationAndStatus;
			minOccurs = 0;
			complexType_lazy = () -> OriginalGroupHeader1.mmObject();
		}

		@Override
		public List<OriginalGroupHeader1> getValue(FIToFIPaymentStatusReportV06 obj) {
			return obj.getOriginalGroupInformationAndStatus();
		}

		@Override
		public void setValue(FIToFIPaymentStatusReportV06 obj, List<OriginalGroupHeader1> value) {
			obj.setOriginalGroupInformationAndStatus(value);
		}
	};
	@XmlElement(name = "TxInfAndSts")
	protected List<PaymentTransaction52> transactionInformationAndStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction52
	 * PaymentTransaction52}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxInfAndSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionInformationAndStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information concerning the original transactions, to which the status report message refers."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV07#mmTransactionInformationAndStatus
	 * FIToFIPaymentStatusReportV07.mmTransactionInformationAndStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV05#mmTransactionInformationAndStatus
	 * FIToFIPaymentStatusReportV05.mmTransactionInformationAndStatus}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<FIToFIPaymentStatusReportV06, List<PaymentTransaction52>> mmTransactionInformationAndStatus = new MMMessageBuildingBlock<FIToFIPaymentStatusReportV06, List<PaymentTransaction52>>() {
		{
			xmlTag = "TxInfAndSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionInformationAndStatus";
			definition = "Information concerning the original transactions, to which the status report message refers.";
			nextVersions_lazy = () -> Arrays.asList(FIToFIPaymentStatusReportV07.mmTransactionInformationAndStatus);
			previousVersion_lazy = () -> FIToFIPaymentStatusReportV05.mmTransactionInformationAndStatus;
			minOccurs = 0;
			complexType_lazy = () -> PaymentTransaction52.mmObject();
		}

		@Override
		public List<PaymentTransaction52> getValue(FIToFIPaymentStatusReportV06 obj) {
			return obj.getTransactionInformationAndStatus();
		}

		@Override
		public void setValue(FIToFIPaymentStatusReportV06 obj, List<PaymentTransaction52> value) {
			obj.setTransactionInformationAndStatus(value);
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
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV07#mmSupplementaryData
	 * FIToFIPaymentStatusReportV07.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV05#mmSupplementaryData
	 * FIToFIPaymentStatusReportV05.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<FIToFIPaymentStatusReportV06, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<FIToFIPaymentStatusReportV06, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(FIToFIPaymentStatusReportV07.mmSupplementaryData);
			previousVersion_lazy = () -> FIToFIPaymentStatusReportV05.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(FIToFIPaymentStatusReportV06 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(FIToFIPaymentStatusReportV06 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupStatusAcceptedRule.for_pacs_FIToFIPaymentStatusReportV06,
						com.tools20022.repository.constraints.ConstraintGroupStatusPendingRule.for_pacs_FIToFIPaymentStatusReportV06,
						com.tools20022.repository.constraints.ConstraintGroupStatusRejectedRule.for_pacs_FIToFIPaymentStatusReportV06,
						com.tools20022.repository.constraints.ConstraintGroupStatusReceivedRule.for_pacs_FIToFIPaymentStatusReportV06,
						com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pacs_FIToFIPaymentStatusReportV06,
						com.tools20022.repository.constraints.ConstraintOriginalGroupInformationAbsenceRule.for_pacs_FIToFIPaymentStatusReportV06,
						com.tools20022.repository.constraints.ConstraintOriginalGroupInformationSinglePresenceRule.for_pacs_FIToFIPaymentStatusReportV06,
						com.tools20022.repository.constraints.ConstraintOriginalGroupInformationMultiplePresenceRule.for_pacs_FIToFIPaymentStatusReportV06);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FIToFIPaymentStatusReportV06";
				definition = "Scope\r\nThe FinancialInstitutionToFinancialInstitutionPaymentStatusReport message is sent by an instructed agent to the previous party in the payment chain. It is used to inform this party about the positive or negative status of an instruction (either single or file). It is also used to report on a pending instruction.\r\nUsage\r\nThe FIToFIPaymentStatusReport message is exchanged between agents to provide status information about instructions previously sent. Its usage will always be governed by a bilateral agreement between the agents.\r\nThe FIToFIPaymentStatusReport message can be used to provide information about the status (e.g. rejection, acceptance) of a credit transfer instruction, a direct debit instruction, as well as other intra-agent instructions (for example FIToFIPaymentCancellationRequest).\r\nThe FIToFIPaymentStatusReport message refers to the original instruction(s) by means of references only or by means of references and a set of elements from the original instruction.\r\nThe FIToFIPaymentStatusReport message can be used in domestic and cross-border scenarios.";
				nextVersions_lazy = () -> Arrays.asList(FIToFIPaymentStatusReportV07.mmObject());
				previousVersion_lazy = () -> FIToFIPaymentStatusReportV05.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "FIToFIPmtStsRpt";
				businessArea_lazy = () -> PaymentsClearingandSettlementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV06.mmGroupHeader,
						com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV06.mmOriginalGroupInformationAndStatus, com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV06.mmTransactionInformationAndStatus,
						com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV06.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "pacs";
						messageFunctionality = "002";
						version = "06";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return FIToFIPaymentStatusReportV06.class;
			}
		});
		return mmObject_lazy.get();
	}

	public GroupHeader53 getGroupHeader() {
		return groupHeader;
	}

	public FIToFIPaymentStatusReportV06 setGroupHeader(GroupHeader53 groupHeader) {
		this.groupHeader = Objects.requireNonNull(groupHeader);
		return this;
	}

	public List<OriginalGroupHeader1> getOriginalGroupInformationAndStatus() {
		return originalGroupInformationAndStatus == null ? originalGroupInformationAndStatus = new ArrayList<>() : originalGroupInformationAndStatus;
	}

	public FIToFIPaymentStatusReportV06 setOriginalGroupInformationAndStatus(List<OriginalGroupHeader1> originalGroupInformationAndStatus) {
		this.originalGroupInformationAndStatus = Objects.requireNonNull(originalGroupInformationAndStatus);
		return this;
	}

	public List<PaymentTransaction52> getTransactionInformationAndStatus() {
		return transactionInformationAndStatus == null ? transactionInformationAndStatus = new ArrayList<>() : transactionInformationAndStatus;
	}

	public FIToFIPaymentStatusReportV06 setTransactionInformationAndStatus(List<PaymentTransaction52> transactionInformationAndStatus) {
		this.transactionInformationAndStatus = Objects.requireNonNull(transactionInformationAndStatus);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public FIToFIPaymentStatusReportV06 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.002.001.06")
	static public class Document {
		@XmlElement(name = "FIToFIPmtStsRpt", required = true)
		public FIToFIPaymentStatusReportV06 messageBody;
	}
}