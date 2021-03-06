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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV06;
import com.tools20022.repository.choice.AcceptedStatus3Choice;
import com.tools20022.repository.choice.CancelledStatus1Choice;
import com.tools20022.repository.choice.PendingStatus34Choice;
import com.tools20022.repository.choice.RejectedStatus13Choice;
import com.tools20022.repository.entity.CorporateActionStatus;
import com.tools20022.repository.entity.CorporateActionStatusReason;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.NoSpecifiedReason1;
import com.tools20022.repository.msg.ProprietaryStatusAndReason1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between different instruction processing statuses.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus20Choice#mmCancelled
 * InstructionProcessingStatus20Choice.mmCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus20Choice#mmAcceptedForFurtherProcessing
 * InstructionProcessingStatus20Choice.mmAcceptedForFurtherProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus20Choice#mmRejected
 * InstructionProcessingStatus20Choice.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus20Choice#mmPending
 * InstructionProcessingStatus20Choice.mmPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus20Choice#mmDefaultAction
 * InstructionProcessingStatus20Choice.mmDefaultAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus20Choice#mmStandingInstruction
 * InstructionProcessingStatus20Choice.mmStandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus20Choice#mmProprietaryStatus
 * InstructionProcessingStatus20Choice.mmProprietaryStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason
 * CorporateActionStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV06#mmInstructionProcessingStatus
 * CorporateActionInstructionStatusAdviceV06.mmInstructionProcessingStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InstructionProcessingStatus20Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between different instruction processing statuses."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus24Choice
 * InstructionProcessingStatus24Choice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus15Choice
 * InstructionProcessingStatus15Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InstructionProcessingStatus20Choice", propOrder = {"cancelled", "acceptedForFurtherProcessing", "rejected", "pending", "defaultAction", "standingInstruction", "proprietaryStatus"})
public class InstructionProcessingStatus20Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Canc", required = true)
	protected CancelledStatus1Choice cancelled;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus1Choice
	 * CancelledStatus1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmCancellationReason
	 * StatusReason.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus20Choice
	 * InstructionProcessingStatus20Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Canc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides status information related to an instruction request cancelled."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::IPRC//CAND</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus24Choice#mmCancelled
	 * InstructionProcessingStatus24Choice.mmCancelled}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus15Choice#mmCancelled
	 * InstructionProcessingStatus15Choice.mmCancelled}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructionProcessingStatus20Choice, CancelledStatus1Choice> mmCancelled = new MMMessageAssociationEnd<InstructionProcessingStatus20Choice, CancelledStatus1Choice>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmCancellationReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionProcessingStatus20Choice.mmObject();
			isDerived = false;
			xmlTag = "Canc";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::IPRC//CAND"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancelled";
			definition = "Provides status information related to an instruction request cancelled.";
			nextVersions_lazy = () -> Arrays.asList(InstructionProcessingStatus24Choice.mmCancelled);
			previousVersion_lazy = () -> InstructionProcessingStatus15Choice.mmCancelled;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CancelledStatus1Choice.mmObject();
		}

		@Override
		public CancelledStatus1Choice getValue(InstructionProcessingStatus20Choice obj) {
			return obj.getCancelled();
		}

		@Override
		public void setValue(InstructionProcessingStatus20Choice obj, CancelledStatus1Choice value) {
			obj.setCancelled(value);
		}
	};
	@XmlElement(name = "AccptdForFrthrPrcg", required = true)
	protected AcceptedStatus3Choice acceptedForFurtherProcessing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AcceptedStatus3Choice
	 * AcceptedStatus3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#mmAcceptedReason
	 * CorporateActionStatusReason.mmAcceptedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus20Choice
	 * InstructionProcessingStatus20Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AccptdForFrthrPrcg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedForFurtherProcessing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides status information related to an instruction request that is accepted. This means that the instruction has been received, is processable and has been validated for further processing."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::IPRC//PACK</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus24Choice#mmAcceptedForFurtherProcessing
	 * InstructionProcessingStatus24Choice.mmAcceptedForFurtherProcessing}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus15Choice#mmAcceptedForFurtherProcessing
	 * InstructionProcessingStatus15Choice.mmAcceptedForFurtherProcessing}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructionProcessingStatus20Choice, AcceptedStatus3Choice> mmAcceptedForFurtherProcessing = new MMMessageAssociationEnd<InstructionProcessingStatus20Choice, AcceptedStatus3Choice>() {
		{
			businessElementTrace_lazy = () -> CorporateActionStatusReason.mmAcceptedReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionProcessingStatus20Choice.mmObject();
			isDerived = false;
			xmlTag = "AccptdForFrthrPrcg";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::IPRC//PACK"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedForFurtherProcessing";
			definition = "Provides status information related to an instruction request that is accepted. This means that the instruction has been received, is processable and has been validated for further processing.";
			nextVersions_lazy = () -> Arrays.asList(InstructionProcessingStatus24Choice.mmAcceptedForFurtherProcessing);
			previousVersion_lazy = () -> InstructionProcessingStatus15Choice.mmAcceptedForFurtherProcessing;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AcceptedStatus3Choice.mmObject();
		}

		@Override
		public AcceptedStatus3Choice getValue(InstructionProcessingStatus20Choice obj) {
			return obj.getAcceptedForFurtherProcessing();
		}

		@Override
		public void setValue(InstructionProcessingStatus20Choice obj, AcceptedStatus3Choice value) {
			obj.setAcceptedForFurtherProcessing(value);
		}
	};
	@XmlElement(name = "Rjctd", required = true)
	protected RejectedStatus13Choice rejected;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus13Choice
	 * RejectedStatus13Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmRejectionReason
	 * StatusReason.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus20Choice
	 * InstructionProcessingStatus20Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rjctd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides status information related to an instruction request rejected for further processing due to system reasons."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::IPRC//REJT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus24Choice#mmRejected
	 * InstructionProcessingStatus24Choice.mmRejected}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus15Choice#mmRejected
	 * InstructionProcessingStatus15Choice.mmRejected}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructionProcessingStatus20Choice, RejectedStatus13Choice> mmRejected = new MMMessageAssociationEnd<InstructionProcessingStatus20Choice, RejectedStatus13Choice>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmRejectionReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionProcessingStatus20Choice.mmObject();
			isDerived = false;
			xmlTag = "Rjctd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::IPRC//REJT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Provides status information related to an instruction request rejected for further processing due to system reasons.";
			nextVersions_lazy = () -> Arrays.asList(InstructionProcessingStatus24Choice.mmRejected);
			previousVersion_lazy = () -> InstructionProcessingStatus15Choice.mmRejected;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RejectedStatus13Choice.mmObject();
		}

		@Override
		public RejectedStatus13Choice getValue(InstructionProcessingStatus20Choice obj) {
			return obj.getRejected();
		}

		@Override
		public void setValue(InstructionProcessingStatus20Choice obj, RejectedStatus13Choice value) {
			obj.setRejected(value);
		}
	};
	@XmlElement(name = "Pdg", required = true)
	protected PendingStatus34Choice pending;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PendingStatus34Choice
	 * PendingStatus34Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmPendingReason
	 * StatusReason.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus20Choice
	 * InstructionProcessingStatus20Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pdg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides status information related to a pending instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::IPRC//PEND</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus24Choice#mmPending
	 * InstructionProcessingStatus24Choice.mmPending}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus15Choice#mmPending
	 * InstructionProcessingStatus15Choice.mmPending}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructionProcessingStatus20Choice, PendingStatus34Choice> mmPending = new MMMessageAssociationEnd<InstructionProcessingStatus20Choice, PendingStatus34Choice>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmPendingReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionProcessingStatus20Choice.mmObject();
			isDerived = false;
			xmlTag = "Pdg";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::IPRC//PEND"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			definition = "Provides status information related to a pending instruction.";
			nextVersions_lazy = () -> Arrays.asList(InstructionProcessingStatus24Choice.mmPending);
			previousVersion_lazy = () -> InstructionProcessingStatus15Choice.mmPending;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PendingStatus34Choice.mmObject();
		}

		@Override
		public PendingStatus34Choice getValue(InstructionProcessingStatus20Choice obj) {
			return obj.getPending();
		}

		@Override
		public void setValue(InstructionProcessingStatus20Choice obj, PendingStatus34Choice value) {
			obj.setPending(value);
		}
	};
	@XmlElement(name = "DfltActn", required = true)
	protected NoSpecifiedReason1 defaultAction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NoSpecifiedReason1
	 * NoSpecifiedReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason
	 * CorporateActionStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus20Choice
	 * InstructionProcessingStatus20Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DfltActn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Default action is taken."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::IPRC//DFLA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus24Choice#mmDefaultAction
	 * InstructionProcessingStatus24Choice.mmDefaultAction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus15Choice#mmDefaultAction
	 * InstructionProcessingStatus15Choice.mmDefaultAction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructionProcessingStatus20Choice, NoSpecifiedReason1> mmDefaultAction = new MMMessageAssociationEnd<InstructionProcessingStatus20Choice, NoSpecifiedReason1>() {
		{
			businessComponentTrace_lazy = () -> CorporateActionStatusReason.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionProcessingStatus20Choice.mmObject();
			isDerived = false;
			xmlTag = "DfltActn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::IPRC//DFLA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultAction";
			definition = "Default action is taken.";
			nextVersions_lazy = () -> Arrays.asList(InstructionProcessingStatus24Choice.mmDefaultAction);
			previousVersion_lazy = () -> InstructionProcessingStatus15Choice.mmDefaultAction;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> NoSpecifiedReason1.mmObject();
		}

		@Override
		public NoSpecifiedReason1 getValue(InstructionProcessingStatus20Choice obj) {
			return obj.getDefaultAction();
		}

		@Override
		public void setValue(InstructionProcessingStatus20Choice obj, NoSpecifiedReason1 value) {
			obj.setDefaultAction(value);
		}
	};
	@XmlElement(name = "StgInstr", required = true)
	protected NoSpecifiedReason1 standingInstruction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NoSpecifiedReason1
	 * NoSpecifiedReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason
	 * CorporateActionStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus20Choice
	 * InstructionProcessingStatus20Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StgInstr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Standing instruction has been applied."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::IPRC//STIN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus24Choice#mmStandingInstruction
	 * InstructionProcessingStatus24Choice.mmStandingInstruction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus15Choice#mmStandingInstruction
	 * InstructionProcessingStatus15Choice.mmStandingInstruction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructionProcessingStatus20Choice, NoSpecifiedReason1> mmStandingInstruction = new MMMessageAssociationEnd<InstructionProcessingStatus20Choice, NoSpecifiedReason1>() {
		{
			businessComponentTrace_lazy = () -> CorporateActionStatusReason.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionProcessingStatus20Choice.mmObject();
			isDerived = false;
			xmlTag = "StgInstr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::IPRC//STIN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingInstruction";
			definition = "Standing instruction has been applied.";
			nextVersions_lazy = () -> Arrays.asList(InstructionProcessingStatus24Choice.mmStandingInstruction);
			previousVersion_lazy = () -> InstructionProcessingStatus15Choice.mmStandingInstruction;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> NoSpecifiedReason1.mmObject();
		}

		@Override
		public NoSpecifiedReason1 getValue(InstructionProcessingStatus20Choice obj) {
			return obj.getStandingInstruction();
		}

		@Override
		public void setValue(InstructionProcessingStatus20Choice obj, NoSpecifiedReason1 value) {
			obj.setStandingInstruction(value);
		}
	};
	@XmlElement(name = "PrtrySts", required = true)
	protected ProprietaryStatusAndReason1 proprietaryStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason1
	 * ProprietaryStatusAndReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus20Choice
	 * InstructionProcessingStatus20Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtrySts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProprietaryStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Proprietary status related to an instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::IPRC//[8c]/4!c</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus24Choice#mmProprietaryStatus
	 * InstructionProcessingStatus24Choice.mmProprietaryStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus15Choice#mmProprietaryStatus
	 * InstructionProcessingStatus15Choice.mmProprietaryStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructionProcessingStatus20Choice, ProprietaryStatusAndReason1> mmProprietaryStatus = new MMMessageAssociationEnd<InstructionProcessingStatus20Choice, ProprietaryStatusAndReason1>() {
		{
			businessComponentTrace_lazy = () -> CorporateActionStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionProcessingStatus20Choice.mmObject();
			isDerived = false;
			xmlTag = "PrtrySts";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::IPRC//[8c]/4!c"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryStatus";
			definition = "Proprietary status related to an instruction.";
			nextVersions_lazy = () -> Arrays.asList(InstructionProcessingStatus24Choice.mmProprietaryStatus);
			previousVersion_lazy = () -> InstructionProcessingStatus15Choice.mmProprietaryStatus;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProprietaryStatusAndReason1.mmObject();
		}

		@Override
		public ProprietaryStatusAndReason1 getValue(InstructionProcessingStatus20Choice obj) {
			return obj.getProprietaryStatus();
		}

		@Override
		public void setValue(InstructionProcessingStatus20Choice obj, ProprietaryStatusAndReason1 value) {
			obj.setProprietaryStatus(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.InstructionProcessingStatus20Choice.mmCancelled,
						com.tools20022.repository.choice.InstructionProcessingStatus20Choice.mmAcceptedForFurtherProcessing, com.tools20022.repository.choice.InstructionProcessingStatus20Choice.mmRejected,
						com.tools20022.repository.choice.InstructionProcessingStatus20Choice.mmPending, com.tools20022.repository.choice.InstructionProcessingStatus20Choice.mmDefaultAction,
						com.tools20022.repository.choice.InstructionProcessingStatus20Choice.mmStandingInstruction, com.tools20022.repository.choice.InstructionProcessingStatus20Choice.mmProprietaryStatus);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionInstructionStatusAdviceV06.mmInstructionProcessingStatus);
				trace_lazy = () -> CorporateActionStatusReason.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InstructionProcessingStatus20Choice";
				definition = "Choice between different instruction processing statuses.";
				nextVersions_lazy = () -> Arrays.asList(InstructionProcessingStatus24Choice.mmObject());
				previousVersion_lazy = () -> InstructionProcessingStatus15Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public CancelledStatus1Choice getCancelled() {
		return cancelled;
	}

	public InstructionProcessingStatus20Choice setCancelled(CancelledStatus1Choice cancelled) {
		this.cancelled = Objects.requireNonNull(cancelled);
		return this;
	}

	public AcceptedStatus3Choice getAcceptedForFurtherProcessing() {
		return acceptedForFurtherProcessing;
	}

	public InstructionProcessingStatus20Choice setAcceptedForFurtherProcessing(AcceptedStatus3Choice acceptedForFurtherProcessing) {
		this.acceptedForFurtherProcessing = Objects.requireNonNull(acceptedForFurtherProcessing);
		return this;
	}

	public RejectedStatus13Choice getRejected() {
		return rejected;
	}

	public InstructionProcessingStatus20Choice setRejected(RejectedStatus13Choice rejected) {
		this.rejected = Objects.requireNonNull(rejected);
		return this;
	}

	public PendingStatus34Choice getPending() {
		return pending;
	}

	public InstructionProcessingStatus20Choice setPending(PendingStatus34Choice pending) {
		this.pending = Objects.requireNonNull(pending);
		return this;
	}

	public NoSpecifiedReason1 getDefaultAction() {
		return defaultAction;
	}

	public InstructionProcessingStatus20Choice setDefaultAction(NoSpecifiedReason1 defaultAction) {
		this.defaultAction = Objects.requireNonNull(defaultAction);
		return this;
	}

	public NoSpecifiedReason1 getStandingInstruction() {
		return standingInstruction;
	}

	public InstructionProcessingStatus20Choice setStandingInstruction(NoSpecifiedReason1 standingInstruction) {
		this.standingInstruction = Objects.requireNonNull(standingInstruction);
		return this;
	}

	public ProprietaryStatusAndReason1 getProprietaryStatus() {
		return proprietaryStatus;
	}

	public InstructionProcessingStatus20Choice setProprietaryStatus(ProprietaryStatusAndReason1 proprietaryStatus) {
		this.proprietaryStatus = Objects.requireNonNull(proprietaryStatus);
		return this;
	}
}