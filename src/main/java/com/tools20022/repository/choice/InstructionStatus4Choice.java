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

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.MeetingStatus;
import com.tools20022.repository.entity.MeetingStatusReason;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AdditionalStatus1;
import com.tools20022.repository.msg.InstructionProcessingStatus1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Status applying globally to the instruction received.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionStatus4Choice#mmProcessingStatus
 * InstructionStatus4Choice.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionStatus4Choice#mmRejectionStatus
 * InstructionStatus4Choice.mmRejectionStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.MeetingStatus
 * MeetingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InstructionStatus4Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Status applying globally to the instruction received."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.InstructionStatus6Choice
 * InstructionStatus6Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InstructionStatus4Choice", propOrder = {"processingStatus", "rejectionStatus"})
public class InstructionStatus4Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PrcgSts", required = true)
	protected InstructionProcessingStatus1 processingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InstructionProcessingStatus1
	 * InstructionProcessingStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmInstructionProcessingStatus
	 * Status.mmInstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus4Choice
	 * InstructionStatus4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcgSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status advising on the processing of the instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus6Choice#mmProcessingStatus
	 * InstructionStatus6Choice.mmProcessingStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructionStatus4Choice, InstructionProcessingStatus1> mmProcessingStatus = new MMMessageAssociationEnd<InstructionStatus4Choice, InstructionProcessingStatus1>() {
		{
			businessElementTrace_lazy = () -> Status.mmInstructionProcessingStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionStatus4Choice.mmObject();
			isDerived = false;
			xmlTag = "PrcgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingStatus";
			definition = "Status advising on the processing of the instruction.";
			nextVersions_lazy = () -> Arrays.asList(InstructionStatus6Choice.mmProcessingStatus);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InstructionProcessingStatus1.mmObject();
		}

		@Override
		public InstructionProcessingStatus1 getValue(InstructionStatus4Choice obj) {
			return obj.getProcessingStatus();
		}

		@Override
		public void setValue(InstructionStatus4Choice obj, InstructionProcessingStatus1 value) {
			obj.setProcessingStatus(value);
		}
	};
	@XmlElement(name = "RjctnSts", required = true)
	protected AdditionalStatus1 rejectionStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AdditionalStatus1
	 * AdditionalStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MeetingStatusReason#mmInstructionRejectionReason
	 * MeetingStatusReason.mmInstructionRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus4Choice
	 * InstructionStatus4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctnSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status advising on the rejection of the instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus6Choice#mmRejectionStatus
	 * InstructionStatus6Choice.mmRejectionStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructionStatus4Choice, AdditionalStatus1> mmRejectionStatus = new MMMessageAssociationEnd<InstructionStatus4Choice, AdditionalStatus1>() {
		{
			businessElementTrace_lazy = () -> MeetingStatusReason.mmInstructionRejectionReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionStatus4Choice.mmObject();
			isDerived = false;
			xmlTag = "RjctnSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectionStatus";
			definition = "Status advising on the rejection of the instruction.";
			nextVersions_lazy = () -> Arrays.asList(InstructionStatus6Choice.mmRejectionStatus);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AdditionalStatus1.mmObject();
		}

		@Override
		public AdditionalStatus1 getValue(InstructionStatus4Choice obj) {
			return obj.getRejectionStatus();
		}

		@Override
		public void setValue(InstructionStatus4Choice obj, AdditionalStatus1 value) {
			obj.setRejectionStatus(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.InstructionStatus4Choice.mmProcessingStatus, com.tools20022.repository.choice.InstructionStatus4Choice.mmRejectionStatus);
				trace_lazy = () -> MeetingStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InstructionStatus4Choice";
				definition = "Status applying globally to the instruction received.";
				nextVersions_lazy = () -> Arrays.asList(InstructionStatus6Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public InstructionProcessingStatus1 getProcessingStatus() {
		return processingStatus;
	}

	public InstructionStatus4Choice setProcessingStatus(InstructionProcessingStatus1 processingStatus) {
		this.processingStatus = Objects.requireNonNull(processingStatus);
		return this;
	}

	public AdditionalStatus1 getRejectionStatus() {
		return rejectionStatus;
	}

	public InstructionStatus4Choice setRejectionStatus(AdditionalStatus1 rejectionStatus) {
		this.rejectionStatus = Objects.requireNonNull(rejectionStatus);
		return this;
	}
}