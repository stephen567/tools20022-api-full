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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.choice.Vote2Choice;
import com.tools20022.repository.choice.VoteInstructionForMeetingResolution1Choice;
import com.tools20022.repository.entity.VoteInstructionRequest;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies detailed voting instructions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteDetails2#VoteInstructionForAgendaResolution
 * VoteDetails2.VoteInstructionForAgendaResolution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteDetails2#VoteInstructionForMeetingResolution
 * VoteDetails2.VoteInstructionForMeetingResolution}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.VoteInstructionRequest
 * VoteInstructionRequest}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "VoteDetails2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies detailed voting instructions."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.VoteDetails3 VoteDetails3}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class VoteDetails2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates the vote instruction for the resolutions which are announced
	 * via the meeting agenda in advance of the meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Vote2Choice
	 * Vote2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest#VotePerResolution
	 * VoteInstructionRequest.VotePerResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteDetails2 VoteDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VoteInstrForAgndRsltn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteInstructionForAgendaResolution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the vote instruction for the resolutions which are announced via the meeting agenda in advance of the meeting."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteDetails3#VoteInstructionForAgendaResolution
	 * VoteDetails3.VoteInstructionForAgendaResolution}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd VoteInstructionForAgendaResolution = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> VoteDetails2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.VoteInstructionRequest.VotePerResolution;
			isDerived = false;
			xmlTag = "VoteInstrForAgndRsltn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteInstructionForAgendaResolution";
			definition = "Indicates the vote instruction for the resolutions which are announced via the meeting agenda in advance of the meeting.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.VoteDetails3.VoteInstructionForAgendaResolution);
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Vote2Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Indicates the vote instruction for the resolutions that may arise at the
	 * meeting but were not previously provided in the agenda.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.VoteInstructionForMeetingResolution1Choice
	 * VoteInstructionForMeetingResolution1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest#VoteForMeetingResolution
	 * VoteInstructionRequest.VoteForMeetingResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteDetails2 VoteDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VoteInstrForMtgRsltn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteInstructionForMeetingResolution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the vote instruction for the resolutions that may arise at the meeting but were not previously provided in the agenda."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteDetails3#VoteInstructionForMeetingResolution
	 * VoteDetails3.VoteInstructionForMeetingResolution}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd VoteInstructionForMeetingResolution = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> VoteDetails2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.VoteInstructionRequest.VoteForMeetingResolution;
			isDerived = false;
			xmlTag = "VoteInstrForMtgRsltn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteInstructionForMeetingResolution";
			definition = "Indicates the vote instruction for the resolutions that may arise at the meeting but were not previously provided in the agenda.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.VoteDetails3.VoteInstructionForMeetingResolution);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> VoteInstructionForMeetingResolution1Choice.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.VoteDetails2.VoteInstructionForAgendaResolution, com.tools20022.repository.msg.VoteDetails2.VoteInstructionForMeetingResolution);
				trace_lazy = () -> VoteInstructionRequest.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "VoteDetails2";
				definition = "Specifies detailed voting instructions.";
				nextVersions_lazy = () -> Arrays.asList(VoteDetails3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}