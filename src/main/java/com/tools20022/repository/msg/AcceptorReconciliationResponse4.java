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
import com.tools20022.repository.entity.CardPaymentStatus;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Reconciliation response from the acquirer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse4#Environment
 * AcceptorReconciliationResponse4.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse4#TransactionResponse
 * AcceptorReconciliationResponse4.TransactionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse4#Transaction
 * AcceptorReconciliationResponse4.Transaction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPaymentStatus
 * CardPaymentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationResponseV05#ReconciliationResponse
 * AcceptorReconciliationResponseV05.ReconciliationResponse}</li>
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
 * "AcceptorReconciliationResponse4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Reconciliation response from the acquirer."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse3
 * AcceptorReconciliationResponse3}</li>
 * </ul>
 */
public class AcceptorReconciliationResponse4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Environment of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment38
	 * CardPaymentEnvironment38}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentStatus#CardPayment
	 * CardPaymentStatus.CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse4
	 * AcceptorReconciliationResponse4}</li>
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
	 * definition} = "Environment of the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse3#Environment
	 * AcceptorReconciliationResponse3.Environment}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Environment = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AcceptorReconciliationResponse4.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CardPaymentStatus.CardPayment;
			isDerived = false;
			xmlTag = "Envt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environment";
			definition = "Environment of the transaction.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.AcceptorReconciliationResponse3.Environment;
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CardPaymentEnvironment38.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Response from the acquirer to the reconciliation transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ResponseType5
	 * ResponseType5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#Response
	 * CardPaymentValidation.Response}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse4
	 * AcceptorReconciliationResponse4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxRspn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Response from the acquirer to the reconciliation transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse3#TransactionResponse
	 * AcceptorReconciliationResponse3.TransactionResponse}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd TransactionResponse = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AcceptorReconciliationResponse4.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.Response;
			isDerived = false;
			xmlTag = "TxRspn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionResponse";
			definition = "Response from the acquirer to the reconciliation transaction.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.AcceptorReconciliationResponse3.TransactionResponse;
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ResponseType5.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Reconciliation transaction between an acceptor an acquirer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation4
	 * TransactionReconciliation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#Reconciliation
	 * CardPayment.Reconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse4
	 * AcceptorReconciliationResponse4}</li>
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
	 * definition} =
	 * "Reconciliation transaction between an acceptor an acquirer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse3#Transaction
	 * AcceptorReconciliationResponse3.Transaction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Transaction = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AcceptorReconciliationResponse4.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CardPayment.Reconciliation;
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Reconciliation transaction between an acceptor an acquirer.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.AcceptorReconciliationResponse3.Transaction;
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> TransactionReconciliation4.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcceptorReconciliationResponse4.Environment, com.tools20022.repository.msg.AcceptorReconciliationResponse4.TransactionResponse,
						com.tools20022.repository.msg.AcceptorReconciliationResponse4.Transaction);
				trace_lazy = () -> CardPaymentStatus.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.caaa.AcceptorReconciliationResponseV05.ReconciliationResponse);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AcceptorReconciliationResponse4";
				definition = "Reconciliation response from the acquirer.";
				previousVersion_lazy = () -> AcceptorReconciliationResponse3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}