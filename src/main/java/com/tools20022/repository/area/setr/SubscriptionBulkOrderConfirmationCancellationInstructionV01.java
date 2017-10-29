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

package com.tools20022.repository.area.setr;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMXor;
import com.tools20022.repository.area.SecuritiesTradePreviousVersion;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.InvestmentFundsISOPreviousversion;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * <b>Scope</b><br>
 * An executing party, for example, a transfer agent sends the
 * SubscriptionBulkOrderConfirmationCancellationInstruction message to the
 * instructing party, for example, an investment manager or its authorised
 * representative to cancel a previously sent SubscriptionBulkOrderConfirmation.<br>
 * <b>Usage</b><br>
 * The SubscriptionBulkOrderConfirmationCancellationInstruction message is used
 * to cancel one or more previously sent subscription bulk order confirmations.<br>
 * The amendment indicator element is used to specify whether the subscription
 * bulk order confirmation cancellation is to be followed by a
 * SubscriptionBulkOrderConfirmationAmendment.<br>
 * The SubscriptionBulkOrderConfirmationCancellationInstruction message is used
 * to either:<br>
 * - cancel an entire SubscriptionBulkOrderConfirmation message, that is, all
 * the individual order confirmations that it contained, or,<br>
 * - request the cancellation of one or more individual confirmations.<br>
 * There are two ways to use the message.<br>
 * (1) When the SubscriptionBulkOrderConfirmationCancellationInstruction message
 * is used to cancel an entire message, this can be done by either:<br>
 * - quoting the business references, for example, OrderReference, Deal
 * Reference, of all the individual order confirmations listed in the
 * SubscriptionBulkOrderConfirmation message, or,<br>
 * - quoting the details of all the individual order confirmations (this
 * includes the OrderReference and DealReference) listed in
 * SubscriptionBulkOrderConfirmation message but this is not recommended.<br>
 * The message identification of the SubscriptionOrderConfirmation message may
 * also be quoted in PreviousReference.<br>
 * It is also possible to instruct the cancellation of an entire confirmation
 * message by quoting its message identification in PreviousReference, but this
 * is not recommended.<br>
 * (2) When the SubscriptionBulkOrderConfirmationCancellationInstruction message
 * is used to cancel one or more individual order confirmations, this can be
 * done by either:<br>
 * - quoting the business references, for example, OrderReference, Deal
 * Reference, of each individual order confirmation listed in the
 * SubscriptionBulkOrderConfirmation message, or,<br>
 * - quoting the details of each individual order execution (this includes the
 * OrderReference and DealReference) listed in SubscriptionBulkOrderConfirmation
 * message but this is not recommended.<br>
 * The message identification of the SubscriptionBulkOrderConfirmation message
 * in which the individual order confirmation was conveyed may also be quoted in
 * PreviousReference.<br>
 * The rejection or acceptance of a
 * SubscriptionBulkOrderConfirmationCancellationInstruction is made using an
 * OrderConfirmationStatusReport message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesTradePreviousVersion
 * SecuritiesTradePreviousVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.InvestmentFundsISOPreviousversion
 * InvestmentFundsISOPreviousversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "SbcptBlkOrdrConfCxlInstrV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV01#CancellationByReferenceOrByOrderConfirmationDetailsRule
 * SubscriptionBulkOrderConfirmationCancellationInstructionV01.
 * CancellationByReferenceOrByOrderConfirmationDetailsRule}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV01#MessageIdentification
 * SubscriptionBulkOrderConfirmationCancellationInstructionV01.
 * MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV01#PoolReference
 * SubscriptionBulkOrderConfirmationCancellationInstructionV01.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV01#PreviousReference
 * SubscriptionBulkOrderConfirmationCancellationInstructionV01.PreviousReference
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV01#RelatedReference
 * SubscriptionBulkOrderConfirmationCancellationInstructionV01.RelatedReference}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV01#CancellationByReference
 * SubscriptionBulkOrderConfirmationCancellationInstructionV01.
 * CancellationByReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV01#CancellationByOrderConfirmationDetails
 * SubscriptionBulkOrderConfirmationCancellationInstructionV01.
 * CancellationByOrderConfirmationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV01#CopyDetails
 * SubscriptionBulkOrderConfirmationCancellationInstructionV01.CopyDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} =
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV01#identifier
 * SubscriptionBulkOrderConfirmationCancellationInstructionV01.identifier}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SubscriptionBulkOrderConfirmationCancellationInstructionV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn executing party, for example, a transfer agent sends the SubscriptionBulkOrderConfirmationCancellationInstruction message to the instructing party, for example, an investment manager or its authorised representative to cancel a previously sent SubscriptionBulkOrderConfirmation.\r\nUsage\r\nThe SubscriptionBulkOrderConfirmationCancellationInstruction message is used to cancel one or more previously sent subscription bulk order confirmations.\r\nThe amendment indicator element is used to specify whether the subscription bulk order confirmation cancellation is to be followed by a SubscriptionBulkOrderConfirmationAmendment.\r\nThe SubscriptionBulkOrderConfirmationCancellationInstruction message is used to either:\r\n- cancel an entire SubscriptionBulkOrderConfirmation message, that is, all the individual order confirmations that it contained, or,\r\n- request the cancellation of one or more individual confirmations.\r\nThere are two ways to use the message.\r\n(1) When the SubscriptionBulkOrderConfirmationCancellationInstruction message is used to cancel an entire message, this can be done by either:\r\n- quoting the business references, for example, OrderReference, Deal Reference, of all the individual order confirmations listed in the SubscriptionBulkOrderConfirmation message, or,\r\n- quoting the details of all the individual order confirmations (this includes the OrderReference and DealReference) listed in SubscriptionBulkOrderConfirmation message but this is not recommended.\r\nThe message identification of the SubscriptionOrderConfirmation message may also be quoted in PreviousReference.\r\nIt is also possible to instruct the cancellation of an entire confirmation message by quoting its message identification in PreviousReference, but this is not recommended.\r\n(2) When the SubscriptionBulkOrderConfirmationCancellationInstruction message is used to cancel one or more individual order confirmations, this can be done by either:\r\n- quoting the business references, for example, OrderReference, Deal Reference, of each individual order confirmation listed in the SubscriptionBulkOrderConfirmation message, or,\r\n- quoting the details of each individual order execution (this includes the OrderReference and DealReference) listed in SubscriptionBulkOrderConfirmation message but this is not recommended.\r\nThe message identification of the SubscriptionBulkOrderConfirmation message in which the individual order confirmation was conveyed may also be quoted in PreviousReference.\r\nThe rejection or acceptance of a SubscriptionBulkOrderConfirmationCancellationInstruction is made using an OrderConfirmationStatusReport message."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV02
 * SubscriptionBulkOrderConfirmationCancellationInstructionV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class SubscriptionBulkOrderConfirmationCancellationInstructionV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * Either CancellationByOrderConfirmationDetails or CancellationByReference
	 * may be present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMXor#getImpactedMessageBuildingBlocks
	 * impactedMessageBuildingBlocks} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV01#CancellationByReference
	 * SubscriptionBulkOrderConfirmationCancellationInstructionV01.
	 * CancellationByReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV01#CancellationByOrderConfirmationDetails
	 * SubscriptionBulkOrderConfirmationCancellationInstructionV01.
	 * CancellationByOrderConfirmationDetails}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageDefinition
	 * messageDefinition} =
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV01
	 * SubscriptionBulkOrderConfirmationCancellationInstructionV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationByReferenceOrByOrderConfirmationDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either CancellationByOrderConfirmationDetails or CancellationByReference may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor CancellationByReferenceOrByOrderConfirmationDetailsRule = new MMXor() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationByReferenceOrByOrderConfirmationDetailsRule";
			definition = "Either CancellationByOrderConfirmationDetails or CancellationByReference may be present, but not both.";
			messageDefinition_lazy = () -> SubscriptionBulkOrderConfirmationCancellationInstructionV01.mmObject();
			impactedMessageBuildingBlocks_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV01.CancellationByReference,
					com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV01.CancellationByOrderConfirmationDetails);
		}
	};
	/**
	 * Reference that uniquely identifies a message from a business application
	 * standpoint.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference that uniquely identifies a message from a business application standpoint."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV02#MessageIdentification
	 * SubscriptionBulkOrderConfirmationCancellationInstructionV02.
	 * MessageIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock MessageIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Reference that uniquely identifies a message from a business application standpoint.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV02.MessageIdentification);
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}
	};
	/**
	 * Collective reference identifying a set of messages.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PoolRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collective reference identifying a set of messages."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV02#PoolReference
	 * SubscriptionBulkOrderConfirmationCancellationInstructionV02.PoolReference
	 * }</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock PoolReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "PoolRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolReference";
			definition = "Collective reference identifying a set of messages.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV02.PoolReference);
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}
	};
	/**
	 * Reference to a linked message that was previously sent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV02#PreviousReference
	 * SubscriptionBulkOrderConfirmationCancellationInstructionV02.
	 * PreviousReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock PreviousReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "PrvsRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReference";
			definition = "Reference to a linked message that was previously sent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV02.PreviousReference);
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV02#RelatedReference
	 * SubscriptionBulkOrderConfirmationCancellationInstructionV02.
	 * RelatedReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock RelatedReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "RltdRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference to a linked message that was previously received.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV02.RelatedReference);
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}
	};
	/**
	 * References of the orders confirmations to be cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrderExecution1
	 * InvestmentFundOrderExecution1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlByRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationByReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "References of the orders confirmations to be cancelled."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock CancellationByReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "CxlByRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationByReference";
			definition = "References of the orders confirmations to be cancelled.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> InvestmentFundOrderExecution1.mmObject();
		}
	};
	/**
	 * Common information related to all the orders confirmations to be
	 * cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrderConfirmation1
	 * SubscriptionBulkOrderConfirmation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlByOrdrConfDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationByOrderConfirmationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Common information related to all the orders confirmations to be cancelled."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock CancellationByOrderConfirmationDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "CxlByOrdrConfDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationByOrderConfirmationDetails";
			definition = "Common information related to all the orders confirmations to be cancelled.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> SubscriptionBulkOrderConfirmation1.mmObject();
		}
	};
	/**
	 * Message is a copy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CopyInformation2
	 * CopyInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CpyDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CopyDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Message is a copy."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV02#CopyDetails
	 * SubscriptionBulkOrderConfirmationCancellationInstructionV02.CopyDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock CopyDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "CpyDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CopyDetails";
			definition = "Message is a copy.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV02.CopyDetails);
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> CopyInformation2.mmObject();
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
	 * businessArea} = "setr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getMessageFunctionality
	 * messageFunctionality} = "049"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getFlavour
	 * flavour} = "001"</li>
	 * </ul>
	 */
	public static final MMMessageDefinitionIdentifier identifier = new MMMessageDefinitionIdentifier() {
		{
			businessArea = "setr";
			messageFunctionality = "049";
			version = "01";
			flavour = "001";
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SubscriptionBulkOrderConfirmationCancellationInstructionV01";
				definition = "Scope\r\nAn executing party, for example, a transfer agent sends the SubscriptionBulkOrderConfirmationCancellationInstruction message to the instructing party, for example, an investment manager or its authorised representative to cancel a previously sent SubscriptionBulkOrderConfirmation.\r\nUsage\r\nThe SubscriptionBulkOrderConfirmationCancellationInstruction message is used to cancel one or more previously sent subscription bulk order confirmations.\r\nThe amendment indicator element is used to specify whether the subscription bulk order confirmation cancellation is to be followed by a SubscriptionBulkOrderConfirmationAmendment.\r\nThe SubscriptionBulkOrderConfirmationCancellationInstruction message is used to either:\r\n- cancel an entire SubscriptionBulkOrderConfirmation message, that is, all the individual order confirmations that it contained, or,\r\n- request the cancellation of one or more individual confirmations.\r\nThere are two ways to use the message.\r\n(1) When the SubscriptionBulkOrderConfirmationCancellationInstruction message is used to cancel an entire message, this can be done by either:\r\n- quoting the business references, for example, OrderReference, Deal Reference, of all the individual order confirmations listed in the SubscriptionBulkOrderConfirmation message, or,\r\n- quoting the details of all the individual order confirmations (this includes the OrderReference and DealReference) listed in SubscriptionBulkOrderConfirmation message but this is not recommended.\r\nThe message identification of the SubscriptionOrderConfirmation message may also be quoted in PreviousReference.\r\nIt is also possible to instruct the cancellation of an entire confirmation message by quoting its message identification in PreviousReference, but this is not recommended.\r\n(2) When the SubscriptionBulkOrderConfirmationCancellationInstruction message is used to cancel one or more individual order confirmations, this can be done by either:\r\n- quoting the business references, for example, OrderReference, Deal Reference, of each individual order confirmation listed in the SubscriptionBulkOrderConfirmation message, or,\r\n- quoting the details of each individual order execution (this includes the OrderReference and DealReference) listed in SubscriptionBulkOrderConfirmation message but this is not recommended.\r\nThe message identification of the SubscriptionBulkOrderConfirmation message in which the individual order confirmation was conveyed may also be quoted in PreviousReference.\r\nThe rejection or acceptance of a SubscriptionBulkOrderConfirmationCancellationInstruction is made using an OrderConfirmationStatusReport message.";
				nextVersions_lazy = () -> Arrays.asList(SubscriptionBulkOrderConfirmationCancellationInstructionV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(InvestmentFundsISOPreviousversion.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV01.CancellationByReferenceOrByOrderConfirmationDetailsRule);
				rootElement = "Document";
				xmlTag = "SbcptBlkOrdrConfCxlInstrV01";
				businessArea_lazy = () -> SecuritiesTradePreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV01.MessageIdentification,
						com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV01.PoolReference,
						com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV01.PreviousReference,
						com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV01.RelatedReference,
						com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV01.CancellationByReference,
						com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV01.CancellationByOrderConfirmationDetails,
						com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV01.CopyDetails);
				messageDefinitionIdentifier_lazy = () -> com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV01.identifier;
			}
		});
		return mmObject_lazy.get();
	}
}