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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.choice.EnabledStatusReason2Choice;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.StatusReason;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Reason for an enabled status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.EnabledStatusReason1#Code
 * EnabledStatusReason1.Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EnabledStatusReason1#AdditionalInformation
 * EnabledStatusReason1.AdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.StatusReason
 * StatusReason}</li>
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
 * "EnabledStatusReason1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Reason for an enabled status."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ProformaStatusReason1
 * ProformaStatusReason1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DisabledStatusReason1
 * DisabledStatusReason1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountStatusUpdateInstructionReason1
 * AccountStatusUpdateInstructionReason1}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class EnabledStatusReason1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Reason for the enabled account status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.EnabledStatusReason2Choice
	 * EnabledStatusReason2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EnabledStatusReason1
	 * EnabledStatusReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Code"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the enabled account status."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ProformaStatusReason1#Code
	 * ProformaStatusReason1.Code}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DisabledStatusReason1#Code
	 * DisabledStatusReason1.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountStatusUpdateInstructionReason1#Code
	 * AccountStatusUpdateInstructionReason1.Code}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Code = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> EnabledStatusReason1.mmObject();
			businessComponentTrace_lazy = () -> StatusReason.mmObject();
			isDerived = false;
			xmlTag = "Cd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Code";
			definition = "Reason for the enabled account status.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ProformaStatusReason1.Code, com.tools20022.repository.msg.DisabledStatusReason1.Code,
					com.tools20022.repository.msg.AccountStatusUpdateInstructionReason1.Code);
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> EnabledStatusReason2Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Additional information about the reason for the enabled account status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EnabledStatusReason1
	 * EnabledStatusReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information about the reason for the enabled account status."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProformaStatusReason1#AdditionalInformation
	 * ProformaStatusReason1.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DisabledStatusReason1#AdditionalInformation
	 * DisabledStatusReason1.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountStatusUpdateInstructionReason1#AdditionalInformation
	 * AccountStatusUpdateInstructionReason1.AdditionalInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute AdditionalInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> EnabledStatusReason1.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information about the reason for the enabled account status.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ProformaStatusReason1.AdditionalInformation, com.tools20022.repository.msg.DisabledStatusReason1.AdditionalInformation,
					com.tools20022.repository.msg.AccountStatusUpdateInstructionReason1.AdditionalInformation);
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EnabledStatusReason1.Code, com.tools20022.repository.msg.EnabledStatusReason1.AdditionalInformation);
				trace_lazy = () -> StatusReason.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "EnabledStatusReason1";
				definition = "Reason for an enabled status.";
				nextVersions_lazy = () -> Arrays.asList(ProformaStatusReason1.mmObject(), DisabledStatusReason1.mmObject(), AccountStatusUpdateInstructionReason1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}