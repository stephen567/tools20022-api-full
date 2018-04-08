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

import com.tools20022.metamodel.*;
import com.tools20022.repository.area.SecuritiesSettlementArchive;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An executing party, for example, a transfer agent, sends the
 * ReversalOfTransferOutConfirmation message to the instructing party, for
 * example, an investment manager or its authorised representative, to cancel a
 * previously sent TransferOutConfirmation message.<br>
 * <b>Usage</b><br>
 * The ReversalOfTransferOutConfirmation message is used to reverse a previously
 * sent TransferOutConfirmation.<br>
 * There are two ways to specify the reversal of the transfer out confirmation.
 * Either:<br>
 * - the business references, for example, TransferReference,
 * TransferConfirmationIdentification, of the transfer confirmation are quoted,
 * or,<br>
 * - all the details of the transfer confirmation (this includes
 * TransferReference and TransferConfirmationIdentification) are quoted but this
 * is not recommended.<br>
 * The message identification of the TransferOutConfirmation message in which
 * the transfer out confirmation was conveyed may also be quoted in
 * PreviousReference. The message identification of the TransferOutInstruction
 * message in which the transfer out instruction was conveyed may also be quoted
 * in RelatedReference.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV03#Operation1
 * ReversalOfTransferOutConfirmationV03.Operation1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV03#mmMessageIdentification
 * ReversalOfTransferOutConfirmationV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV03#mmReferences
 * ReversalOfTransferOutConfirmationV03.mmReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV03#mmReversalByReference
 * ReversalOfTransferOutConfirmationV03.mmReversalByReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV03#mmReversalByTransferOutConfirmationDetails
 * ReversalOfTransferOutConfirmationV03.
 * mmReversalByTransferOutConfirmationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV03#mmCopyDetails
 * ReversalOfTransferOutConfirmationV03.mmCopyDetails}</li>
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
 * xmlTag} = "RvslOfTrfOutConf"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementArchive
 * SecuritiesSettlementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.004.001.03}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReversalOfTransferOutConfirmationV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn executing party, for example, a transfer agent, sends the ReversalOfTransferOutConfirmation message to the instructing party, for example, an investment manager or its authorised representative, to cancel a previously sent TransferOutConfirmation message.\r\nUsage\r\nThe ReversalOfTransferOutConfirmation message is used to reverse a previously sent TransferOutConfirmation.\r\nThere are two ways to specify the reversal of the transfer out confirmation. Either:\r\n- the business references, for example, TransferReference, TransferConfirmationIdentification, of the transfer confirmation are quoted, or,\r\n- all the details of the transfer confirmation (this includes TransferReference and TransferConfirmationIdentification) are quoted but this is not recommended.\r\nThe message identification of the TransferOutConfirmation message in which the transfer out confirmation was conveyed may also be quoted in PreviousReference. The message identification of the TransferOutInstruction message in which the transfer out instruction was conveyed may also be quoted in RelatedReference."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV04
 * ReversalOfTransferOutConfirmationV04}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV02
 * ReversalOfTransferOutConfirmationV02}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ReversalOfTransferOutConfirmationV03", propOrder = {"messageIdentification", "references", "reversalByReference", "reversalByTransferOutConfirmationDetails", "copyDetails"})
public class ReversalOfTransferOutConfirmationV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageDefinition
	 * messageDefinition} =
	 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV03
	 * ReversalOfTransferOutConfirmationV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMXor#getImpactedMessageBuildingBlocks
	 * impactedMessageBuildingBlocks} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV03#mmReversalByReference
	 * ReversalOfTransferOutConfirmationV03.mmReversalByReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV03#mmReversalByTransferOutConfirmationDetails
	 * ReversalOfTransferOutConfirmationV03.
	 * mmReversalByTransferOutConfirmationDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Operation1"</li>
	 * </ul>
	 */
	public static final MMXor Operation1 = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Operation1";
			impactedMessageBuildingBlocks_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV03.mmReversalByReference,
					com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV03.mmReversalByTransferOutConfirmationDetails);
			messageDefinition_lazy = () -> com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV03.mmObject();
		}
	};
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ReversalOfTransferOutConfirmationV03, MessageIdentification1> mmMessageIdentification = new MMMessageBuildingBlock<ReversalOfTransferOutConfirmationV03, MessageIdentification1>() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Reference that uniquely identifies a message from a business application standpoint.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(ReversalOfTransferOutConfirmationV03 obj) {
			return obj.getMessageIdentification();
		}

		@Override
		public void setValue(ReversalOfTransferOutConfirmationV03 obj, MessageIdentification1 value) {
			obj.setMessageIdentification(value);
		}
	};
	@XmlElement(name = "Refs", required = true)
	protected List<References11> references;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.References11
	 * References11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Refs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "References"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the transaction identifier issued by the counterparty. Building block may also be used to reference a previous transaction, or tie a set of messages together."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ReversalOfTransferOutConfirmationV03, List<References11>> mmReferences = new MMMessageBuildingBlock<ReversalOfTransferOutConfirmationV03, List<References11>>() {
		{
			xmlTag = "Refs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "References";
			definition = "Reference to the transaction identifier issued by the counterparty. Building block may also be used to reference a previous transaction, or tie a set of messages together.";
			minOccurs = 1;
			complexType_lazy = () -> References11.mmObject();
		}

		@Override
		public List<References11> getValue(ReversalOfTransferOutConfirmationV03 obj) {
			return obj.getReferences();
		}

		@Override
		public void setValue(ReversalOfTransferOutConfirmationV03 obj, List<References11> value) {
			obj.setReferences(value);
		}
	};
	@XmlElement(name = "RvslByRef")
	protected TransferReference2 reversalByReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransferReference2
	 * TransferReference2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RvslByRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalByReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference of the transfer out confirmation to be reversed."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ReversalOfTransferOutConfirmationV03, Optional<TransferReference2>> mmReversalByReference = new MMMessageBuildingBlock<ReversalOfTransferOutConfirmationV03, Optional<TransferReference2>>() {
		{
			xmlTag = "RvslByRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalByReference";
			definition = "Reference of the transfer out confirmation to be reversed.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TransferReference2.mmObject();
		}

		@Override
		public Optional<TransferReference2> getValue(ReversalOfTransferOutConfirmationV03 obj) {
			return obj.getReversalByReference();
		}

		@Override
		public void setValue(ReversalOfTransferOutConfirmationV03 obj, Optional<TransferReference2> value) {
			obj.setReversalByReference(value.orElse(null));
		}
	};
	@XmlElement(name = "RvslByTrfOutConfDtls")
	protected TransferOut8 reversalByTransferOutConfirmationDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.TransferOut8
	 * TransferOut8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RvslByTrfOutConfDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalByTransferOutConfirmationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Copy of the transfer out confirmation to reverse."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ReversalOfTransferOutConfirmationV03, Optional<TransferOut8>> mmReversalByTransferOutConfirmationDetails = new MMMessageBuildingBlock<ReversalOfTransferOutConfirmationV03, Optional<TransferOut8>>() {
		{
			xmlTag = "RvslByTrfOutConfDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalByTransferOutConfirmationDetails";
			definition = "Copy of the transfer out confirmation to reverse.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TransferOut8.mmObject();
		}

		@Override
		public Optional<TransferOut8> getValue(ReversalOfTransferOutConfirmationV03 obj) {
			return obj.getReversalByTransferOutConfirmationDetails();
		}

		@Override
		public void setValue(ReversalOfTransferOutConfirmationV03 obj, Optional<TransferOut8> value) {
			obj.setReversalByTransferOutConfirmationDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "CpyDtls")
	protected CopyInformation2 copyDetails;
	/**
	 * 
	 <p>
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
	 * definition} =
	 * "Information provided when the message is a copy of a previous message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ReversalOfTransferOutConfirmationV03, Optional<CopyInformation2>> mmCopyDetails = new MMMessageBuildingBlock<ReversalOfTransferOutConfirmationV03, Optional<CopyInformation2>>() {
		{
			xmlTag = "CpyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CopyDetails";
			definition = "Information provided when the message is a copy of a previous message.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CopyInformation2.mmObject();
		}

		@Override
		public Optional<CopyInformation2> getValue(ReversalOfTransferOutConfirmationV03 obj) {
			return obj.getCopyDetails();
		}

		@Override
		public void setValue(ReversalOfTransferOutConfirmationV03 obj, Optional<CopyInformation2> value) {
			obj.setCopyDetails(value.orElse(null));
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReversalOfTransferOutConfirmationV03";
				definition = "Scope\r\nAn executing party, for example, a transfer agent, sends the ReversalOfTransferOutConfirmation message to the instructing party, for example, an investment manager or its authorised representative, to cancel a previously sent TransferOutConfirmation message.\r\nUsage\r\nThe ReversalOfTransferOutConfirmation message is used to reverse a previously sent TransferOutConfirmation.\r\nThere are two ways to specify the reversal of the transfer out confirmation. Either:\r\n- the business references, for example, TransferReference, TransferConfirmationIdentification, of the transfer confirmation are quoted, or,\r\n- all the details of the transfer confirmation (this includes TransferReference and TransferConfirmationIdentification) are quoted but this is not recommended.\r\nThe message identification of the TransferOutConfirmation message in which the transfer out confirmation was conveyed may also be quoted in PreviousReference. The message identification of the TransferOutInstruction message in which the transfer out instruction was conveyed may also be quoted in RelatedReference.";
				nextVersions_lazy = () -> Arrays.asList(ReversalOfTransferOutConfirmationV04.mmObject());
				previousVersion_lazy = () -> ReversalOfTransferOutConfirmationV02.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV03.Operation1);
				rootElement = "Document";
				xmlTag = "RvslOfTrfOutConf";
				businessArea_lazy = () -> SecuritiesSettlementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV03.mmMessageIdentification,
						com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV03.mmReferences, com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV03.mmReversalByReference,
						com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV03.mmReversalByTransferOutConfirmationDetails, com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV03.mmCopyDetails);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "004";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ReversalOfTransferOutConfirmationV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public ReversalOfTransferOutConfirmationV03 setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public List<References11> getReferences() {
		return references == null ? references = new ArrayList<>() : references;
	}

	public ReversalOfTransferOutConfirmationV03 setReferences(List<References11> references) {
		this.references = Objects.requireNonNull(references);
		return this;
	}

	public Optional<TransferReference2> getReversalByReference() {
		return reversalByReference == null ? Optional.empty() : Optional.of(reversalByReference);
	}

	public ReversalOfTransferOutConfirmationV03 setReversalByReference(TransferReference2 reversalByReference) {
		this.reversalByReference = reversalByReference;
		return this;
	}

	public Optional<TransferOut8> getReversalByTransferOutConfirmationDetails() {
		return reversalByTransferOutConfirmationDetails == null ? Optional.empty() : Optional.of(reversalByTransferOutConfirmationDetails);
	}

	public ReversalOfTransferOutConfirmationV03 setReversalByTransferOutConfirmationDetails(TransferOut8 reversalByTransferOutConfirmationDetails) {
		this.reversalByTransferOutConfirmationDetails = reversalByTransferOutConfirmationDetails;
		return this;
	}

	public Optional<CopyInformation2> getCopyDetails() {
		return copyDetails == null ? Optional.empty() : Optional.of(copyDetails);
	}

	public ReversalOfTransferOutConfirmationV03 setCopyDetails(CopyInformation2 copyDetails) {
		this.copyDetails = copyDetails;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.004.001.03")
	static public class Document {
		@XmlElement(name = "RvslOfTrfOutConf", required = true)
		public ReversalOfTransferOutConfirmationV03 messageBody;
	}
}