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
import com.tools20022.repository.choice.AcceptedStatus5Choice;
import com.tools20022.repository.choice.CancelledStatus4Choice;
import com.tools20022.repository.choice.PendingStatus33Choice;
import com.tools20022.repository.choice.RejectedStatus11Choice;
import com.tools20022.repository.entity.CorporateActionStatus;
import com.tools20022.repository.entity.CorporateActionStatusReason;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.NoSpecifiedReason1;
import com.tools20022.repository.msg.ProprietaryStatusAndReason2;
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
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus16Choice#mmCancelled
 * InstructionProcessingStatus16Choice.mmCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus16Choice#mmAcceptedForFurtherProcessing
 * InstructionProcessingStatus16Choice.mmAcceptedForFurtherProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus16Choice#mmRejected
 * InstructionProcessingStatus16Choice.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus16Choice#mmPending
 * InstructionProcessingStatus16Choice.mmPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus16Choice#mmDefaultAction
 * InstructionProcessingStatus16Choice.mmDefaultAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus16Choice#mmStandingInstruction
 * InstructionProcessingStatus16Choice.mmStandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus16Choice#mmProprietaryStatus
 * InstructionProcessingStatus16Choice.mmProprietaryStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason
 * CorporateActionStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InstructionProcessingStatus16Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between different instruction processing statuses."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InstructionProcessingStatus16Choice", propOrder = {"cancelled", "acceptedForFurtherProcessing", "rejected", "pending", "defaultAction", "standingInstruction", "proprietaryStatus"})
public class InstructionProcessingStatus16Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Canc", required = true)
	protected CancelledStatus4Choice cancelled;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus4Choice
	 * CancelledStatus4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmCancellationReason
	 * StatusReason.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus16Choice
	 * InstructionProcessingStatus16Choice}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructionProcessingStatus16Choice, CancelledStatus4Choice> mmCancelled = new MMMessageAssociationEnd<InstructionProcessingStatus16Choice, CancelledStatus4Choice>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmCancellationReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionProcessingStatus16Choice.mmObject();
			isDerived = false;
			xmlTag = "Canc";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::IPRC//CAND"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancelled";
			definition = "Provides status information related to an instruction request cancelled.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CancelledStatus4Choice.mmObject();
		}

		@Override
		public CancelledStatus4Choice getValue(InstructionProcessingStatus16Choice obj) {
			return obj.getCancelled();
		}

		@Override
		public void setValue(InstructionProcessingStatus16Choice obj, CancelledStatus4Choice value) {
			obj.setCancelled(value);
		}
	};
	@XmlElement(name = "AccptdForFrthrPrcg", required = true)
	protected AcceptedStatus5Choice acceptedForFurtherProcessing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AcceptedStatus5Choice
	 * AcceptedStatus5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#mmAcceptedReason
	 * CorporateActionStatusReason.mmAcceptedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus16Choice
	 * InstructionProcessingStatus16Choice}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructionProcessingStatus16Choice, AcceptedStatus5Choice> mmAcceptedForFurtherProcessing = new MMMessageAssociationEnd<InstructionProcessingStatus16Choice, AcceptedStatus5Choice>() {
		{
			businessElementTrace_lazy = () -> CorporateActionStatusReason.mmAcceptedReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionProcessingStatus16Choice.mmObject();
			isDerived = false;
			xmlTag = "AccptdForFrthrPrcg";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::IPRC//PACK"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedForFurtherProcessing";
			definition = "Provides status information related to an instruction request that is accepted. This means that the instruction has been received, is processable and has been validated for further processing.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AcceptedStatus5Choice.mmObject();
		}

		@Override
		public AcceptedStatus5Choice getValue(InstructionProcessingStatus16Choice obj) {
			return obj.getAcceptedForFurtherProcessing();
		}

		@Override
		public void setValue(InstructionProcessingStatus16Choice obj, AcceptedStatus5Choice value) {
			obj.setAcceptedForFurtherProcessing(value);
		}
	};
	@XmlElement(name = "Rjctd", required = true)
	protected RejectedStatus11Choice rejected;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus11Choice
	 * RejectedStatus11Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmRejectionReason
	 * StatusReason.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus16Choice
	 * InstructionProcessingStatus16Choice}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructionProcessingStatus16Choice, RejectedStatus11Choice> mmRejected = new MMMessageAssociationEnd<InstructionProcessingStatus16Choice, RejectedStatus11Choice>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmRejectionReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionProcessingStatus16Choice.mmObject();
			isDerived = false;
			xmlTag = "Rjctd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::IPRC//REJT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Provides status information related to an instruction request rejected for further processing due to system reasons.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RejectedStatus11Choice.mmObject();
		}

		@Override
		public RejectedStatus11Choice getValue(InstructionProcessingStatus16Choice obj) {
			return obj.getRejected();
		}

		@Override
		public void setValue(InstructionProcessingStatus16Choice obj, RejectedStatus11Choice value) {
			obj.setRejected(value);
		}
	};
	@XmlElement(name = "Pdg", required = true)
	protected PendingStatus33Choice pending;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PendingStatus33Choice
	 * PendingStatus33Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmPendingReason
	 * StatusReason.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus16Choice
	 * InstructionProcessingStatus16Choice}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructionProcessingStatus16Choice, PendingStatus33Choice> mmPending = new MMMessageAssociationEnd<InstructionProcessingStatus16Choice, PendingStatus33Choice>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmPendingReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionProcessingStatus16Choice.mmObject();
			isDerived = false;
			xmlTag = "Pdg";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::IPRC//PEND"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			definition = "Provides status information related to a pending instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PendingStatus33Choice.mmObject();
		}

		@Override
		public PendingStatus33Choice getValue(InstructionProcessingStatus16Choice obj) {
			return obj.getPending();
		}

		@Override
		public void setValue(InstructionProcessingStatus16Choice obj, PendingStatus33Choice value) {
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
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus16Choice
	 * InstructionProcessingStatus16Choice}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructionProcessingStatus16Choice, NoSpecifiedReason1> mmDefaultAction = new MMMessageAssociationEnd<InstructionProcessingStatus16Choice, NoSpecifiedReason1>() {
		{
			businessComponentTrace_lazy = () -> CorporateActionStatusReason.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionProcessingStatus16Choice.mmObject();
			isDerived = false;
			xmlTag = "DfltActn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::IPRC//DFLA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultAction";
			definition = "Default action is taken.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> NoSpecifiedReason1.mmObject();
		}

		@Override
		public NoSpecifiedReason1 getValue(InstructionProcessingStatus16Choice obj) {
			return obj.getDefaultAction();
		}

		@Override
		public void setValue(InstructionProcessingStatus16Choice obj, NoSpecifiedReason1 value) {
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
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus16Choice
	 * InstructionProcessingStatus16Choice}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructionProcessingStatus16Choice, NoSpecifiedReason1> mmStandingInstruction = new MMMessageAssociationEnd<InstructionProcessingStatus16Choice, NoSpecifiedReason1>() {
		{
			businessComponentTrace_lazy = () -> CorporateActionStatusReason.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionProcessingStatus16Choice.mmObject();
			isDerived = false;
			xmlTag = "StgInstr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::IPRC//STIN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingInstruction";
			definition = "Standing instruction has been applied.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> NoSpecifiedReason1.mmObject();
		}

		@Override
		public NoSpecifiedReason1 getValue(InstructionProcessingStatus16Choice obj) {
			return obj.getStandingInstruction();
		}

		@Override
		public void setValue(InstructionProcessingStatus16Choice obj, NoSpecifiedReason1 value) {
			obj.setStandingInstruction(value);
		}
	};
	@XmlElement(name = "PrtrySts", required = true)
	protected ProprietaryStatusAndReason2 proprietaryStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason2
	 * ProprietaryStatusAndReason2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus16Choice
	 * InstructionProcessingStatus16Choice}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructionProcessingStatus16Choice, ProprietaryStatusAndReason2> mmProprietaryStatus = new MMMessageAssociationEnd<InstructionProcessingStatus16Choice, ProprietaryStatusAndReason2>() {
		{
			businessComponentTrace_lazy = () -> CorporateActionStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionProcessingStatus16Choice.mmObject();
			isDerived = false;
			xmlTag = "PrtrySts";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::IPRC//[8c]/4!c"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryStatus";
			definition = "Proprietary status related to an instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProprietaryStatusAndReason2.mmObject();
		}

		@Override
		public ProprietaryStatusAndReason2 getValue(InstructionProcessingStatus16Choice obj) {
			return obj.getProprietaryStatus();
		}

		@Override
		public void setValue(InstructionProcessingStatus16Choice obj, ProprietaryStatusAndReason2 value) {
			obj.setProprietaryStatus(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.InstructionProcessingStatus16Choice.mmCancelled,
						com.tools20022.repository.choice.InstructionProcessingStatus16Choice.mmAcceptedForFurtherProcessing, com.tools20022.repository.choice.InstructionProcessingStatus16Choice.mmRejected,
						com.tools20022.repository.choice.InstructionProcessingStatus16Choice.mmPending, com.tools20022.repository.choice.InstructionProcessingStatus16Choice.mmDefaultAction,
						com.tools20022.repository.choice.InstructionProcessingStatus16Choice.mmStandingInstruction, com.tools20022.repository.choice.InstructionProcessingStatus16Choice.mmProprietaryStatus);
				trace_lazy = () -> CorporateActionStatusReason.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InstructionProcessingStatus16Choice";
				definition = "Choice between different instruction processing statuses.";
			}
		});
		return mmObject_lazy.get();
	}

	public CancelledStatus4Choice getCancelled() {
		return cancelled;
	}

	public InstructionProcessingStatus16Choice setCancelled(CancelledStatus4Choice cancelled) {
		this.cancelled = Objects.requireNonNull(cancelled);
		return this;
	}

	public AcceptedStatus5Choice getAcceptedForFurtherProcessing() {
		return acceptedForFurtherProcessing;
	}

	public InstructionProcessingStatus16Choice setAcceptedForFurtherProcessing(AcceptedStatus5Choice acceptedForFurtherProcessing) {
		this.acceptedForFurtherProcessing = Objects.requireNonNull(acceptedForFurtherProcessing);
		return this;
	}

	public RejectedStatus11Choice getRejected() {
		return rejected;
	}

	public InstructionProcessingStatus16Choice setRejected(RejectedStatus11Choice rejected) {
		this.rejected = Objects.requireNonNull(rejected);
		return this;
	}

	public PendingStatus33Choice getPending() {
		return pending;
	}

	public InstructionProcessingStatus16Choice setPending(PendingStatus33Choice pending) {
		this.pending = Objects.requireNonNull(pending);
		return this;
	}

	public NoSpecifiedReason1 getDefaultAction() {
		return defaultAction;
	}

	public InstructionProcessingStatus16Choice setDefaultAction(NoSpecifiedReason1 defaultAction) {
		this.defaultAction = Objects.requireNonNull(defaultAction);
		return this;
	}

	public NoSpecifiedReason1 getStandingInstruction() {
		return standingInstruction;
	}

	public InstructionProcessingStatus16Choice setStandingInstruction(NoSpecifiedReason1 standingInstruction) {
		this.standingInstruction = Objects.requireNonNull(standingInstruction);
		return this;
	}

	public ProprietaryStatusAndReason2 getProprietaryStatus() {
		return proprietaryStatus;
	}

	public InstructionProcessingStatus16Choice setProprietaryStatus(ProprietaryStatusAndReason2 proprietaryStatus) {
		this.proprietaryStatus = Objects.requireNonNull(proprietaryStatus);
		return this;
	}
}