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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.caaa.AcceptorAuthorisationResponseV05;
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CardPaymentEnvironment46;
import com.tools20022.repository.msg.CardPaymentTransaction53;
import com.tools20022.repository.msg.CardPaymentTransaction54;
import com.tools20022.repository.msg.SupplementaryData1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Authorisation response from the acquirer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse5#mmEnvironment
 * AcceptorAuthorisationResponse5.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse5#mmTransaction
 * AcceptorAuthorisationResponse5.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse5#mmTransactionResponse
 * AcceptorAuthorisationResponse5.mmTransactionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse5#mmSupplementaryData
 * AcceptorAuthorisationResponse5.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPayment
 * CardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationResponseV05#mmAuthorisationResponse
 * AcceptorAuthorisationResponseV05.mmAuthorisationResponse}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AcceptorAuthorisationResponse5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Authorisation response from the acquirer."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse6
 * AcceptorAuthorisationResponse6}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse4
 * AcceptorAuthorisationResponse4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AcceptorAuthorisationResponse5", propOrder = {"environment", "transaction", "transactionResponse", "supplementaryData"})
public class AcceptorAuthorisationResponse5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Envt", required = true)
	protected CardPaymentEnvironment46 environment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment46
	 * CardPaymentEnvironment46}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse5
	 * AcceptorAuthorisationResponse5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Envt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Environment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Environment of the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse6#mmEnvironment
	 * AcceptorAuthorisationResponse6.mmEnvironment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse4#mmEnvironment
	 * AcceptorAuthorisationResponse4.mmEnvironment}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AcceptorAuthorisationResponse5, CardPaymentEnvironment46> mmEnvironment = new MMMessageAssociationEnd<AcceptorAuthorisationResponse5, CardPaymentEnvironment46>() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptorAuthorisationResponse5.mmObject();
			isDerived = false;
			xmlTag = "Envt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environment";
			definition = "Environment of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorAuthorisationResponse6.mmEnvironment);
			previousVersion_lazy = () -> AcceptorAuthorisationResponse4.mmEnvironment;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CardPaymentEnvironment46.mmObject();
		}

		@Override
		public CardPaymentEnvironment46 getValue(AcceptorAuthorisationResponse5 obj) {
			return obj.getEnvironment();
		}

		@Override
		public void setValue(AcceptorAuthorisationResponse5 obj, CardPaymentEnvironment46 value) {
			obj.setEnvironment(value);
		}
	};
	@XmlElement(name = "Tx", required = true)
	protected CardPaymentTransaction53 transaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction53
	 * CardPaymentTransaction53}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse5
	 * AcceptorAuthorisationResponse5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tx"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Authorisation of a card payment transaction between an acceptor and an acquirer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse6#mmTransaction
	 * AcceptorAuthorisationResponse6.mmTransaction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse4#mmTransaction
	 * AcceptorAuthorisationResponse4.mmTransaction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AcceptorAuthorisationResponse5, CardPaymentTransaction53> mmTransaction = new MMMessageAssociationEnd<AcceptorAuthorisationResponse5, CardPaymentTransaction53>() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptorAuthorisationResponse5.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Authorisation of a card payment transaction between an acceptor and an acquirer.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorAuthorisationResponse6.mmTransaction);
			previousVersion_lazy = () -> AcceptorAuthorisationResponse4.mmTransaction;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CardPaymentTransaction53.mmObject();
		}

		@Override
		public CardPaymentTransaction53 getValue(AcceptorAuthorisationResponse5 obj) {
			return obj.getTransaction();
		}

		@Override
		public void setValue(AcceptorAuthorisationResponse5 obj, CardPaymentTransaction53 value) {
			obj.setTransaction(value);
		}
	};
	@XmlElement(name = "TxRspn", required = true)
	protected CardPaymentTransaction54 transactionResponse;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction54
	 * CardPaymentTransaction54}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse5
	 * AcceptorAuthorisationResponse5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxRspn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Authorisation response from the acquirer.\r\nAuthorisation of a card payment transaction between an acceptor and an acquirer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse6#mmTransactionResponse
	 * AcceptorAuthorisationResponse6.mmTransactionResponse}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse4#mmTransactionResponse
	 * AcceptorAuthorisationResponse4.mmTransactionResponse}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AcceptorAuthorisationResponse5, CardPaymentTransaction54> mmTransactionResponse = new MMMessageAssociationEnd<AcceptorAuthorisationResponse5, CardPaymentTransaction54>() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptorAuthorisationResponse5.mmObject();
			isDerived = false;
			xmlTag = "TxRspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionResponse";
			definition = "Authorisation response from the acquirer.\r\nAuthorisation of a card payment transaction between an acceptor and an acquirer.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorAuthorisationResponse6.mmTransactionResponse);
			previousVersion_lazy = () -> AcceptorAuthorisationResponse4.mmTransactionResponse;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CardPaymentTransaction54.mmObject();
		}

		@Override
		public CardPaymentTransaction54 getValue(AcceptorAuthorisationResponse5 obj) {
			return obj.getTransactionResponse();
		}

		@Override
		public void setValue(AcceptorAuthorisationResponse5 obj, CardPaymentTransaction54 value) {
			obj.setTransactionResponse(value);
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse5
	 * AcceptorAuthorisationResponse5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information incorporated as an extension to the message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse6#mmSupplementaryData
	 * AcceptorAuthorisationResponse6.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse4#mmSupplementaryData
	 * AcceptorAuthorisationResponse4.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AcceptorAuthorisationResponse5, List<SupplementaryData1>> mmSupplementaryData = new MMMessageAssociationEnd<AcceptorAuthorisationResponse5, List<SupplementaryData1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptorAuthorisationResponse5.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information incorporated as an extension to the message.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorAuthorisationResponse6.mmSupplementaryData);
			previousVersion_lazy = () -> AcceptorAuthorisationResponse4.mmSupplementaryData;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(AcceptorAuthorisationResponse5 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(AcceptorAuthorisationResponse5 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcceptorAuthorisationResponse5.mmEnvironment, com.tools20022.repository.msg.AcceptorAuthorisationResponse5.mmTransaction,
						com.tools20022.repository.msg.AcceptorAuthorisationResponse5.mmTransactionResponse, com.tools20022.repository.msg.AcceptorAuthorisationResponse5.mmSupplementaryData);
				messageBuildingBlock_lazy = () -> Arrays.asList(AcceptorAuthorisationResponseV05.mmAuthorisationResponse);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcceptorAuthorisationResponse5";
				definition = "Authorisation response from the acquirer.";
				nextVersions_lazy = () -> Arrays.asList(AcceptorAuthorisationResponse6.mmObject());
				previousVersion_lazy = () -> AcceptorAuthorisationResponse4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public CardPaymentEnvironment46 getEnvironment() {
		return environment;
	}

	public AcceptorAuthorisationResponse5 setEnvironment(CardPaymentEnvironment46 environment) {
		this.environment = Objects.requireNonNull(environment);
		return this;
	}

	public CardPaymentTransaction53 getTransaction() {
		return transaction;
	}

	public AcceptorAuthorisationResponse5 setTransaction(CardPaymentTransaction53 transaction) {
		this.transaction = Objects.requireNonNull(transaction);
		return this;
	}

	public CardPaymentTransaction54 getTransactionResponse() {
		return transactionResponse;
	}

	public AcceptorAuthorisationResponse5 setTransactionResponse(CardPaymentTransaction54 transactionResponse) {
		this.transactionResponse = Objects.requireNonNull(transactionResponse);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public AcceptorAuthorisationResponse5 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}
}