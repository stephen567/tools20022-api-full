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
import com.tools20022.repository.area.SecuritiesSettlementPreviousVersion;
import com.tools20022.repository.choice.References49Choice;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.InvestmentFundsISOPreviousversion;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An executing party, for example, a transfer agent, sends the
 * TransferCancellationStatusReport message to the instructing party, for
 * example, an investment manager or one of its authorised representatives to
 * provide the status of a previously received transfer cancellation
 * instruction.<br>
 * <b>Usage</b><br>
 * The TransferCancellationStatusReport message is used to report on the status
 * of a transfer in or transfer out cancellation request.<br>
 * The reference of the transfer instruction for which the cancellation status
 * is reported is identified in TransferReference. The message identification of
 * the transfer cancellation request message in which the transfer instruction
 * was conveyed may also be quoted in RelatedReference.<br>
 * The message identification of the transfer instruction request message in
 * which the transfer instruction was conveyed may also be quoted in
 * RelatedReference.<br>
 * One of the following statuses can be reported:<br>
 * - the transfer cancellation is accepted, or,<br>
 * - the transfer cancellation has been sent to the next party, or,<br>
 * - the transfer cancellation is complete and the reason for the status,<br>
 * - the transfer cancellation pending and the reason for the status,<br>
 * - the transfer cancellation is rejected and the reason for the status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.010.001.05}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementPreviousVersion
 * SecuritiesSettlementPreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV05#mmMessageIdentification
 * TransferCancellationStatusReportV05.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV05#mmCounterpartyReference
 * TransferCancellationStatusReportV05.mmCounterpartyReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV05#mmReference
 * TransferCancellationStatusReportV05.mmReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV05#mmStatusReport
 * TransferCancellationStatusReportV05.mmStatusReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV05#mmMarketPracticeVersion
 * TransferCancellationStatusReportV05.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV05#mmExtension
 * TransferCancellationStatusReportV05.mmExtension}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.InvestmentFundsISOPreviousversion
 * InvestmentFundsISOPreviousversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "TrfCxlStsRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransferCancellationStatusReportV05"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn executing party, for example, a transfer agent, sends the TransferCancellationStatusReport message to the instructing party, for example, an investment manager or one of its authorised representatives to provide the status of a previously received transfer cancellation instruction.\r\nUsage\r\nThe TransferCancellationStatusReport message is used to report on the status of a transfer in or transfer out cancellation request.\r\nThe reference of the transfer instruction for which the cancellation status is reported is identified in TransferReference. The message identification of the transfer cancellation request message in which the transfer instruction was conveyed may also be quoted in RelatedReference.\r\nThe message identification of the transfer instruction request message in which the transfer instruction was conveyed may also be quoted in RelatedReference.\r\nOne of the following statuses can be reported:\r\n- the transfer cancellation is accepted, or,\r\n- the transfer cancellation has been sent to the next party, or,\r\n- the transfer cancellation is complete and the reason for the status,\r\n- the transfer cancellation pending and the reason for the status,\r\n- the transfer cancellation is rejected and the reason for the status."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherReferenceRule#for_sese_TransferCancellationStatusReportV05
 * ConstraintOtherReferenceRule.for_sese_TransferCancellationStatusReportV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintRelatedReferenceRule#for_sese_TransferCancellationStatusReportV05
 * ConstraintRelatedReferenceRule.for_sese_TransferCancellationStatusReportV05}</li>
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
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV06
 * TransferCancellationStatusReportV06}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV04
 * TransferCancellationStatusReportV04}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransferCancellationStatusReportV05", propOrder = {"messageIdentification", "counterpartyReference", "reference", "statusReport", "marketPracticeVersion", "extension"})
public class TransferCancellationStatusReportV05 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgId", required = true)
	protected MessageIdentification1 messageIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference that uniquely identifies a message from a business application standpoint."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV06#mmMessageIdentification
	 * TransferCancellationStatusReportV06.mmMessageIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV04#mmMessageIdentification
	 * TransferCancellationStatusReportV04.mmMessageIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<TransferCancellationStatusReportV05, MessageIdentification1> mmMessageIdentification = new MMMessageBuildingBlock<TransferCancellationStatusReportV05, MessageIdentification1>() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Reference that uniquely identifies a message from a business application standpoint.";
			nextVersions_lazy = () -> Arrays.asList(TransferCancellationStatusReportV06.mmMessageIdentification);
			previousVersion_lazy = () -> TransferCancellationStatusReportV04.mmMessageIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(TransferCancellationStatusReportV05 obj) {
			return obj.getMessageIdentification();
		}

		@Override
		public void setValue(TransferCancellationStatusReportV05 obj, MessageIdentification1 value) {
			obj.setMessageIdentification(value);
		}
	};
	@XmlElement(name = "CtrPtyRef")
	protected AdditionalReference7 counterpartyReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference7
	 * AdditionalReference7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrPtyRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the transfer allocated by the counterparty."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV06#mmCounterpartyReference
	 * TransferCancellationStatusReportV06.mmCounterpartyReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV04#mmCounterpartyReference
	 * TransferCancellationStatusReportV04.mmCounterpartyReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<TransferCancellationStatusReportV05, Optional<AdditionalReference7>> mmCounterpartyReference = new MMMessageBuildingBlock<TransferCancellationStatusReportV05, Optional<AdditionalReference7>>() {
		{
			xmlTag = "CtrPtyRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyReference";
			definition = "Unambiguous identification of the transfer allocated by the counterparty.";
			nextVersions_lazy = () -> Arrays.asList(TransferCancellationStatusReportV06.mmCounterpartyReference);
			previousVersion_lazy = () -> TransferCancellationStatusReportV04.mmCounterpartyReference;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference7.mmObject();
		}

		@Override
		public Optional<AdditionalReference7> getValue(TransferCancellationStatusReportV05 obj) {
			return obj.getCounterpartyReference();
		}

		@Override
		public void setValue(TransferCancellationStatusReportV05 obj, Optional<AdditionalReference7> value) {
			obj.setCounterpartyReference(value.orElse(null));
		}
	};
	@XmlElement(name = "Ref")
	protected References49Choice reference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.References49Choice
	 * References49Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ref"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the message or communication that was previously received."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV06#mmReference
	 * TransferCancellationStatusReportV06.mmReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV04#mmReference
	 * TransferCancellationStatusReportV04.mmReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<TransferCancellationStatusReportV05, Optional<References49Choice>> mmReference = new MMMessageBuildingBlock<TransferCancellationStatusReportV05, Optional<References49Choice>>() {
		{
			xmlTag = "Ref";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reference";
			definition = "Reference to the message or communication that was previously received.";
			nextVersions_lazy = () -> Arrays.asList(TransferCancellationStatusReportV06.mmReference);
			previousVersion_lazy = () -> TransferCancellationStatusReportV04.mmReference;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> References49Choice.mmObject();
		}

		@Override
		public Optional<References49Choice> getValue(TransferCancellationStatusReportV05 obj) {
			return obj.getReference();
		}

		@Override
		public void setValue(TransferCancellationStatusReportV05 obj, Optional<References49Choice> value) {
			obj.setReference(value.orElse(null));
		}
	};
	@XmlElement(name = "StsRpt", required = true)
	protected CancellationStatusAndReason3 statusReport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusAndReason3
	 * CancellationStatusAndReason3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsRpt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the transfer cancellation instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV06#mmStatusReport
	 * TransferCancellationStatusReportV06.mmStatusReport}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV04#mmStatusReport
	 * TransferCancellationStatusReportV04.mmStatusReport}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<TransferCancellationStatusReportV05, CancellationStatusAndReason3> mmStatusReport = new MMMessageBuildingBlock<TransferCancellationStatusReportV05, CancellationStatusAndReason3>() {
		{
			xmlTag = "StsRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReport";
			definition = "Status of the transfer cancellation instruction.";
			nextVersions_lazy = () -> Arrays.asList(TransferCancellationStatusReportV06.mmStatusReport);
			previousVersion_lazy = () -> TransferCancellationStatusReportV04.mmStatusReport;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CancellationStatusAndReason3.mmObject();
		}

		@Override
		public CancellationStatusAndReason3 getValue(TransferCancellationStatusReportV05 obj) {
			return obj.getStatusReport();
		}

		@Override
		public void setValue(TransferCancellationStatusReportV05 obj, CancellationStatusAndReason3 value) {
			obj.setStatusReport(value);
		}
	};
	@XmlElement(name = "MktPrctcVrsn")
	protected MarketPracticeVersion1 marketPracticeVersion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MarketPracticeVersion1
	 * MarketPracticeVersion1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktPrctcVrsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketPracticeVersion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the market practice to which the message conforms."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV06#mmMarketPracticeVersion
	 * TransferCancellationStatusReportV06.mmMarketPracticeVersion}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV04#mmMarketPracticeVersion
	 * TransferCancellationStatusReportV04.mmMarketPracticeVersion}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<TransferCancellationStatusReportV05, Optional<MarketPracticeVersion1>> mmMarketPracticeVersion = new MMMessageBuildingBlock<TransferCancellationStatusReportV05, Optional<MarketPracticeVersion1>>() {
		{
			xmlTag = "MktPrctcVrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketPracticeVersion";
			definition = "Identifies the market practice to which the message conforms.";
			nextVersions_lazy = () -> Arrays.asList(TransferCancellationStatusReportV06.mmMarketPracticeVersion);
			previousVersion_lazy = () -> TransferCancellationStatusReportV04.mmMarketPracticeVersion;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MarketPracticeVersion1.mmObject();
		}

		@Override
		public Optional<MarketPracticeVersion1> getValue(TransferCancellationStatusReportV05 obj) {
			return obj.getMarketPracticeVersion();
		}

		@Override
		public void setValue(TransferCancellationStatusReportV05 obj, Optional<MarketPracticeVersion1> value) {
			obj.setMarketPracticeVersion(value.orElse(null));
		}
	};
	@XmlElement(name = "Xtnsn")
	protected List<Extension1> extension;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Extension1
	 * Extension1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV06#mmExtension
	 * TransferCancellationStatusReportV06.mmExtension}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV04#mmExtension
	 * TransferCancellationStatusReportV04.mmExtension}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<TransferCancellationStatusReportV05, List<Extension1>> mmExtension = new MMMessageBuildingBlock<TransferCancellationStatusReportV05, List<Extension1>>() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(TransferCancellationStatusReportV06.mmExtension);
			previousVersion_lazy = () -> TransferCancellationStatusReportV04.mmExtension;
			minOccurs = 0;
			complexType_lazy = () -> Extension1.mmObject();
		}

		@Override
		public List<Extension1> getValue(TransferCancellationStatusReportV05 obj) {
			return obj.getExtension();
		}

		@Override
		public void setValue(TransferCancellationStatusReportV05 obj, List<Extension1> value) {
			obj.setExtension(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOtherReferenceRule.for_sese_TransferCancellationStatusReportV05,
						com.tools20022.repository.constraints.ConstraintRelatedReferenceRule.for_sese_TransferCancellationStatusReportV05);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransferCancellationStatusReportV05";
				definition = "Scope\r\nAn executing party, for example, a transfer agent, sends the TransferCancellationStatusReport message to the instructing party, for example, an investment manager or one of its authorised representatives to provide the status of a previously received transfer cancellation instruction.\r\nUsage\r\nThe TransferCancellationStatusReport message is used to report on the status of a transfer in or transfer out cancellation request.\r\nThe reference of the transfer instruction for which the cancellation status is reported is identified in TransferReference. The message identification of the transfer cancellation request message in which the transfer instruction was conveyed may also be quoted in RelatedReference.\r\nThe message identification of the transfer instruction request message in which the transfer instruction was conveyed may also be quoted in RelatedReference.\r\nOne of the following statuses can be reported:\r\n- the transfer cancellation is accepted, or,\r\n- the transfer cancellation has been sent to the next party, or,\r\n- the transfer cancellation is complete and the reason for the status,\r\n- the transfer cancellation pending and the reason for the status,\r\n- the transfer cancellation is rejected and the reason for the status.";
				nextVersions_lazy = () -> Arrays.asList(TransferCancellationStatusReportV06.mmObject());
				previousVersion_lazy = () -> TransferCancellationStatusReportV04.mmObject();
				messageSet_lazy = () -> Arrays.asList(InvestmentFundsISOPreviousversion.mmObject());
				rootElement = "Document";
				xmlTag = "TrfCxlStsRpt";
				businessArea_lazy = () -> SecuritiesSettlementPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.TransferCancellationStatusReportV05.mmMessageIdentification,
						com.tools20022.repository.area.sese.TransferCancellationStatusReportV05.mmCounterpartyReference, com.tools20022.repository.area.sese.TransferCancellationStatusReportV05.mmReference,
						com.tools20022.repository.area.sese.TransferCancellationStatusReportV05.mmStatusReport, com.tools20022.repository.area.sese.TransferCancellationStatusReportV05.mmMarketPracticeVersion,
						com.tools20022.repository.area.sese.TransferCancellationStatusReportV05.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "010";
						version = "05";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return TransferCancellationStatusReportV05.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public TransferCancellationStatusReportV05 setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public Optional<AdditionalReference7> getCounterpartyReference() {
		return counterpartyReference == null ? Optional.empty() : Optional.of(counterpartyReference);
	}

	public TransferCancellationStatusReportV05 setCounterpartyReference(AdditionalReference7 counterpartyReference) {
		this.counterpartyReference = counterpartyReference;
		return this;
	}

	public Optional<References49Choice> getReference() {
		return reference == null ? Optional.empty() : Optional.of(reference);
	}

	public TransferCancellationStatusReportV05 setReference(References49Choice reference) {
		this.reference = reference;
		return this;
	}

	public CancellationStatusAndReason3 getStatusReport() {
		return statusReport;
	}

	public TransferCancellationStatusReportV05 setStatusReport(CancellationStatusAndReason3 statusReport) {
		this.statusReport = Objects.requireNonNull(statusReport);
		return this;
	}

	public Optional<MarketPracticeVersion1> getMarketPracticeVersion() {
		return marketPracticeVersion == null ? Optional.empty() : Optional.of(marketPracticeVersion);
	}

	public TransferCancellationStatusReportV05 setMarketPracticeVersion(MarketPracticeVersion1 marketPracticeVersion) {
		this.marketPracticeVersion = marketPracticeVersion;
		return this;
	}

	public List<Extension1> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public TransferCancellationStatusReportV05 setExtension(List<Extension1> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.010.001.05")
	static public class Document {
		@XmlElement(name = "TrfCxlStsRpt", required = true)
		public TransferCancellationStatusReportV05 messageBody;
	}
}