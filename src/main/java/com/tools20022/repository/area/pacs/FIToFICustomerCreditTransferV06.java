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
import com.tools20022.repository.area.PaymentsClearingandSettlementLatestVersion;
import com.tools20022.repository.msg.CreditTransferTransaction25;
import com.tools20022.repository.msg.GroupHeader70;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.PaymentsClearingandSettlementISOLatestversion;
import com.tools20022.repository.msgset.PaymentsClearingandSettlementMaintenance20162017;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The FinancialInstitutionToFinancialInstitutionCustomerCreditTransfer message
 * is sent by the debtor agent to the creditor agent, directly or through other
 * agents and/or a payment clearing and settlement system. It is used to move
 * funds from a debtor account to a creditor.<br>
 * <b>Usage</b><br>
 * The FIToFICustomerCreditTransfer message is exchanged between agents and can
 * contain one or more customer credit transfer instructions.<br>
 * The FIToFICustomerCreditTransfer message does not allow for grouping: a
 * CreditTransferTransactionInformation block must be present for each credit
 * transfer transaction.<br>
 * The FIToFICustomerCreditTransfer message can be used in different ways:<br>
 * - If the instructing agent and the instructed agent wish to use their direct
 * account relationship in the currency of the transfer then the message
 * contains both the funds for the customer transfer(s) as well as the payment
 * details;<br>
 * - If the instructing agent and the instructed agent have no direct account
 * relationship in the currency of the transfer, or do not wish to use their
 * account relationship, then other (reimbursement) agents will be involved to
 * cover for the customer transfer(s). The FIToFICustomerCreditTransfer contains
 * only the payment details and the instructing agent must cover the customer
 * transfer by sending a FinancialInstitutionCreditTransfer to a reimbursement
 * agent. This payment method is called the Cover method;<br>
 * - If more than two financial institutions are involved in the payment chain
 * and if the FIToFICustomerCreditTransfer is sent from one financial
 * institution to the next financial institution in the payment chain, then the
 * payment method is called the Serial method.<br>
 * The FIToFICustomerCreditTransfer message can be used in domestic and
 * cross-border scenarios.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV06#mmGroupHeader
 * FIToFICustomerCreditTransferV06.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV06#mmCreditTransferTransactionInformation
 * FIToFICustomerCreditTransferV06.mmCreditTransferTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV06#mmSupplementaryData
 * FIToFICustomerCreditTransferV06.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.PaymentsClearingandSettlementISOLatestversion
 * PaymentsClearingandSettlementISOLatestversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.PaymentsClearingandSettlementMaintenance20162017
 * PaymentsClearingandSettlementMaintenance20162017}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "FIToFICstmrCdtTrf"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.PaymentsClearingandSettlementLatestVersion
 * PaymentsClearingandSettlementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code pacs.008.001.06}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructedAgentRule#forFIToFICustomerCreditTransferV06
 * ConstraintInstructedAgentRule.forFIToFICustomerCreditTransferV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructingAgentRule#forFIToFICustomerCreditTransferV06
 * ConstraintInstructingAgentRule.forFIToFICustomerCreditTransferV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalInterbankSettlementAmountRule#forFIToFICustomerCreditTransferV06
 * ConstraintTotalInterbankSettlementAmountRule.
 * forFIToFICustomerCreditTransferV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalInterbankSettlementAmountAndSumRule#forFIToFICustomerCreditTransferV06
 * ConstraintTotalInterbankSettlementAmountAndSumRule.
 * forFIToFICustomerCreditTransferV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule#forFIToFICustomerCreditTransferV06
 * ConstraintGroupHeaderInterbankSettlementDateRule.
 * forFIToFICustomerCreditTransferV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTransactionInterbankSettlementDateRule#forFIToFICustomerCreditTransferV06
 * ConstraintTransactionInterbankSettlementDateRule.
 * forFIToFICustomerCreditTransferV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPaymentTypeInformationRule#forFIToFICustomerCreditTransferV06
 * ConstraintPaymentTypeInformationRule.forFIToFICustomerCreditTransferV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNumberOfTransactionsAndCreditTransfersRule#forFIToFICustomerCreditTransferV06
 * ConstraintNumberOfTransactionsAndCreditTransfersRule.
 * forFIToFICustomerCreditTransferV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forFIToFICustomerCreditTransferV06
 * ConstraintSupplementaryDataRule.forFIToFICustomerCreditTransferV06}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FIToFICustomerCreditTransferV06"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe FinancialInstitutionToFinancialInstitutionCustomerCreditTransfer message is sent by the debtor agent to the creditor agent, directly or through other agents and/or a payment clearing and settlement system. It is used to move funds from a debtor account to a creditor.\r\nUsage\r\nThe FIToFICustomerCreditTransfer message is exchanged between agents and can contain one or more customer credit transfer instructions.\r\nThe FIToFICustomerCreditTransfer message does not allow for grouping: a CreditTransferTransactionInformation block must be present for each credit transfer transaction.\r\nThe FIToFICustomerCreditTransfer message can be used in different ways:\r\n- If the instructing agent and the instructed agent wish to use their direct account relationship in the currency of the transfer then the message contains both the funds for the customer transfer(s) as well as the payment details;\r\n- If the instructing agent and the instructed agent have no direct account relationship in the currency of the transfer, or do not wish to use their account relationship, then other (reimbursement) agents will be involved to cover for the customer transfer(s). The FIToFICustomerCreditTransfer contains only the payment details and the instructing agent must cover the customer transfer by sending a FinancialInstitutionCreditTransfer to a reimbursement agent. This payment method is called the Cover method;\r\n- If more than two financial institutions are involved in the payment chain and if the FIToFICustomerCreditTransfer is sent from one financial institution to the next financial institution in the payment chain, then the payment method is called the Serial method.\r\nThe FIToFICustomerCreditTransfer message can be used in domestic and cross-border scenarios."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV05
 * FIToFICustomerCreditTransferV05}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FIToFICustomerCreditTransferV06", propOrder = {"groupHeader", "creditTransferTransactionInformation", "supplementaryData"})
public class FIToFICustomerCreditTransferV06 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GrpHdr", required = true)
	protected GroupHeader70 groupHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.GroupHeader70
	 * GroupHeader70}</li>
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
	 * "Set of characteristics shared by all individual transactions included in the message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV05#mmGroupHeader
	 * FIToFICustomerCreditTransferV05.mmGroupHeader}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmGroupHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Set of characteristics shared by all individual transactions included in the message.";
			previousVersion_lazy = () -> FIToFICustomerCreditTransferV05.mmGroupHeader;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GroupHeader70.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FIToFICustomerCreditTransferV06.class.getMethod("getGroupHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "CdtTrfTxInf", required = true)
	protected List<CreditTransferTransaction25> creditTransferTransactionInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25
	 * CreditTransferTransaction25}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtTrfTxInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditTransferTransactionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements providing information specific to the individual credit transfer(s)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV05#mmCreditTransferTransactionInformation
	 * FIToFICustomerCreditTransferV05.mmCreditTransferTransactionInformation}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCreditTransferTransactionInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "CdtTrfTxInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditTransferTransactionInformation";
			definition = "Set of elements providing information specific to the individual credit transfer(s).";
			previousVersion_lazy = () -> FIToFICustomerCreditTransferV05.mmCreditTransferTransactionInformation;
			minOccurs = 1;
			complexType_lazy = () -> CreditTransferTransaction25.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FIToFICustomerCreditTransferV06.class.getMethod("getCreditTransferTransactionInformation", new Class[]{});
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV05#mmSupplementaryData
	 * FIToFICustomerCreditTransferV05.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			previousVersion_lazy = () -> FIToFICustomerCreditTransferV05.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FIToFICustomerCreditTransferV06.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInstructedAgentRule.forFIToFICustomerCreditTransferV06,
						com.tools20022.repository.constraints.ConstraintInstructingAgentRule.forFIToFICustomerCreditTransferV06,
						com.tools20022.repository.constraints.ConstraintTotalInterbankSettlementAmountRule.forFIToFICustomerCreditTransferV06,
						com.tools20022.repository.constraints.ConstraintTotalInterbankSettlementAmountAndSumRule.forFIToFICustomerCreditTransferV06,
						com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule.forFIToFICustomerCreditTransferV06,
						com.tools20022.repository.constraints.ConstraintTransactionInterbankSettlementDateRule.forFIToFICustomerCreditTransferV06,
						com.tools20022.repository.constraints.ConstraintPaymentTypeInformationRule.forFIToFICustomerCreditTransferV06,
						com.tools20022.repository.constraints.ConstraintNumberOfTransactionsAndCreditTransfersRule.forFIToFICustomerCreditTransferV06,
						com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forFIToFICustomerCreditTransferV06);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FIToFICustomerCreditTransferV06";
				definition = "Scope\r\nThe FinancialInstitutionToFinancialInstitutionCustomerCreditTransfer message is sent by the debtor agent to the creditor agent, directly or through other agents and/or a payment clearing and settlement system. It is used to move funds from a debtor account to a creditor.\r\nUsage\r\nThe FIToFICustomerCreditTransfer message is exchanged between agents and can contain one or more customer credit transfer instructions.\r\nThe FIToFICustomerCreditTransfer message does not allow for grouping: a CreditTransferTransactionInformation block must be present for each credit transfer transaction.\r\nThe FIToFICustomerCreditTransfer message can be used in different ways:\r\n- If the instructing agent and the instructed agent wish to use their direct account relationship in the currency of the transfer then the message contains both the funds for the customer transfer(s) as well as the payment details;\r\n- If the instructing agent and the instructed agent have no direct account relationship in the currency of the transfer, or do not wish to use their account relationship, then other (reimbursement) agents will be involved to cover for the customer transfer(s). The FIToFICustomerCreditTransfer contains only the payment details and the instructing agent must cover the customer transfer by sending a FinancialInstitutionCreditTransfer to a reimbursement agent. This payment method is called the Cover method;\r\n- If more than two financial institutions are involved in the payment chain and if the FIToFICustomerCreditTransfer is sent from one financial institution to the next financial institution in the payment chain, then the payment method is called the Serial method.\r\nThe FIToFICustomerCreditTransfer message can be used in domestic and cross-border scenarios.";
				previousVersion_lazy = () -> FIToFICustomerCreditTransferV05.mmObject();
				messageSet_lazy = () -> Arrays.asList(PaymentsClearingandSettlementISOLatestversion.mmObject(), PaymentsClearingandSettlementMaintenance20162017.mmObject());
				rootElement = "Document";
				xmlTag = "FIToFICstmrCdtTrf";
				businessArea_lazy = () -> PaymentsClearingandSettlementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV06.mmGroupHeader,
						com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV06.mmCreditTransferTransactionInformation, com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV06.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "pacs";
						messageFunctionality = "008";
						version = "06";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return FIToFICustomerCreditTransferV06.class;
			}
		});
		return mmObject_lazy.get();
	}

	public GroupHeader70 getGroupHeader() {
		return groupHeader;
	}

	public FIToFICustomerCreditTransferV06 setGroupHeader(GroupHeader70 groupHeader) {
		this.groupHeader = Objects.requireNonNull(groupHeader);
		return this;
	}

	public List<CreditTransferTransaction25> getCreditTransferTransactionInformation() {
		return creditTransferTransactionInformation == null ? creditTransferTransactionInformation = new ArrayList<>() : creditTransferTransactionInformation;
	}

	public FIToFICustomerCreditTransferV06 setCreditTransferTransactionInformation(List<CreditTransferTransaction25> creditTransferTransactionInformation) {
		this.creditTransferTransactionInformation = Objects.requireNonNull(creditTransferTransactionInformation);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public FIToFICustomerCreditTransferV06 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.06")
	static public class Document {
		@XmlElement(name = "FIToFICstmrCdtTrf", required = true)
		public FIToFICustomerCreditTransferV06 messageBody;
	}
}