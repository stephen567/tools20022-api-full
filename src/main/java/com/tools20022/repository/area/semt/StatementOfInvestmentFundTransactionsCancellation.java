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
import com.tools20022.repository.area.SecuritiesManagementArchive;
import com.tools20022.repository.msg.AdditionalReference2;
import com.tools20022.repository.msg.Pagination;
import com.tools20022.repository.msg.StatementOfInvestmentFundTransactions1;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * <b>Scope</b><br>
 * The StatementOfInvestmentFundTransactionsCancellation message is sent by an
 * account servicer to the account owner or the account owner's designated
 * agent. The account servicer may be a fund administrator or fund intermediary,
 * trustee or registrar, etc.<br>
 * This message is used to cancel a previously sent
 * StatementOfInvestmentFundTransactions message.<br>
 * <b>Usage</b><br>
 * The StatementOfInvestmentFundTransactionsCancellation message is sent by an
 * account servicer to the account owner to cancel a previously sent
 * StatementOfInvestmentFundTransactions message.<br>
 * This message must contain the reference of the message to be cancelled. This
 * message may also contain all the details of the message to be cancelled, but
 * this is not recommended.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesManagementArchive
 * SecuritiesManagementArchive}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlName
 * xmlName} = "semt.007.001.01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "semt.007.001.01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellation#PreviousReference
 * StatementOfInvestmentFundTransactionsCancellation.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellation#RelatedReference
 * StatementOfInvestmentFundTransactionsCancellation.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellation#MessagePagination
 * StatementOfInvestmentFundTransactionsCancellation.MessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellation#StatementToBeCancelled
 * StatementOfInvestmentFundTransactionsCancellation.StatementToBeCancelled}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} =
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellation#identifier
 * StatementOfInvestmentFundTransactionsCancellation.identifier}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StatementOfInvestmentFundTransactionsCancellation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe StatementOfInvestmentFundTransactionsCancellation message is sent by an account servicer to the account owner or the account owner's designated agent. The account servicer may be a fund administrator or fund intermediary, trustee or registrar, etc.\r\nThis message is used to cancel a previously sent StatementOfInvestmentFundTransactions message.\r\nUsage\r\nThe StatementOfInvestmentFundTransactionsCancellation message is sent by an account servicer to the account owner to cancel a previously sent StatementOfInvestmentFundTransactions message.\r\nThis message must contain the reference of the message to be cancelled. This message may also contain all the details of the message to be cancelled, but this is not recommended."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellationV02
 * StatementOfInvestmentFundTransactionsCancellationV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class StatementOfInvestmentFundTransactionsCancellation {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * Reference to a linked message that was previously sent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference2
	 * AdditionalReference2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference to a linked message that was previously sent."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock PreviousReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "PrvsRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReference";
			definition = "Reference to a linked message that was previously sent.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> AdditionalReference2.mmObject();
		}
	};
	/**
	 * Reference to a linked message that was previously received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference2
	 * AdditionalReference2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to a linked message that was previously received."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock RelatedReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "RltdRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference to a linked message that was previously received.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> AdditionalReference2.mmObject();
		}
	};
	/**
	 * Pagination of the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Pagination
	 * Pagination}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgPgntn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessagePagination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Pagination of the message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock MessagePagination = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgPgntn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessagePagination";
			definition = "Pagination of the message.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> Pagination.mmObject();
		}
	};
	/**
	 * The Statement of Investment Fund Transactions message to cancel.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions1
	 * StatementOfInvestmentFundTransactions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtToBeCanc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementToBeCancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Statement of Investment Fund Transactions message to cancel."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock StatementToBeCancelled = new MMMessageBuildingBlock() {
		{
			xmlTag = "StmtToBeCanc";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementToBeCancelled";
			definition = "The Statement of Investment Fund Transactions message to cancel.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> StatementOfInvestmentFundTransactions1.mmObject();
		}
	};
	/**
	 * An instance of MessageDefinitionIdentifier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getVersion
	 * version} = "01"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getBusinessArea
	 * businessArea} = "semt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getMessageFunctionality
	 * messageFunctionality} = "007"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getFlavour
	 * flavour} = "001"</li>
	 * </ul>
	 */
	public static final MMMessageDefinitionIdentifier identifier = new MMMessageDefinitionIdentifier() {
		{
			businessArea = "semt";
			messageFunctionality = "007";
			version = "01";
			flavour = "001";
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "StatementOfInvestmentFundTransactionsCancellation";
				definition = "Scope\r\nThe StatementOfInvestmentFundTransactionsCancellation message is sent by an account servicer to the account owner or the account owner's designated agent. The account servicer may be a fund administrator or fund intermediary, trustee or registrar, etc.\r\nThis message is used to cancel a previously sent StatementOfInvestmentFundTransactions message.\r\nUsage\r\nThe StatementOfInvestmentFundTransactionsCancellation message is sent by an account servicer to the account owner to cancel a previously sent StatementOfInvestmentFundTransactions message.\r\nThis message must contain the reference of the message to be cancelled. This message may also contain all the details of the message to be cancelled, but this is not recommended.";
				nextVersions_lazy = () -> Arrays.asList(StatementOfInvestmentFundTransactionsCancellationV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "semt.007.001.01";
				businessArea_lazy = () -> SecuritiesManagementArchive.mmObject();
				xmlName = "semt.007.001.01";
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellation.PreviousReference,
						com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellation.RelatedReference, com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellation.MessagePagination,
						com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellation.StatementToBeCancelled);
				messageDefinitionIdentifier_lazy = () -> com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellation.identifier;
			}
		});
		return mmObject_lazy.get();
	}
}