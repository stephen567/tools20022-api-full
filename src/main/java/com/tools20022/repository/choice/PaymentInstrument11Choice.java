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
import com.tools20022.repository.entity.ChequeIssue;
import com.tools20022.repository.entity.CreditTransfer;
import com.tools20022.repository.entity.InvestmentAccount;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Cheque3;
import com.tools20022.repository.msg.CreditTransfer6;
import com.tools20022.repository.msg.InvestmentAccount20;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between types of payment instrument, ie, cheque, credit transfer or
 * investment account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument11Choice#mmCreditTransferDetails
 * PaymentInstrument11Choice.mmCreditTransferDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument11Choice#mmChequeDetails
 * PaymentInstrument11Choice.mmChequeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument11Choice#mmBankersDraftDetails
 * PaymentInstrument11Choice.mmBankersDraftDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument11Choice#mmCashAccountDetails
 * PaymentInstrument11Choice.mmCashAccountDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentInstrument11Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between types of payment instrument, ie, cheque, credit transfer or investment account."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.PaymentInstrument21Choice
 * PaymentInstrument21Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentInstrument11Choice", propOrder = {"creditTransferDetails", "chequeDetails", "bankersDraftDetails", "cashAccountDetails"})
public class PaymentInstrument11Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CdtTrfDtls", required = true)
	protected CreditTransfer6 creditTransferDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CreditTransfer6
	 * CreditTransfer6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CreditTransfer
	 * CreditTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument11Choice
	 * PaymentInstrument11Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtTrfDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditTransferDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment instrument between a debtor and a creditor, which flows through one or more financial institutions or systems."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument21Choice#mmCreditTransferDetails
	 * PaymentInstrument21Choice.mmCreditTransferDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentInstrument11Choice, CreditTransfer6> mmCreditTransferDetails = new MMMessageAssociationEnd<PaymentInstrument11Choice, CreditTransfer6>() {
		{
			businessComponentTrace_lazy = () -> CreditTransfer.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentInstrument11Choice.mmObject();
			isDerived = false;
			xmlTag = "CdtTrfDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditTransferDetails";
			definition = "Payment instrument between a debtor and a creditor, which flows through one or more financial institutions or systems.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstrument21Choice.mmCreditTransferDetails);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CreditTransfer6.mmObject();
		}

		@Override
		public CreditTransfer6 getValue(PaymentInstrument11Choice obj) {
			return obj.getCreditTransferDetails();
		}

		@Override
		public void setValue(PaymentInstrument11Choice obj, CreditTransfer6 value) {
			obj.setCreditTransferDetails(value);
		}
	};
	@XmlElement(name = "ChqDtls", required = true)
	protected Cheque3 chequeDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Cheque3 Cheque3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ChequeIssue ChequeIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument11Choice
	 * PaymentInstrument11Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChqDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Written order on which instructions are given to an account holder (a financial institution) to pay a stated sum to a named recipient (the payee)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument21Choice#mmChequeDetails
	 * PaymentInstrument21Choice.mmChequeDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentInstrument11Choice, Cheque3> mmChequeDetails = new MMMessageAssociationEnd<PaymentInstrument11Choice, Cheque3>() {
		{
			businessComponentTrace_lazy = () -> ChequeIssue.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentInstrument11Choice.mmObject();
			isDerived = false;
			xmlTag = "ChqDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeDetails";
			definition = "Written order on which instructions are given to an account holder (a financial institution) to pay a stated sum to a named recipient (the payee).";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstrument21Choice.mmChequeDetails);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Cheque3.mmObject();
		}

		@Override
		public Cheque3 getValue(PaymentInstrument11Choice obj) {
			return obj.getChequeDetails();
		}

		@Override
		public void setValue(PaymentInstrument11Choice obj, Cheque3 value) {
			obj.setChequeDetails(value);
		}
	};
	@XmlElement(name = "BkrsDrftDtls", required = true)
	protected Cheque3 bankersDraftDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Cheque3 Cheque3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ChequeIssue ChequeIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument11Choice
	 * PaymentInstrument11Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BkrsDrftDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankersDraftDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cheque drawn by a bank on itself or its agent. A person who owes money to another buys the draft from a bank for cash and hands it to the creditor."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument21Choice#mmBankersDraftDetails
	 * PaymentInstrument21Choice.mmBankersDraftDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentInstrument11Choice, Cheque3> mmBankersDraftDetails = new MMMessageAssociationEnd<PaymentInstrument11Choice, Cheque3>() {
		{
			businessComponentTrace_lazy = () -> ChequeIssue.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentInstrument11Choice.mmObject();
			isDerived = false;
			xmlTag = "BkrsDrftDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankersDraftDetails";
			definition = "Cheque drawn by a bank on itself or its agent. A person who owes money to another buys the draft from a bank for cash and hands it to the creditor.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstrument21Choice.mmBankersDraftDetails);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Cheque3.mmObject();
		}

		@Override
		public Cheque3 getValue(PaymentInstrument11Choice obj) {
			return obj.getBankersDraftDetails();
		}

		@Override
		public void setValue(PaymentInstrument11Choice obj, Cheque3 value) {
			obj.setBankersDraftDetails(value);
		}
	};
	@XmlElement(name = "CshAcctDtls", required = true)
	protected InvestmentAccount20 cashAccountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InvestmentAccount20
	 * InvestmentAccount20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmCashAccount
	 * InvestmentAccount.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument11Choice
	 * PaymentInstrument11Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshAcctDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Part of the investment account to or from which cash entries are made."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument21Choice#mmCashAccountDetails
	 * PaymentInstrument21Choice.mmCashAccountDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentInstrument11Choice, InvestmentAccount20> mmCashAccountDetails = new MMMessageAssociationEnd<PaymentInstrument11Choice, InvestmentAccount20>() {
		{
			businessElementTrace_lazy = () -> InvestmentAccount.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentInstrument11Choice.mmObject();
			isDerived = false;
			xmlTag = "CshAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccountDetails";
			definition = "Part of the investment account to or from which cash entries are made.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstrument21Choice.mmCashAccountDetails);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InvestmentAccount20.mmObject();
		}

		@Override
		public InvestmentAccount20 getValue(PaymentInstrument11Choice obj) {
			return obj.getCashAccountDetails();
		}

		@Override
		public void setValue(PaymentInstrument11Choice obj, InvestmentAccount20 value) {
			obj.setCashAccountDetails(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PaymentInstrument11Choice.mmCreditTransferDetails, com.tools20022.repository.choice.PaymentInstrument11Choice.mmChequeDetails,
						com.tools20022.repository.choice.PaymentInstrument11Choice.mmBankersDraftDetails, com.tools20022.repository.choice.PaymentInstrument11Choice.mmCashAccountDetails);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentInstrument11Choice";
				definition = "Choice between types of payment instrument, ie, cheque, credit transfer or investment account.";
				nextVersions_lazy = () -> Arrays.asList(PaymentInstrument21Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public CreditTransfer6 getCreditTransferDetails() {
		return creditTransferDetails;
	}

	public PaymentInstrument11Choice setCreditTransferDetails(CreditTransfer6 creditTransferDetails) {
		this.creditTransferDetails = Objects.requireNonNull(creditTransferDetails);
		return this;
	}

	public Cheque3 getChequeDetails() {
		return chequeDetails;
	}

	public PaymentInstrument11Choice setChequeDetails(Cheque3 chequeDetails) {
		this.chequeDetails = Objects.requireNonNull(chequeDetails);
		return this;
	}

	public Cheque3 getBankersDraftDetails() {
		return bankersDraftDetails;
	}

	public PaymentInstrument11Choice setBankersDraftDetails(Cheque3 bankersDraftDetails) {
		this.bankersDraftDetails = Objects.requireNonNull(bankersDraftDetails);
		return this;
	}

	public InvestmentAccount20 getCashAccountDetails() {
		return cashAccountDetails;
	}

	public PaymentInstrument11Choice setCashAccountDetails(InvestmentAccount20 cashAccountDetails) {
		this.cashAccountDetails = Objects.requireNonNull(cashAccountDetails);
		return this;
	}
}