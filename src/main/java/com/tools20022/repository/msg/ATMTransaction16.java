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
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.Max10000Binary;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.CardPayment;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Response to the deposit request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction16#TransactionIdentification
 * ATMTransaction16.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction16#ReconciliationIdentification
 * ATMTransaction16.ReconciliationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction16#CompletionRequired
 * ATMTransaction16.CompletionRequired}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction16#AccountData
 * ATMTransaction16.AccountData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction16#ProtectedAccountData
 * ATMTransaction16.ProtectedAccountData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction16#TotalAuthorisedAmount
 * ATMTransaction16.TotalAuthorisedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction16#TotalRequestedAmount
 * ATMTransaction16.TotalRequestedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction16#DetailedRequestedAmount
 * ATMTransaction16.DetailedRequestedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction16#AdditionalCharge
 * ATMTransaction16.AdditionalCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction16#AuthorisationResult
 * ATMTransaction16.AuthorisationResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction16#ICCRelatedData
 * ATMTransaction16.ICCRelatedData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction16#Command
 * ATMTransaction16.Command}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPayment
 * CardPayment}</li>
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
 * "ATMTransaction16"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Response to the deposit request."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction19
 * ATMTransaction19}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ATMTransaction15 ATMTransaction15}</li>
 * </ul>
 */
public class ATMTransaction16 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identification of the transaction assigned by the ATM.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionIdentifier1
	 * TransactionIdentifier1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#TransactionIdentification
	 * CardPaymentAcquiring.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction16
	 * ATMTransaction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the transaction assigned by the ATM."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction19#TransactionIdentification
	 * ATMTransaction19.TransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction15#TransactionIdentification
	 * ATMTransaction15.TransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd TransactionIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMTransaction16.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.TransactionIdentification;
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Identification of the transaction assigned by the ATM.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.ATMTransaction15.TransactionIdentification;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction19.TransactionIdentification);
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> TransactionIdentifier1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Identification of the reconciliation period assigned by the ATM.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#ReconciliationIdentification
	 * ReconciliationTransaction.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction16
	 * ATMTransaction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcncltnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the reconciliation period assigned by the ATM."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction19#ReconciliationIdentification
	 * ATMTransaction19.ReconciliationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction15#ReconciliationIdentification
	 * ATMTransaction15.ReconciliationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute ReconciliationIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTransaction16.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ReconciliationTransaction.ReconciliationIdentification;
			isDerived = false;
			xmlTag = "RcncltnId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationIdentification";
			definition = "Identification of the reconciliation period assigned by the ATM.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.ATMTransaction15.ReconciliationIdentification;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction19.ReconciliationIdentification);
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * True if a completion advice has to be sent after the end of the
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction16
	 * ATMTransaction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmpltnReqrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompletionRequired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "True if a completion advice has to be sent after the end of the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute CompletionRequired = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTransaction16.mmObject();
			isDerived = false;
			xmlTag = "CmpltnReqrd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompletionRequired";
			definition = "True if a completion advice has to be sent after the end of the transaction.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Unprotected account information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CardAccount10
	 * CardAccount10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#Account
	 * Payment.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction16
	 * ATMTransaction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unprotected account information."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction19#AccountData
	 * ATMTransaction19.AccountData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction15#AccountData
	 * ATMTransaction15.AccountData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd AccountData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMTransaction16.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.Account;
			isDerived = false;
			xmlTag = "AcctData";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountData";
			definition = "Unprotected account information.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.ATMTransaction15.AccountData;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction19.AccountData);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CardAccount10.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Encryption of account information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType10
	 * ContentInformationType10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction16
	 * ATMTransaction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctdAcctData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectedAccountData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Encryption of account information."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction19#ProtectedAccountData
	 * ATMTransaction19.ProtectedAccountData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction15#ProtectedAccountData
	 * ATMTransaction15.ProtectedAccountData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ProtectedAccountData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMTransaction16.mmObject();
			isDerived = false;
			xmlTag = "PrtctdAcctData";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedAccountData";
			definition = "Encryption of account information.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.ATMTransaction15.ProtectedAccountData;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction19.ProtectedAccountData);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ContentInformationType10.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Total authorised amount of the deposit transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndCurrency1
	 * AmountAndCurrency1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#Amount
	 * Payment.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction16
	 * ATMTransaction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlAuthrsdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAuthorisedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total authorised amount of the deposit transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction19#TotalAuthorisedAmount
	 * ATMTransaction19.TotalAuthorisedAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction15#TotalAmount
	 * ATMTransaction15.TotalAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd TotalAuthorisedAmount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMTransaction16.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.Amount;
			isDerived = false;
			xmlTag = "TtlAuthrsdAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAuthorisedAmount";
			definition = "Total authorised amount of the deposit transaction.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.ATMTransaction15.TotalAmount;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction19.TotalAuthorisedAmount);
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AmountAndCurrency1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Total requested amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction16
	 * ATMTransaction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlReqdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalRequestedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total requested amount."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction19#TotalRequestedAmount
	 * ATMTransaction19.TotalRequestedAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute TotalRequestedAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTransaction16.mmObject();
			isDerived = false;
			xmlTag = "TtlReqdAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalRequestedAmount";
			definition = "Total requested amount.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction19.TotalRequestedAmount);
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Detail of the requested amounts for the deposit transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DetailedAmount16
	 * DetailedAmount16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#Amount
	 * Payment.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction16
	 * ATMTransaction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtldReqdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DetailedRequestedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Detail of the requested amounts for the deposit transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction19#DetailedRequestedAmount
	 * ATMTransaction19.DetailedRequestedAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction15#DetailedRequestedAmount
	 * ATMTransaction15.DetailedRequestedAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd DetailedRequestedAmount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMTransaction16.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.Amount;
			isDerived = false;
			xmlTag = "DtldReqdAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DetailedRequestedAmount";
			definition = "Detail of the requested amounts for the deposit transaction.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.ATMTransaction15.DetailedRequestedAmount;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction19.DetailedRequestedAmount);
			minOccurs = 0;
			type_lazy = () -> DetailedAmount16.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Additional charge (for instance tax or fee).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DetailedAmount13
	 * DetailedAmount13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction16
	 * ATMTransaction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlChrg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional charge (for instance tax or fee)."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction19#AdditionalCharge
	 * ATMTransaction19.AdditionalCharge}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd AdditionalCharge = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMTransaction16.mmObject();
			isDerived = false;
			xmlTag = "AddtlChrg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalCharge";
			definition = "Additional charge (for instance tax or fee).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction19.AdditionalCharge);
			minOccurs = 0;
			type_lazy = () -> DetailedAmount13.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Outcome of the deposit authorisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AuthorisationResult13
	 * AuthorisationResult13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction16
	 * ATMTransaction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthstnRslt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisationResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Outcome of the deposit authorisation."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction19#AuthorisationResult
	 * ATMTransaction19.AuthorisationResult}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd AuthorisationResult = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMTransaction16.mmObject();
			isDerived = false;
			xmlTag = "AuthstnRslt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationResult";
			definition = "Outcome of the deposit authorisation.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction19.AuthorisationResult);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> AuthorisationResult13.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Sequence of one or more TLV data elements from the ATM application, in
	 * accordance with ISO 7816-6, not in a specific order. Present if the
	 * transaction is performed with an EMV chip card application.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max10000Binary
	 * Max10000Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction16
	 * ATMTransaction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ICCRltdData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ICCRelatedData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sequence of one or more TLV data elements from the ATM application, in accordance with ISO 7816-6, not in a specific order. Present if the transaction is performed with an EMV chip card application."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction19#ICCRelatedData
	 * ATMTransaction19.ICCRelatedData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction15#ICCRelatedData
	 * ATMTransaction15.ICCRelatedData}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute ICCRelatedData = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTransaction16.mmObject();
			isDerived = false;
			xmlTag = "ICCRltdData";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ICCRelatedData";
			definition = "Sequence of one or more TLV data elements from the ATM application, in accordance with ISO 7816-6, not in a specific order. Present if the transaction is performed with an EMV chip card application.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.ATMTransaction15.ICCRelatedData;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction19.ICCRelatedData);
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max10000Binary.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction16
	 * ATMTransaction16}</li>
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
			componentContext_lazy = () -> ATMTransaction16.mmObject();
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
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction16.TransactionIdentification, com.tools20022.repository.msg.ATMTransaction16.ReconciliationIdentification,
						com.tools20022.repository.msg.ATMTransaction16.CompletionRequired, com.tools20022.repository.msg.ATMTransaction16.AccountData, com.tools20022.repository.msg.ATMTransaction16.ProtectedAccountData,
						com.tools20022.repository.msg.ATMTransaction16.TotalAuthorisedAmount, com.tools20022.repository.msg.ATMTransaction16.TotalRequestedAmount, com.tools20022.repository.msg.ATMTransaction16.DetailedRequestedAmount,
						com.tools20022.repository.msg.ATMTransaction16.AdditionalCharge, com.tools20022.repository.msg.ATMTransaction16.AuthorisationResult, com.tools20022.repository.msg.ATMTransaction16.ICCRelatedData,
						com.tools20022.repository.msg.ATMTransaction16.Command);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ATMTransaction16";
				definition = "Response to the deposit request.";
				previousVersion_lazy = () -> ATMTransaction15.mmObject();
				nextVersions_lazy = () -> Arrays.asList(ATMTransaction19.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}