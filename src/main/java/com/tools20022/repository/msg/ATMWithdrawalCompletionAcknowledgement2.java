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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information related to the acknowledgement of an ATM withdrawal from the ATM
 * manager.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMWithdrawalCompletionAcknowledgement2#ATM
 * ATMWithdrawalCompletionAcknowledgement2.ATM}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMWithdrawalCompletionAcknowledgement2#Context
 * ATMWithdrawalCompletionAcknowledgement2.Context}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMWithdrawalCompletionAcknowledgement2#Transaction
 * ATMWithdrawalCompletionAcknowledgement2.Transaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalCompletionAcknowledgementV02#ATMWithdrawalCompletionAcknowledgement
 * ATMWithdrawalCompletionAcknowledgementV02.
 * ATMWithdrawalCompletionAcknowledgement}</li>
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
 * "ATMWithdrawalCompletionAcknowledgement2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information related to the acknowledgement  of an ATM withdrawal from the ATM manager."
 * </li>
 * </ul>
 */
public class ATMWithdrawalCompletionAcknowledgement2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * ATM information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine3
	 * AutomatedTellerMachine3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMWithdrawalCompletionAcknowledgement2
	 * ATMWithdrawalCompletionAcknowledgement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ATM information."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ATM = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMWithdrawalCompletionAcknowledgement2.mmObject();
			isDerived = false;
			xmlTag = "ATM";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATM";
			definition = "ATM information.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AutomatedTellerMachine3.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Context in which the transaction is performed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMContext9
	 * ATMContext9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMWithdrawalCompletionAcknowledgement2
	 * ATMWithdrawalCompletionAcknowledgement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cntxt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Context"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Context in which the transaction is performed."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Context = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMWithdrawalCompletionAcknowledgement2.mmObject();
			isDerived = false;
			xmlTag = "Cntxt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Context";
			definition = "Context in which the transaction is performed.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ATMContext9.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Acknowledgement of the withdrawal completion advice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMTransaction18
	 * ATMTransaction18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMWithdrawalCompletionAcknowledgement2
	 * ATMWithdrawalCompletionAcknowledgement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Acknowledgement of the withdrawal completion advice."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Transaction = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMWithdrawalCompletionAcknowledgement2.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Acknowledgement of the withdrawal completion advice.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ATMTransaction18.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMWithdrawalCompletionAcknowledgement2.ATM, com.tools20022.repository.msg.ATMWithdrawalCompletionAcknowledgement2.Context,
						com.tools20022.repository.msg.ATMWithdrawalCompletionAcknowledgement2.Transaction);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.catp.ATMWithdrawalCompletionAcknowledgementV02.ATMWithdrawalCompletionAcknowledgement);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ATMWithdrawalCompletionAcknowledgement2";
				definition = "Information related to the acknowledgement  of an ATM withdrawal from the ATM manager.";
			}
		});
		return mmObject_lazy.get();
	}
}