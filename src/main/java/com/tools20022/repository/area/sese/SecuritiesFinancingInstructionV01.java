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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesSettlementArchive;
import com.tools20022.repository.choice.NumberCount1Choice;
import com.tools20022.repository.choice.PartyIdentification10Choice;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An account owner sends a SecuritiesFinancingInstruction to a securities
 * financing transaction account servicer to notify the securities financing
 * transaction account servicer of the details of a repurchase agreement,
 * reverse repurchase agreement, securities lending or securities borrowing
 * transaction to allow the account servicer to manage the settlement and
 * follow-up of the opening and closing leg of the transaction.<br>
 * The account owner/servicer relationship may be:<br>
 * - a global custodian which has an account with a local custodian, or<br>
 * - an investment management institution which manage a fund account opened at
 * a custodian, or<br>
 * - a broker which has an account with a custodian, or<br>
 * - a central securities depository participant which has an account with a
 * central securities depository, or<br>
 * - a central securities depository which has an account with a custodian,
 * another central securities depository or another settlement market
 * infrastructure, or<br>
 * - a central counterparty or a stock exchange or a trade matching utility
 * which need to instruct the settlement of securities financing transactions to
 * a central securities depository or another settlement market infrastructure.<br>
 * <b>Usage</b><br>
 * The message may also be used to:<br>
 * - re-send a message previously sent (the sub-function of the message is
 * Duplicate),<br>
 * - provide a third party with a copy of a message for information (the
 * sub-function of the message is Copy),<br>
 * - re-send to a third party a copy of a message for information (the
 * sub-function of the message is Copy Duplicate). ISO 15022 - 20022 Coexistence
 * This ISO 20022 message is reversed engineered from ISO 15022. Both standards
 * will coexist for a certain number of years. Until this coexistence period
 * ends, the usage of certain data types is restricted to ensure
 * interoperability between ISO 15022 and 20022 users. Compliance to these rules
 * is mandatory in a coexistence environment. The coexistence restrictions are
 * described in a Textual Rule linked to the Message Items they concern. These
 * coexistence textual rules are clearly identified as follows:
 * “CoexistenceXxxxRule”.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.033.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementArchive
 * SecuritiesSettlementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01#mmIdentification
 * SecuritiesFinancingInstructionV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01#mmTransactionTypeAndAdditionalParameters
 * SecuritiesFinancingInstructionV01.mmTransactionTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01#mmNumberCounts
 * SecuritiesFinancingInstructionV01.mmNumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01#mmLinkages
 * SecuritiesFinancingInstructionV01.mmLinkages}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01#mmTradeDetails
 * SecuritiesFinancingInstructionV01.mmTradeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01#mmFinancialInstrumentIdentification
 * SecuritiesFinancingInstructionV01.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01#mmFinancialInstrumentAttributes
 * SecuritiesFinancingInstructionV01.mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01#mmQuantityAndAccountDetails
 * SecuritiesFinancingInstructionV01.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01#mmSecuritiesFinancingDetails
 * SecuritiesFinancingInstructionV01.mmSecuritiesFinancingDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01#mmSettlementParameters
 * SecuritiesFinancingInstructionV01.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01#mmStandingSettlementInstructionDetails
 * SecuritiesFinancingInstructionV01.mmStandingSettlementInstructionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01#mmDeliveringSettlementParties
 * SecuritiesFinancingInstructionV01.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01#mmReceivingSettlementParties
 * SecuritiesFinancingInstructionV01.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01#mmCashParties
 * SecuritiesFinancingInstructionV01.mmCashParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01#mmOpeningSettlementAmount
 * SecuritiesFinancingInstructionV01.mmOpeningSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01#mmOtherAmounts
 * SecuritiesFinancingInstructionV01.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01#mmOtherBusinessParties
 * SecuritiesFinancingInstructionV01.mmOtherBusinessParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01#mmMessageOriginator
 * SecuritiesFinancingInstructionV01.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01#mmMessageRecipient
 * SecuritiesFinancingInstructionV01.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01#mmExtension
 * SecuritiesFinancingInstructionV01.mmExtension}</li>
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
 * xmlTag} = "SctiesFincgInstr"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesFinancingInstructionV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account owner sends a SecuritiesFinancingInstruction to a securities financing transaction account servicer to notify the securities financing transaction account servicer of the details of a repurchase agreement, reverse repurchase agreement, securities lending or securities borrowing transaction to allow the account servicer to manage the settlement and follow-up of the opening and closing leg of the transaction.\r\nThe account owner/servicer relationship may be:\r\n- a global custodian which has an account with a local custodian, or\r\n- an investment management institution which manage a fund account opened at a custodian, or\r\n- a broker which has an account with a custodian, or\r\n- a central securities depository participant which has an account with a central securities depository, or\r\n- a central securities depository which has an account with a custodian, another central securities depository or another settlement market infrastructure, or\r\n- a central counterparty or a stock exchange or a trade matching utility which need to instruct the settlement of securities financing transactions to a central securities depository or another settlement market infrastructure.\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent (the sub-function of the message is Duplicate),\r\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\r\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate).\nISO 15022 - 20022 Coexistence\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment. The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows: “CoexistenceXxxxRule”."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#for_sese_SecuritiesFinancingInstructionV01
 * ConstraintCoexistenceAmountRule.for_sese_SecuritiesFinancingInstructionV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_sese_SecuritiesFinancingInstructionV01
 * ConstraintCoexistenceCharacterSetXRule.
 * for_sese_SecuritiesFinancingInstructionV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule#for_sese_SecuritiesFinancingInstructionV01
 * ConstraintCoexistenceIdentificationRule.
 * for_sese_SecuritiesFinancingInstructionV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementAmountRule#for_sese_SecuritiesFinancingInstructionV01
 * ConstraintSettlementAmountRule.for_sese_SecuritiesFinancingInstructionV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSellerSSI2Rule#for_sese_SecuritiesFinancingInstructionV01
 * ConstraintSellerSSI2Rule.for_sese_SecuritiesFinancingInstructionV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintBuyerSSI2Rule#for_sese_SecuritiesFinancingInstructionV01
 * ConstraintBuyerSSI2Rule.for_sese_SecuritiesFinancingInstructionV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliveringDepositoryAndParty1Part1Rule#for_sese_SecuritiesFinancingInstructionV01
 * ConstraintDeliveringDepositoryAndParty1Part1Rule.
 * for_sese_SecuritiesFinancingInstructionV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Part1Rule#for_sese_SecuritiesFinancingInstructionV01
 * ConstraintReceivingDepositoryAndParty1Part1Rule.
 * for_sese_SecuritiesFinancingInstructionV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliveringDepositoryAndParty1Part2Rule#for_sese_SecuritiesFinancingInstructionV01
 * ConstraintDeliveringDepositoryAndParty1Part2Rule.
 * for_sese_SecuritiesFinancingInstructionV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Part2Rule#for_sese_SecuritiesFinancingInstructionV01
 * ConstraintReceivingDepositoryAndParty1Part2Rule.
 * for_sese_SecuritiesFinancingInstructionV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesFinancingInstructionV01
 * ConstraintSecuritiesMarketPracticeGroupGuideline.
 * for_sese_SecuritiesFinancingInstructionV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSellerSSI1Rule#for_sese_SecuritiesFinancingInstructionV01
 * ConstraintSellerSSI1Rule.for_sese_SecuritiesFinancingInstructionV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintBuyerSSI1Rule#for_sese_SecuritiesFinancingInstructionV01
 * ConstraintBuyerSSI1Rule.for_sese_SecuritiesFinancingInstructionV01}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = ISO15022Synonym: MT 540-3, Seq A :23G:NEWM or PREA, Seq D
 * present</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV02
 * SecuritiesFinancingInstructionV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesFinancingInstructionV01", propOrder = {"identification", "transactionTypeAndAdditionalParameters", "numberCounts", "linkages", "tradeDetails", "financialInstrumentIdentification", "financialInstrumentAttributes",
		"quantityAndAccountDetails", "securitiesFinancingDetails", "settlementParameters", "standingSettlementInstructionDetails", "deliveringSettlementParties", "receivingSettlementParties", "cashParties", "openingSettlementAmount",
		"otherAmounts", "otherBusinessParties", "messageOriginator", "messageRecipient", "extension"})
public class SecuritiesFinancingInstructionV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected TransactionAndDocumentIdentification1 identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactionAndDocumentIdentification1
	 * TransactionAndDocumentIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information that unambiguously identifies a SecuritiesFinancingTransaction (unique per piece of collateral) and a SecuritiesFinancingInstruction message as known by the account owner (or the instructing party acting on its behalf)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingInstructionV01, TransactionAndDocumentIdentification1> mmIdentification = new MMMessageBuildingBlock<SecuritiesFinancingInstructionV01, TransactionAndDocumentIdentification1>() {
		{
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Information that unambiguously identifies a SecuritiesFinancingTransaction (unique per piece of collateral) and a SecuritiesFinancingInstruction message as known by the account owner (or the instructing party acting on its behalf).";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TransactionAndDocumentIdentification1.mmObject();
		}

		@Override
		public TransactionAndDocumentIdentification1 getValue(SecuritiesFinancingInstructionV01 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(SecuritiesFinancingInstructionV01 obj, TransactionAndDocumentIdentification1 value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "TxTpAndAddtlParams", required = true)
	protected TransactionTypeAndAdditionalParameters1 transactionTypeAndAdditionalParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters1
	 * TransactionTypeAndAdditionalParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxTpAndAddtlParams"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionTypeAndAdditionalParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities financing transaction identification information, type (repurchase agreement, reverse repurchase agreement, securities lending or securities borrowing) and other parameters."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingInstructionV01, TransactionTypeAndAdditionalParameters1> mmTransactionTypeAndAdditionalParameters = new MMMessageBuildingBlock<SecuritiesFinancingInstructionV01, TransactionTypeAndAdditionalParameters1>() {
		{
			xmlTag = "TxTpAndAddtlParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionTypeAndAdditionalParameters";
			definition = "Securities financing transaction identification information, type (repurchase agreement, reverse repurchase agreement, securities lending or securities borrowing) and other parameters.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TransactionTypeAndAdditionalParameters1.mmObject();
		}

		@Override
		public TransactionTypeAndAdditionalParameters1 getValue(SecuritiesFinancingInstructionV01 obj) {
			return obj.getTransactionTypeAndAdditionalParameters();
		}

		@Override
		public void setValue(SecuritiesFinancingInstructionV01 obj, TransactionTypeAndAdditionalParameters1 value) {
			obj.setTransactionTypeAndAdditionalParameters(value);
		}
	};
	@XmlElement(name = "NbCounts")
	protected NumberCount1Choice numberCounts;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.NumberCount1Choice
	 * NumberCount1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbCounts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberCounts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Count of the number of transactions linked."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingInstructionV01, Optional<NumberCount1Choice>> mmNumberCounts = new MMMessageBuildingBlock<SecuritiesFinancingInstructionV01, Optional<NumberCount1Choice>>() {
		{
			xmlTag = "NbCounts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberCounts";
			definition = "Count of the number of transactions linked.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> NumberCount1Choice.mmObject();
		}

		@Override
		public Optional<NumberCount1Choice> getValue(SecuritiesFinancingInstructionV01 obj) {
			return obj.getNumberCounts();
		}

		@Override
		public void setValue(SecuritiesFinancingInstructionV01 obj, Optional<NumberCount1Choice> value) {
			obj.setNumberCounts(value.orElse(null));
		}
	};
	@XmlElement(name = "Lnkgs")
	protected List<Linkages1> linkages;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Linkages1
	 * Linkages1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lnkgs"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Linkages"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Link to another transaction that must be processed after, before or at the same time."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingInstructionV01, List<Linkages1>> mmLinkages = new MMMessageBuildingBlock<SecuritiesFinancingInstructionV01, List<Linkages1>>() {
		{
			xmlTag = "Lnkgs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Linkages";
			definition = "Link to another transaction that must be processed after, before or at the same time.";
			minOccurs = 0;
			complexType_lazy = () -> Linkages1.mmObject();
		}

		@Override
		public List<Linkages1> getValue(SecuritiesFinancingInstructionV01 obj) {
			return obj.getLinkages();
		}

		@Override
		public void setValue(SecuritiesFinancingInstructionV01 obj, List<Linkages1> value) {
			obj.setLinkages(value);
		}
	};
	@XmlElement(name = "TradDtls", required = true)
	protected SecuritiesTradeDetails3 tradeDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails3
	 * SecuritiesTradeDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the securities financing deal."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingInstructionV01, SecuritiesTradeDetails3> mmTradeDetails = new MMMessageBuildingBlock<SecuritiesFinancingInstructionV01, SecuritiesTradeDetails3>() {
		{
			xmlTag = "TradDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDetails";
			definition = "Details of the securities financing deal.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesTradeDetails3.mmObject();
		}

		@Override
		public SecuritiesTradeDetails3 getValue(SecuritiesFinancingInstructionV01 obj) {
			return obj.getTradeDetails();
		}

		@Override
		public void setValue(SecuritiesFinancingInstructionV01 obj, SecuritiesTradeDetails3 value) {
			obj.setTradeDetails(value);
		}
	};
	@XmlElement(name = "FinInstrmId", required = true)
	protected SecurityIdentification11 financialInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification11
	 * SecurityIdentification11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instrument representing a sum of rights of the investor vis-a-vis the issuer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingInstructionV01, SecurityIdentification11> mmFinancialInstrumentIdentification = new MMMessageBuildingBlock<SecuritiesFinancingInstructionV01, SecurityIdentification11>() {
		{
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Financial instrument representing a sum of rights of the investor vis-a-vis the issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecurityIdentification11.mmObject();
		}

		@Override
		public SecurityIdentification11 getValue(SecuritiesFinancingInstructionV01 obj) {
			return obj.getFinancialInstrumentIdentification();
		}

		@Override
		public void setValue(SecuritiesFinancingInstructionV01 obj, SecurityIdentification11 value) {
			obj.setFinancialInstrumentIdentification(value);
		}
	};
	@XmlElement(name = "FinInstrmAttrbts")
	protected FinancialInstrumentAttributes8 financialInstrumentAttributes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8
	 * FinancialInstrumentAttributes8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmAttrbts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Elements characterising a financial instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingInstructionV01, Optional<FinancialInstrumentAttributes8>> mmFinancialInstrumentAttributes = new MMMessageBuildingBlock<SecuritiesFinancingInstructionV01, Optional<FinancialInstrumentAttributes8>>() {
		{
			xmlTag = "FinInstrmAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributes";
			definition = "Elements characterising a financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentAttributes8.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentAttributes8> getValue(SecuritiesFinancingInstructionV01 obj) {
			return obj.getFinancialInstrumentAttributes();
		}

		@Override
		public void setValue(SecuritiesFinancingInstructionV01 obj, Optional<FinancialInstrumentAttributes8> value) {
			obj.setFinancialInstrumentAttributes(value.orElse(null));
		}
	};
	@XmlElement(name = "QtyAndAcctDtls", required = true)
	protected QuantityAndAccount1 quantityAndAccountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount1
	 * QuantityAndAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtyAndAcctDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityAndAccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details related to the account and quantity involved in the transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingInstructionV01, QuantityAndAccount1> mmQuantityAndAccountDetails = new MMMessageBuildingBlock<SecuritiesFinancingInstructionV01, QuantityAndAccount1>() {
		{
			xmlTag = "QtyAndAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityAndAccountDetails";
			definition = "Details related to the account and quantity involved in the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> QuantityAndAccount1.mmObject();
		}

		@Override
		public QuantityAndAccount1 getValue(SecuritiesFinancingInstructionV01 obj) {
			return obj.getQuantityAndAccountDetails();
		}

		@Override
		public void setValue(SecuritiesFinancingInstructionV01 obj, QuantityAndAccount1 value) {
			obj.setQuantityAndAccountDetails(value);
		}
	};
	@XmlElement(name = "SctiesFincgDtls", required = true)
	protected SecuritiesFinancingTransactionDetails1 securitiesFinancingDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1
	 * SecuritiesFinancingTransactionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesFincgDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesFinancingDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details for the closing of the securities financing transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingInstructionV01, SecuritiesFinancingTransactionDetails1> mmSecuritiesFinancingDetails = new MMMessageBuildingBlock<SecuritiesFinancingInstructionV01, SecuritiesFinancingTransactionDetails1>() {
		{
			xmlTag = "SctiesFincgDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesFinancingDetails";
			definition = "Details for the closing of the securities financing transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesFinancingTransactionDetails1.mmObject();
		}

		@Override
		public SecuritiesFinancingTransactionDetails1 getValue(SecuritiesFinancingInstructionV01 obj) {
			return obj.getSecuritiesFinancingDetails();
		}

		@Override
		public void setValue(SecuritiesFinancingInstructionV01 obj, SecuritiesFinancingTransactionDetails1 value) {
			obj.setSecuritiesFinancingDetails(value);
		}
	};
	@XmlElement(name = "SttlmParams")
	protected SettlementDetails3 settlementParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails3
	 * SettlementDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmParams"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parameters which explicitly state the conditions that must be fulfilled before a particular transaction of a financial instrument can be settled. These parameters are defined by the instructing party in compliance with settlement rules in the market the transaction will settle in."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingInstructionV01, Optional<SettlementDetails3>> mmSettlementParameters = new MMMessageBuildingBlock<SecuritiesFinancingInstructionV01, Optional<SettlementDetails3>>() {
		{
			xmlTag = "SttlmParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParameters";
			definition = "Parameters which explicitly state the conditions that must be fulfilled before a particular transaction of a financial instrument can be settled. These parameters are defined by the instructing party in compliance with settlement rules in the market the transaction will settle in.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementDetails3.mmObject();
		}

		@Override
		public Optional<SettlementDetails3> getValue(SecuritiesFinancingInstructionV01 obj) {
			return obj.getSettlementParameters();
		}

		@Override
		public void setValue(SecuritiesFinancingInstructionV01 obj, Optional<SettlementDetails3> value) {
			obj.setSettlementParameters(value.orElse(null));
		}
	};
	@XmlElement(name = "StgSttlmInstrDtls")
	protected StandingSettlementInstruction1 standingSettlementInstructionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction1
	 * StandingSettlementInstruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StgSttlmInstrDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingSettlementInstructionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies what settlement standing instruction database is to be used to derive the settlement parties involved in the transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingInstructionV01, Optional<StandingSettlementInstruction1>> mmStandingSettlementInstructionDetails = new MMMessageBuildingBlock<SecuritiesFinancingInstructionV01, Optional<StandingSettlementInstruction1>>() {
		{
			xmlTag = "StgSttlmInstrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingSettlementInstructionDetails";
			definition = "Specifies what settlement standing instruction database is to be used to derive the settlement parties involved in the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> StandingSettlementInstruction1.mmObject();
		}

		@Override
		public Optional<StandingSettlementInstruction1> getValue(SecuritiesFinancingInstructionV01 obj) {
			return obj.getStandingSettlementInstructionDetails();
		}

		@Override
		public void setValue(SecuritiesFinancingInstructionV01 obj, Optional<StandingSettlementInstruction1> value) {
			obj.setStandingSettlementInstructionDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "DlvrgSttlmPties")
	protected SettlementParties5 deliveringSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties5
	 * SettlementParties5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrgSttlmPties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringSettlementParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the chain of delivering settlement parties."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingInstructionV01, Optional<SettlementParties5>> mmDeliveringSettlementParties = new MMMessageBuildingBlock<SecuritiesFinancingInstructionV01, Optional<SettlementParties5>>() {
		{
			xmlTag = "DlvrgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringSettlementParties";
			definition = "Identifies the chain of delivering settlement parties.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementParties5.mmObject();
		}

		@Override
		public Optional<SettlementParties5> getValue(SecuritiesFinancingInstructionV01 obj) {
			return obj.getDeliveringSettlementParties();
		}

		@Override
		public void setValue(SecuritiesFinancingInstructionV01 obj, Optional<SettlementParties5> value) {
			obj.setDeliveringSettlementParties(value.orElse(null));
		}
	};
	@XmlElement(name = "RcvgSttlmPties")
	protected SettlementParties5 receivingSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties5
	 * SettlementParties5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvgSttlmPties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingSettlementParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the chain of receiving settlement parties."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingInstructionV01, Optional<SettlementParties5>> mmReceivingSettlementParties = new MMMessageBuildingBlock<SecuritiesFinancingInstructionV01, Optional<SettlementParties5>>() {
		{
			xmlTag = "RcvgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingSettlementParties";
			definition = "Identifies the chain of receiving settlement parties.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementParties5.mmObject();
		}

		@Override
		public Optional<SettlementParties5> getValue(SecuritiesFinancingInstructionV01 obj) {
			return obj.getReceivingSettlementParties();
		}

		@Override
		public void setValue(SecuritiesFinancingInstructionV01 obj, Optional<SettlementParties5> value) {
			obj.setReceivingSettlementParties(value.orElse(null));
		}
	};
	@XmlElement(name = "CshPties")
	protected CashParties3 cashParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CashParties3
	 * CashParties3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshPties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash parties involved in the transaction if different for the securities settlement parties."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingInstructionV01, Optional<CashParties3>> mmCashParties = new MMMessageBuildingBlock<SecuritiesFinancingInstructionV01, Optional<CashParties3>>() {
		{
			xmlTag = "CshPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashParties";
			definition = "Cash parties involved in the transaction if different for the securities settlement parties.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CashParties3.mmObject();
		}

		@Override
		public Optional<CashParties3> getValue(SecuritiesFinancingInstructionV01 obj) {
			return obj.getCashParties();
		}

		@Override
		public void setValue(SecuritiesFinancingInstructionV01 obj, Optional<CashParties3> value) {
			obj.setCashParties(value.orElse(null));
		}
	};
	@XmlElement(name = "OpngSttlmAmt")
	protected AmountAndDirection2 openingSettlementAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection2
	 * AmountAndDirection2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OpngSttlmAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of money to be paid or received in exchange for the securities at the opening of a securities financing transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingInstructionV01, Optional<AmountAndDirection2>> mmOpeningSettlementAmount = new MMMessageBuildingBlock<SecuritiesFinancingInstructionV01, Optional<AmountAndDirection2>>() {
		{
			xmlTag = "OpngSttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningSettlementAmount";
			definition = "Total amount of money to be paid or received in exchange for the securities at the opening of a securities financing transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection2.mmObject();
		}

		@Override
		public Optional<AmountAndDirection2> getValue(SecuritiesFinancingInstructionV01 obj) {
			return obj.getOpeningSettlementAmount();
		}

		@Override
		public void setValue(SecuritiesFinancingInstructionV01 obj, Optional<AmountAndDirection2> value) {
			obj.setOpeningSettlementAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrAmts")
	protected OtherAmounts3 otherAmounts;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.OtherAmounts3
	 * OtherAmounts3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrAmts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherAmounts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other amounts than the settlement amount."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingInstructionV01, Optional<OtherAmounts3>> mmOtherAmounts = new MMMessageBuildingBlock<SecuritiesFinancingInstructionV01, Optional<OtherAmounts3>>() {
		{
			xmlTag = "OthrAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherAmounts";
			definition = "Other amounts than the settlement amount.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> OtherAmounts3.mmObject();
		}

		@Override
		public Optional<OtherAmounts3> getValue(SecuritiesFinancingInstructionV01 obj) {
			return obj.getOtherAmounts();
		}

		@Override
		public void setValue(SecuritiesFinancingInstructionV01 obj, Optional<OtherAmounts3> value) {
			obj.setOtherAmounts(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrBizPties")
	protected OtherParties2 otherBusinessParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.OtherParties2
	 * OtherParties2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrBizPties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherBusinessParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other business parties relevant to the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingInstructionV01, Optional<OtherParties2>> mmOtherBusinessParties = new MMMessageBuildingBlock<SecuritiesFinancingInstructionV01, Optional<OtherParties2>>() {
		{
			xmlTag = "OthrBizPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherBusinessParties";
			definition = "Other business parties relevant to the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> OtherParties2.mmObject();
		}

		@Override
		public Optional<OtherParties2> getValue(SecuritiesFinancingInstructionV01 obj) {
			return obj.getOtherBusinessParties();
		}

		@Override
		public void setValue(SecuritiesFinancingInstructionV01 obj, Optional<OtherParties2> value) {
			obj.setOtherBusinessParties(value.orElse(null));
		}
	};
	@XmlElement(name = "MsgOrgtr")
	protected PartyIdentification10Choice messageOriginator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification10Choice
	 * PartyIdentification10Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgOrgtr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageOriginator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that originated the message, if other than the sender."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingInstructionV01, Optional<PartyIdentification10Choice>> mmMessageOriginator = new MMMessageBuildingBlock<SecuritiesFinancingInstructionV01, Optional<PartyIdentification10Choice>>() {
		{
			xmlTag = "MsgOrgtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOriginator";
			definition = "Party that originated the message, if other than the sender.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification10Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification10Choice> getValue(SecuritiesFinancingInstructionV01 obj) {
			return obj.getMessageOriginator();
		}

		@Override
		public void setValue(SecuritiesFinancingInstructionV01 obj, Optional<PartyIdentification10Choice> value) {
			obj.setMessageOriginator(value.orElse(null));
		}
	};
	@XmlElement(name = "MsgRcpt")
	protected PartyIdentification10Choice messageRecipient;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification10Choice
	 * PartyIdentification10Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgRcpt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageRecipient"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that is the final destination of the message, if other than the receiver."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingInstructionV01, Optional<PartyIdentification10Choice>> mmMessageRecipient = new MMMessageBuildingBlock<SecuritiesFinancingInstructionV01, Optional<PartyIdentification10Choice>>() {
		{
			xmlTag = "MsgRcpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageRecipient";
			definition = "Party that is the final destination of the message, if other than the receiver.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification10Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification10Choice> getValue(SecuritiesFinancingInstructionV01 obj) {
			return obj.getMessageRecipient();
		}

		@Override
		public void setValue(SecuritiesFinancingInstructionV01 obj, Optional<PartyIdentification10Choice> value) {
			obj.setMessageRecipient(value.orElse(null));
		}
	};
	@XmlElement(name = "Xtnsn")
	protected List<Extension2> extension;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Extension2
	 * Extension2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Xtnsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Extension"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingInstructionV01, List<Extension2>> mmExtension = new MMMessageBuildingBlock<SecuritiesFinancingInstructionV01, List<Extension2>>() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> Extension2.mmObject();
		}

		@Override
		public List<Extension2> getValue(SecuritiesFinancingInstructionV01 obj) {
			return obj.getExtension();
		}

		@Override
		public void setValue(SecuritiesFinancingInstructionV01 obj, List<Extension2> value) {
			obj.setExtension(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.for_sese_SecuritiesFinancingInstructionV01,
						com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_sese_SecuritiesFinancingInstructionV01,
						com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule.for_sese_SecuritiesFinancingInstructionV01,
						com.tools20022.repository.constraints.ConstraintSettlementAmountRule.for_sese_SecuritiesFinancingInstructionV01,
						com.tools20022.repository.constraints.ConstraintSellerSSI2Rule.for_sese_SecuritiesFinancingInstructionV01, com.tools20022.repository.constraints.ConstraintBuyerSSI2Rule.for_sese_SecuritiesFinancingInstructionV01,
						com.tools20022.repository.constraints.ConstraintDeliveringDepositoryAndParty1Part1Rule.for_sese_SecuritiesFinancingInstructionV01,
						com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Part1Rule.for_sese_SecuritiesFinancingInstructionV01,
						com.tools20022.repository.constraints.ConstraintDeliveringDepositoryAndParty1Part2Rule.for_sese_SecuritiesFinancingInstructionV01,
						com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Part2Rule.for_sese_SecuritiesFinancingInstructionV01,
						com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesFinancingInstructionV01,
						com.tools20022.repository.constraints.ConstraintSellerSSI1Rule.for_sese_SecuritiesFinancingInstructionV01, com.tools20022.repository.constraints.ConstraintBuyerSSI1Rule.for_sese_SecuritiesFinancingInstructionV01);
				semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, "MT 540-3, Seq A :23G:NEWM or PREA, Seq D present"));
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesFinancingInstructionV01";
				definition = "Scope\r\nAn account owner sends a SecuritiesFinancingInstruction to a securities financing transaction account servicer to notify the securities financing transaction account servicer of the details of a repurchase agreement, reverse repurchase agreement, securities lending or securities borrowing transaction to allow the account servicer to manage the settlement and follow-up of the opening and closing leg of the transaction.\r\nThe account owner/servicer relationship may be:\r\n- a global custodian which has an account with a local custodian, or\r\n- an investment management institution which manage a fund account opened at a custodian, or\r\n- a broker which has an account with a custodian, or\r\n- a central securities depository participant which has an account with a central securities depository, or\r\n- a central securities depository which has an account with a custodian, another central securities depository or another settlement market infrastructure, or\r\n- a central counterparty or a stock exchange or a trade matching utility which need to instruct the settlement of securities financing transactions to a central securities depository or another settlement market infrastructure.\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent (the sub-function of the message is Duplicate),\r\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\r\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate).\nISO 15022 - 20022 Coexistence\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment. The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows: “CoexistenceXxxxRule”.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingInstructionV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "SctiesFincgInstr";
				businessArea_lazy = () -> SecuritiesSettlementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01.mmIdentification,
						com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01.mmTransactionTypeAndAdditionalParameters, com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01.mmNumberCounts,
						com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01.mmLinkages, com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01.mmTradeDetails,
						com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01.mmFinancialInstrumentIdentification, com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01.mmFinancialInstrumentAttributes,
						com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01.mmQuantityAndAccountDetails, com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01.mmSecuritiesFinancingDetails,
						com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01.mmSettlementParameters, com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01.mmStandingSettlementInstructionDetails,
						com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01.mmDeliveringSettlementParties, com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01.mmReceivingSettlementParties,
						com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01.mmCashParties, com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01.mmOpeningSettlementAmount,
						com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01.mmOtherAmounts, com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01.mmOtherBusinessParties,
						com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01.mmMessageOriginator, com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01.mmMessageRecipient,
						com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "033";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesFinancingInstructionV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public TransactionAndDocumentIdentification1 getIdentification() {
		return identification;
	}

	public SecuritiesFinancingInstructionV01 setIdentification(TransactionAndDocumentIdentification1 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public TransactionTypeAndAdditionalParameters1 getTransactionTypeAndAdditionalParameters() {
		return transactionTypeAndAdditionalParameters;
	}

	public SecuritiesFinancingInstructionV01 setTransactionTypeAndAdditionalParameters(TransactionTypeAndAdditionalParameters1 transactionTypeAndAdditionalParameters) {
		this.transactionTypeAndAdditionalParameters = Objects.requireNonNull(transactionTypeAndAdditionalParameters);
		return this;
	}

	public Optional<NumberCount1Choice> getNumberCounts() {
		return numberCounts == null ? Optional.empty() : Optional.of(numberCounts);
	}

	public SecuritiesFinancingInstructionV01 setNumberCounts(NumberCount1Choice numberCounts) {
		this.numberCounts = numberCounts;
		return this;
	}

	public List<Linkages1> getLinkages() {
		return linkages == null ? linkages = new ArrayList<>() : linkages;
	}

	public SecuritiesFinancingInstructionV01 setLinkages(List<Linkages1> linkages) {
		this.linkages = Objects.requireNonNull(linkages);
		return this;
	}

	public SecuritiesTradeDetails3 getTradeDetails() {
		return tradeDetails;
	}

	public SecuritiesFinancingInstructionV01 setTradeDetails(SecuritiesTradeDetails3 tradeDetails) {
		this.tradeDetails = Objects.requireNonNull(tradeDetails);
		return this;
	}

	public SecurityIdentification11 getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public SecuritiesFinancingInstructionV01 setFinancialInstrumentIdentification(SecurityIdentification11 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = Objects.requireNonNull(financialInstrumentIdentification);
		return this;
	}

	public Optional<FinancialInstrumentAttributes8> getFinancialInstrumentAttributes() {
		return financialInstrumentAttributes == null ? Optional.empty() : Optional.of(financialInstrumentAttributes);
	}

	public SecuritiesFinancingInstructionV01 setFinancialInstrumentAttributes(FinancialInstrumentAttributes8 financialInstrumentAttributes) {
		this.financialInstrumentAttributes = financialInstrumentAttributes;
		return this;
	}

	public QuantityAndAccount1 getQuantityAndAccountDetails() {
		return quantityAndAccountDetails;
	}

	public SecuritiesFinancingInstructionV01 setQuantityAndAccountDetails(QuantityAndAccount1 quantityAndAccountDetails) {
		this.quantityAndAccountDetails = Objects.requireNonNull(quantityAndAccountDetails);
		return this;
	}

	public SecuritiesFinancingTransactionDetails1 getSecuritiesFinancingDetails() {
		return securitiesFinancingDetails;
	}

	public SecuritiesFinancingInstructionV01 setSecuritiesFinancingDetails(SecuritiesFinancingTransactionDetails1 securitiesFinancingDetails) {
		this.securitiesFinancingDetails = Objects.requireNonNull(securitiesFinancingDetails);
		return this;
	}

	public Optional<SettlementDetails3> getSettlementParameters() {
		return settlementParameters == null ? Optional.empty() : Optional.of(settlementParameters);
	}

	public SecuritiesFinancingInstructionV01 setSettlementParameters(SettlementDetails3 settlementParameters) {
		this.settlementParameters = settlementParameters;
		return this;
	}

	public Optional<StandingSettlementInstruction1> getStandingSettlementInstructionDetails() {
		return standingSettlementInstructionDetails == null ? Optional.empty() : Optional.of(standingSettlementInstructionDetails);
	}

	public SecuritiesFinancingInstructionV01 setStandingSettlementInstructionDetails(StandingSettlementInstruction1 standingSettlementInstructionDetails) {
		this.standingSettlementInstructionDetails = standingSettlementInstructionDetails;
		return this;
	}

	public Optional<SettlementParties5> getDeliveringSettlementParties() {
		return deliveringSettlementParties == null ? Optional.empty() : Optional.of(deliveringSettlementParties);
	}

	public SecuritiesFinancingInstructionV01 setDeliveringSettlementParties(SettlementParties5 deliveringSettlementParties) {
		this.deliveringSettlementParties = deliveringSettlementParties;
		return this;
	}

	public Optional<SettlementParties5> getReceivingSettlementParties() {
		return receivingSettlementParties == null ? Optional.empty() : Optional.of(receivingSettlementParties);
	}

	public SecuritiesFinancingInstructionV01 setReceivingSettlementParties(SettlementParties5 receivingSettlementParties) {
		this.receivingSettlementParties = receivingSettlementParties;
		return this;
	}

	public Optional<CashParties3> getCashParties() {
		return cashParties == null ? Optional.empty() : Optional.of(cashParties);
	}

	public SecuritiesFinancingInstructionV01 setCashParties(CashParties3 cashParties) {
		this.cashParties = cashParties;
		return this;
	}

	public Optional<AmountAndDirection2> getOpeningSettlementAmount() {
		return openingSettlementAmount == null ? Optional.empty() : Optional.of(openingSettlementAmount);
	}

	public SecuritiesFinancingInstructionV01 setOpeningSettlementAmount(AmountAndDirection2 openingSettlementAmount) {
		this.openingSettlementAmount = openingSettlementAmount;
		return this;
	}

	public Optional<OtherAmounts3> getOtherAmounts() {
		return otherAmounts == null ? Optional.empty() : Optional.of(otherAmounts);
	}

	public SecuritiesFinancingInstructionV01 setOtherAmounts(OtherAmounts3 otherAmounts) {
		this.otherAmounts = otherAmounts;
		return this;
	}

	public Optional<OtherParties2> getOtherBusinessParties() {
		return otherBusinessParties == null ? Optional.empty() : Optional.of(otherBusinessParties);
	}

	public SecuritiesFinancingInstructionV01 setOtherBusinessParties(OtherParties2 otherBusinessParties) {
		this.otherBusinessParties = otherBusinessParties;
		return this;
	}

	public Optional<PartyIdentification10Choice> getMessageOriginator() {
		return messageOriginator == null ? Optional.empty() : Optional.of(messageOriginator);
	}

	public SecuritiesFinancingInstructionV01 setMessageOriginator(PartyIdentification10Choice messageOriginator) {
		this.messageOriginator = messageOriginator;
		return this;
	}

	public Optional<PartyIdentification10Choice> getMessageRecipient() {
		return messageRecipient == null ? Optional.empty() : Optional.of(messageRecipient);
	}

	public SecuritiesFinancingInstructionV01 setMessageRecipient(PartyIdentification10Choice messageRecipient) {
		this.messageRecipient = messageRecipient;
		return this;
	}

	public List<Extension2> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public SecuritiesFinancingInstructionV01 setExtension(List<Extension2> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.033.001.01")
	static public class Document {
		@XmlElement(name = "SctiesFincgInstr", required = true)
		public SecuritiesFinancingInstructionV01 messageBody;
	}
}