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
import com.tools20022.repository.area.caaa.AcceptorCancellationAdviceV04;
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CardPaymentContext11;
import com.tools20022.repository.msg.CardPaymentEnvironment36;
import com.tools20022.repository.msg.CardPaymentTransaction44;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Cancellation transaction between an acceptor and an acquirer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice4#mmEnvironment
 * AcceptorCancellationAdvice4.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice4#mmContext
 * AcceptorCancellationAdvice4.mmContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice4#mmTransaction
 * AcceptorCancellationAdvice4.mmTransaction}</li>
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
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceV04#mmCancellationAdvice
 * AcceptorCancellationAdviceV04.mmCancellationAdvice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AcceptorCancellationAdvice4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Cancellation transaction between an acceptor and an acquirer."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice5
 * AcceptorCancellationAdvice5}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice3
 * AcceptorCancellationAdvice3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AcceptorCancellationAdvice4", propOrder = {"environment", "context", "transaction"})
public class AcceptorCancellationAdvice4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Envt", required = true)
	protected CardPaymentEnvironment36 environment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment36
	 * CardPaymentEnvironment36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice4
	 * AcceptorCancellationAdvice4}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice5#mmEnvironment
	 * AcceptorCancellationAdvice5.mmEnvironment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice3#mmEnvironment
	 * AcceptorCancellationAdvice3.mmEnvironment}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AcceptorCancellationAdvice4, CardPaymentEnvironment36> mmEnvironment = new MMMessageAssociationEnd<AcceptorCancellationAdvice4, CardPaymentEnvironment36>() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptorCancellationAdvice4.mmObject();
			isDerived = false;
			xmlTag = "Envt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environment";
			definition = "Environment of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorCancellationAdvice5.mmEnvironment);
			previousVersion_lazy = () -> AcceptorCancellationAdvice3.mmEnvironment;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CardPaymentEnvironment36.mmObject();
		}

		@Override
		public CardPaymentEnvironment36 getValue(AcceptorCancellationAdvice4 obj) {
			return obj.getEnvironment();
		}

		@Override
		public void setValue(AcceptorCancellationAdvice4 obj, CardPaymentEnvironment36 value) {
			obj.setEnvironment(value);
		}
	};
	@XmlElement(name = "Cntxt")
	protected CardPaymentContext11 context;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CardPaymentContext11
	 * CardPaymentContext11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmCardPaymentAcquiring
	 * CardPayment.mmCardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice4
	 * AcceptorCancellationAdvice4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cntxt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Context"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Context in which the transaction is performed (payment and sale)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice5#mmContext
	 * AcceptorCancellationAdvice5.mmContext}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice3#mmContext
	 * AcceptorCancellationAdvice3.mmContext}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AcceptorCancellationAdvice4, Optional<CardPaymentContext11>> mmContext = new MMMessageAssociationEnd<AcceptorCancellationAdvice4, Optional<CardPaymentContext11>>() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmCardPaymentAcquiring;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptorCancellationAdvice4.mmObject();
			isDerived = false;
			xmlTag = "Cntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Context";
			definition = "Context in which the transaction is performed (payment and sale).";
			nextVersions_lazy = () -> Arrays.asList(AcceptorCancellationAdvice5.mmContext);
			previousVersion_lazy = () -> AcceptorCancellationAdvice3.mmContext;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CardPaymentContext11.mmObject();
		}

		@Override
		public Optional<CardPaymentContext11> getValue(AcceptorCancellationAdvice4 obj) {
			return obj.getContext();
		}

		@Override
		public void setValue(AcceptorCancellationAdvice4 obj, Optional<CardPaymentContext11> value) {
			obj.setContext(value.orElse(null));
		}
	};
	@XmlElement(name = "Tx", required = true)
	protected CardPaymentTransaction44 transaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction44
	 * CardPaymentTransaction44}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice4
	 * AcceptorCancellationAdvice4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tx"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation transaction between an acceptor and an acquirer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice5#mmTransaction
	 * AcceptorCancellationAdvice5.mmTransaction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice3#mmTransaction
	 * AcceptorCancellationAdvice3.mmTransaction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AcceptorCancellationAdvice4, CardPaymentTransaction44> mmTransaction = new MMMessageAssociationEnd<AcceptorCancellationAdvice4, CardPaymentTransaction44>() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptorCancellationAdvice4.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Cancellation transaction between an acceptor and an acquirer.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorCancellationAdvice5.mmTransaction);
			previousVersion_lazy = () -> AcceptorCancellationAdvice3.mmTransaction;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CardPaymentTransaction44.mmObject();
		}

		@Override
		public CardPaymentTransaction44 getValue(AcceptorCancellationAdvice4 obj) {
			return obj.getTransaction();
		}

		@Override
		public void setValue(AcceptorCancellationAdvice4 obj, CardPaymentTransaction44 value) {
			obj.setTransaction(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcceptorCancellationAdvice4.mmEnvironment, com.tools20022.repository.msg.AcceptorCancellationAdvice4.mmContext,
						com.tools20022.repository.msg.AcceptorCancellationAdvice4.mmTransaction);
				messageBuildingBlock_lazy = () -> Arrays.asList(AcceptorCancellationAdviceV04.mmCancellationAdvice);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcceptorCancellationAdvice4";
				definition = "Cancellation transaction between an acceptor and an acquirer.";
				nextVersions_lazy = () -> Arrays.asList(AcceptorCancellationAdvice5.mmObject());
				previousVersion_lazy = () -> AcceptorCancellationAdvice3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public CardPaymentEnvironment36 getEnvironment() {
		return environment;
	}

	public AcceptorCancellationAdvice4 setEnvironment(CardPaymentEnvironment36 environment) {
		this.environment = Objects.requireNonNull(environment);
		return this;
	}

	public Optional<CardPaymentContext11> getContext() {
		return context == null ? Optional.empty() : Optional.of(context);
	}

	public AcceptorCancellationAdvice4 setContext(CardPaymentContext11 context) {
		this.context = context;
		return this;
	}

	public CardPaymentTransaction44 getTransaction() {
		return transaction;
	}

	public AcceptorCancellationAdvice4 setTransaction(CardPaymentTransaction44 transaction) {
		this.transaction = Objects.requireNonNull(transaction);
		return this;
	}
}