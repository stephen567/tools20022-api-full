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
import com.tools20022.repository.datatype.Max140Binary;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information related to the response of an ATM key download from an ATM
 * manager.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadResponse2#Environment
 * ATMKeyDownloadResponse2.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadResponse2#ATMSecurityContext
 * ATMKeyDownloadResponse2.ATMSecurityContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadResponse2#ATMChallenge
 * ATMKeyDownloadResponse2.ATMChallenge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadResponse2#HostSecurityParameters
 * ATMKeyDownloadResponse2.HostSecurityParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadResponse2#Command
 * ATMKeyDownloadResponse2.Command}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMKeyDownloadResponseV02#ATMKeyDownloadResponse
 * ATMKeyDownloadResponseV02.ATMKeyDownloadResponse}</li>
 * </ul>
 * </li>
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
 * "ATMKeyDownloadResponse2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information related to the response of an ATM key download from an ATM manager."
 * </li>
 * </ul>
 */
public class ATMKeyDownloadResponse2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Environment of the key download.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMEnvironment7
	 * ATMEnvironment7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadResponse2
	 * ATMKeyDownloadResponse2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Envt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Environment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Environment of the key download."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Environment = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMKeyDownloadResponse2.mmObject();
			isDerived = false;
			xmlTag = "Envt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environment";
			definition = "Environment of the key download.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ATMEnvironment7.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Context of the ATM for the key download.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMSecurityContext2
	 * ATMSecurityContext2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadResponse2
	 * ATMKeyDownloadResponse2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATMSctyCntxt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMSecurityContext"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Context of the ATM for the key download."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ATMSecurityContext = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMKeyDownloadResponse2.mmObject();
			isDerived = false;
			xmlTag = "ATMSctyCntxt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMSecurityContext";
			definition = "Context of the ATM for the key download.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ATMSecurityContext2.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Random value from the ATM provided during a previous exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max140Binary Max140Binary}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadResponse2
	 * ATMKeyDownloadResponse2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATMChllng"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMChallenge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Random value from the ATM provided during a previous exchange."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute ATMChallenge = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMKeyDownloadResponse2.mmObject();
			isDerived = false;
			xmlTag = "ATMChllng";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMChallenge";
			definition = "Random value from the ATM provided during a previous exchange.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max140Binary.mmObject();
		}
	};
	/**
	 * Security parameters of the host downloading the key.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecurityParameters5
	 * SecurityParameters5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadResponse2
	 * ATMKeyDownloadResponse2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HstSctyParams"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HostSecurityParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security parameters of the host downloading the key."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd HostSecurityParameters = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMKeyDownloadResponse2.mmObject();
			isDerived = false;
			xmlTag = "HstSctyParams";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostSecurityParameters";
			definition = "Security parameters of the host downloading the key.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecurityParameters5.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Maintenance command to perform on the ATM.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMCommand7
	 * ATMCommand7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadResponse2
	 * ATMKeyDownloadResponse2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cmd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Command"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Maintenance command to perform on the ATM."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Command = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMKeyDownloadResponse2.mmObject();
			isDerived = false;
			xmlTag = "Cmd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Command";
			definition = "Maintenance command to perform on the ATM.";
			minOccurs = 0;
			type_lazy = () -> ATMCommand7.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMKeyDownloadResponse2.Environment, com.tools20022.repository.msg.ATMKeyDownloadResponse2.ATMSecurityContext,
						com.tools20022.repository.msg.ATMKeyDownloadResponse2.ATMChallenge, com.tools20022.repository.msg.ATMKeyDownloadResponse2.HostSecurityParameters, com.tools20022.repository.msg.ATMKeyDownloadResponse2.Command);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.caam.ATMKeyDownloadResponseV02.ATMKeyDownloadResponse);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ATMKeyDownloadResponse2";
				definition = "Information related to the response of an ATM key download from an ATM manager.";
			}
		});
		return mmObject_lazy.get();
	}
}