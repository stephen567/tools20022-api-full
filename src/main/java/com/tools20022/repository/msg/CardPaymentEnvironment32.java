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
import com.tools20022.repository.entity.AcquirerRole;
import com.tools20022.repository.entity.CardholderRole;
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.entity.MerchantRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Environment of the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment32#Acquirer
 * CardPaymentEnvironment32.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment32#Merchant
 * CardPaymentEnvironment32.Merchant}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment32#POI
 * CardPaymentEnvironment32.POI}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment32#Card
 * CardPaymentEnvironment32.Card}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment32#CustomerDevice
 * CardPaymentEnvironment32.CustomerDevice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment32#Wallet
 * CardPaymentEnvironment32.Wallet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment32#PaymentToken
 * CardPaymentEnvironment32.PaymentToken}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment32#Cardholder
 * CardPaymentEnvironment32.Cardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment32#ProtectedCardholderData
 * CardPaymentEnvironment32.ProtectedCardholderData}</li>
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
 * "CardPaymentEnvironment32"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Environment of the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment53
 * CardPaymentEnvironment53}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment45
 * CardPaymentEnvironment45}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment20
 * CardPaymentEnvironment20}</li>
 * </ul>
 */
public class CardPaymentEnvironment32 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Acquirer involved in the card payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Acquirer4 Acquirer4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcquirerRole AcquirerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment32
	 * CardPaymentEnvironment32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Acqrr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Acquirer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Acquirer involved in the card payment."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment53#Acquirer
	 * CardPaymentEnvironment53.Acquirer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment45#Acquirer
	 * CardPaymentEnvironment45.Acquirer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment20#Acquirer
	 * CardPaymentEnvironment20.Acquirer}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Acquirer = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CardPaymentEnvironment32.mmObject();
			businessComponentTrace_lazy = () -> AcquirerRole.mmObject();
			isDerived = false;
			xmlTag = "Acqrr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acquirer";
			definition = "Acquirer involved in the card payment.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment20.Acquirer;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentEnvironment53.Acquirer, com.tools20022.repository.msg.CardPaymentEnvironment45.Acquirer);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Acquirer4.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Merchant performing the card payment transaction.<br>
	 * Usage: In some cases, merchant and acceptor may be regarded as the same
	 * entity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Organisation8
	 * Organisation8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.MerchantRole MerchantRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment32
	 * CardPaymentEnvironment32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mrchnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Merchant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Merchant performing the card payment transaction.\r\nUsage: In some cases, merchant and acceptor may be regarded as the same entity."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment53#Merchant
	 * CardPaymentEnvironment53.Merchant}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment45#Merchant
	 * CardPaymentEnvironment45.Merchant}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment20#Merchant
	 * CardPaymentEnvironment20.Merchant}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Merchant = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CardPaymentEnvironment32.mmObject();
			businessComponentTrace_lazy = () -> MerchantRole.mmObject();
			isDerived = false;
			xmlTag = "Mrchnt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Merchant";
			definition = "Merchant performing the card payment transaction.\r\nUsage: In some cases, merchant and acceptor may be regarded as the same entity.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment20.Merchant;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentEnvironment53.Merchant, com.tools20022.repository.msg.CardPaymentEnvironment45.Merchant);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Organisation8.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Point of interaction (POI) performing the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction4
	 * PointOfInteraction4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#PointOfInteraction
	 * CardPaymentAcquiring.PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment32
	 * CardPaymentEnvironment32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "POI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "POI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Point of interaction (POI) performing the transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment53#POI
	 * CardPaymentEnvironment53.POI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment45#POI
	 * CardPaymentEnvironment45.POI}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment20#POI
	 * CardPaymentEnvironment20.POI}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute POI = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardPaymentEnvironment32.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.PointOfInteraction;
			isDerived = false;
			xmlTag = "POI";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POI";
			definition = "Point of interaction (POI) performing the transaction.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment20.POI;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentEnvironment53.POI, com.tools20022.repository.msg.CardPaymentEnvironment45.POI);
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> PointOfInteraction4.mmObject();
		}
	};
	/**
	 * Payment card performing the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.PaymentCard9
	 * PaymentCard9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#PaymentCard
	 * CardPayment.PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment32
	 * CardPaymentEnvironment32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Card"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Card"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment card performing the transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment53#Card
	 * CardPaymentEnvironment53.Card}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment45#Card
	 * CardPaymentEnvironment45.Card}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment20#Card
	 * CardPaymentEnvironment20.Card}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Card = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardPaymentEnvironment32.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CardPayment.PaymentCard;
			isDerived = false;
			xmlTag = "Card";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Card";
			definition = "Payment card performing the transaction.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment20.Card;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentEnvironment53.Card, com.tools20022.repository.msg.CardPaymentEnvironment45.Card);
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> PaymentCard9.mmObject();
		}
	};
	/**
	 * Device used by the customer to perform the payment transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CustomerDevice1
	 * CustomerDevice1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment32
	 * CardPaymentEnvironment32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CstmrDvc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerDevice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Device used by the customer to perform the payment transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment53#CustomerDevice
	 * CardPaymentEnvironment53.CustomerDevice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment45#CustomerDevice
	 * CardPaymentEnvironment45.CustomerDevice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd CustomerDevice = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CardPaymentEnvironment32.mmObject();
			isDerived = false;
			xmlTag = "CstmrDvc";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerDevice";
			definition = "Device used by the customer to perform the payment transaction.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentEnvironment53.CustomerDevice, com.tools20022.repository.msg.CardPaymentEnvironment45.CustomerDevice);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CustomerDevice1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Container for tenders used by the customer to perform the payment
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CustomerDevice1
	 * CustomerDevice1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment32
	 * CardPaymentEnvironment32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Wllt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Wallet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Container for tenders used by the customer to perform the payment transaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment53#Wallet
	 * CardPaymentEnvironment53.Wallet}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment45#Wallet
	 * CardPaymentEnvironment45.Wallet}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Wallet = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CardPaymentEnvironment32.mmObject();
			isDerived = false;
			xmlTag = "Wllt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Wallet";
			definition = "Container for tenders used by the customer to perform the payment transaction.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentEnvironment53.Wallet, com.tools20022.repository.msg.CardPaymentEnvironment45.Wallet);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CustomerDevice1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Payment token information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CardPaymentToken1
	 * CardPaymentToken1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment32
	 * CardPaymentEnvironment32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtTkn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentToken"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment token information."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment53#PaymentToken
	 * CardPaymentEnvironment53.PaymentToken}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment45#PaymentToken
	 * CardPaymentEnvironment45.PaymentToken}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd PaymentToken = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CardPaymentEnvironment32.mmObject();
			isDerived = false;
			xmlTag = "PmtTkn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentToken";
			definition = "Payment token information.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentEnvironment53.PaymentToken, com.tools20022.repository.msg.CardPaymentEnvironment45.PaymentToken);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CardPaymentToken1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Cardholder involved in the card payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Cardholder7
	 * Cardholder7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardholderRole
	 * CardholderRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment32
	 * CardPaymentEnvironment32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Crdhldr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cardholder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cardholder involved in the card payment."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment53#Cardholder
	 * CardPaymentEnvironment53.Cardholder}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment45#Cardholder
	 * CardPaymentEnvironment45.Cardholder}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment20#Cardholder
	 * CardPaymentEnvironment20.Cardholder}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Cardholder = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CardPaymentEnvironment32.mmObject();
			businessComponentTrace_lazy = () -> CardholderRole.mmObject();
			isDerived = false;
			xmlTag = "Crdhldr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cardholder";
			definition = "Cardholder involved in the card payment.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment20.Cardholder;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentEnvironment53.Cardholder, com.tools20022.repository.msg.CardPaymentEnvironment45.Cardholder);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Cardholder7.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Replacement of the message element Cardholder by a digital envelope using
	 * a cryptographic key.
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment32
	 * CardPaymentEnvironment32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctdCrdhldrData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectedCardholderData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Replacement of the message element Cardholder by a digital envelope using a cryptographic key."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment53#ProtectedCardholderData
	 * CardPaymentEnvironment53.ProtectedCardholderData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment45#ProtectedCardholderData
	 * CardPaymentEnvironment45.ProtectedCardholderData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment20#ProtectedCardholderData
	 * CardPaymentEnvironment20.ProtectedCardholderData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ProtectedCardholderData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CardPaymentEnvironment32.mmObject();
			isDerived = false;
			xmlTag = "PrtctdCrdhldrData";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedCardholderData";
			definition = "Replacement of the message element Cardholder by a digital envelope using a cryptographic key.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment20.ProtectedCardholderData;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentEnvironment53.ProtectedCardholderData, com.tools20022.repository.msg.CardPaymentEnvironment45.ProtectedCardholderData);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ContentInformationType10.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentEnvironment32.Acquirer, com.tools20022.repository.msg.CardPaymentEnvironment32.Merchant,
						com.tools20022.repository.msg.CardPaymentEnvironment32.POI, com.tools20022.repository.msg.CardPaymentEnvironment32.Card, com.tools20022.repository.msg.CardPaymentEnvironment32.CustomerDevice,
						com.tools20022.repository.msg.CardPaymentEnvironment32.Wallet, com.tools20022.repository.msg.CardPaymentEnvironment32.PaymentToken, com.tools20022.repository.msg.CardPaymentEnvironment32.Cardholder,
						com.tools20022.repository.msg.CardPaymentEnvironment32.ProtectedCardholderData);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CardPaymentEnvironment32";
				definition = "Environment of the transaction.";
				previousVersion_lazy = () -> CardPaymentEnvironment20.mmObject();
				nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment53.mmObject(), CardPaymentEnvironment45.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}