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
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47#Acquirer
 * CardPaymentEnvironment47.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47#Merchant
 * CardPaymentEnvironment47.Merchant}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47#POI
 * CardPaymentEnvironment47.POI}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47#Card
 * CardPaymentEnvironment47.Card}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47#CustomerDevice
 * CardPaymentEnvironment47.CustomerDevice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47#Wallet
 * CardPaymentEnvironment47.Wallet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47#PaymentToken
 * CardPaymentEnvironment47.PaymentToken}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47#Cardholder
 * CardPaymentEnvironment47.Cardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47#ProtectedCardholderData
 * CardPaymentEnvironment47.ProtectedCardholderData}</li>
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
 * "CardPaymentEnvironment47"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Environment of the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment60
 * CardPaymentEnvironment60}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34
 * CardPaymentEnvironment34}</li>
 * </ul>
 */
public class CardPaymentEnvironment47 {

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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47
	 * CardPaymentEnvironment47}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment60#Acquirer
	 * CardPaymentEnvironment60.Acquirer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34#Acquirer
	 * CardPaymentEnvironment34.Acquirer}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Acquirer = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CardPaymentEnvironment47.mmObject();
			businessComponentTrace_lazy = () -> AcquirerRole.mmObject();
			isDerived = false;
			xmlTag = "Acqrr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acquirer";
			definition = "Acquirer involved in the card payment.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment34.Acquirer;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentEnvironment60.Acquirer);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Acquirer4.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Merchant performing the card payment.<br>
	 * Usage: In some cases, merchant and acceptor may be regarded as the same
	 * entity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Organisation25
	 * Organisation25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.MerchantRole MerchantRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47
	 * CardPaymentEnvironment47}</li>
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
	 * "Merchant performing the card payment.\r\nUsage: In some cases, merchant and acceptor may be regarded as the same entity."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment60#Merchant
	 * CardPaymentEnvironment60.Merchant}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34#Merchant
	 * CardPaymentEnvironment34.Merchant}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Merchant = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CardPaymentEnvironment47.mmObject();
			businessComponentTrace_lazy = () -> MerchantRole.mmObject();
			isDerived = false;
			xmlTag = "Mrchnt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Merchant";
			definition = "Merchant performing the card payment.\r\nUsage: In some cases, merchant and acceptor may be regarded as the same entity.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment34.Merchant;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentEnvironment60.Merchant);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Organisation25.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction5
	 * PointOfInteraction5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#PointOfInteraction
	 * CardPaymentAcquiring.PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47
	 * CardPaymentEnvironment47}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment60#POI
	 * CardPaymentEnvironment60.POI}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34#POI
	 * CardPaymentEnvironment34.POI}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute POI = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardPaymentEnvironment47.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.PointOfInteraction;
			isDerived = false;
			xmlTag = "POI";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POI";
			definition = "Point of interaction (POI) performing the transaction.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment34.POI;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentEnvironment60.POI);
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> PointOfInteraction5.mmObject();
		}
	};
	/**
	 * Payment card performing the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.PaymentCard20
	 * PaymentCard20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#PaymentCard
	 * CardPayment.PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47
	 * CardPaymentEnvironment47}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment60#Card
	 * CardPaymentEnvironment60.Card}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34#Card
	 * CardPaymentEnvironment34.Card}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Card = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardPaymentEnvironment47.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CardPayment.PaymentCard;
			isDerived = false;
			xmlTag = "Card";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Card";
			definition = "Payment card performing the transaction.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment34.Card;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentEnvironment60.Card);
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> PaymentCard20.mmObject();
		}
	};
	/**
	 * Device used by the customer to perform the payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CustomerDevice1
	 * CustomerDevice1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47
	 * CardPaymentEnvironment47}</li>
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
	 * definition} = "Device used by the customer to perform the payment."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment60#CustomerDevice
	 * CardPaymentEnvironment60.CustomerDevice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34#CustomerDevice
	 * CardPaymentEnvironment34.CustomerDevice}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd CustomerDevice = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CardPaymentEnvironment47.mmObject();
			isDerived = false;
			xmlTag = "CstmrDvc";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerDevice";
			definition = "Device used by the customer to perform the payment.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment34.CustomerDevice;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentEnvironment60.CustomerDevice);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CustomerDevice1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Container of tenders used by the customer to perform the payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CustomerDevice1
	 * CustomerDevice1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47
	 * CardPaymentEnvironment47}</li>
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
	 * "Container of tenders used by the customer to perform the payment."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment60#Wallet
	 * CardPaymentEnvironment60.Wallet}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34#Wallet
	 * CardPaymentEnvironment34.Wallet}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Wallet = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CardPaymentEnvironment47.mmObject();
			isDerived = false;
			xmlTag = "Wllt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Wallet";
			definition = "Container of tenders used by the customer to perform the payment.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment34.Wallet;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentEnvironment60.Wallet);
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
	 * type} = {@linkplain com.tools20022.repository.msg.CardPaymentToken3
	 * CardPaymentToken3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47
	 * CardPaymentEnvironment47}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment60#PaymentToken
	 * CardPaymentEnvironment60.PaymentToken}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34#PaymentToken
	 * CardPaymentEnvironment34.PaymentToken}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd PaymentToken = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CardPaymentEnvironment47.mmObject();
			isDerived = false;
			xmlTag = "PmtTkn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentToken";
			definition = "Payment token information.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment34.PaymentToken;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentEnvironment60.PaymentToken);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CardPaymentToken3.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Cardholder involved in the card payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Cardholder11
	 * Cardholder11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardholderRole
	 * CardholderRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47
	 * CardPaymentEnvironment47}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment60#Cardholder
	 * CardPaymentEnvironment60.Cardholder}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34#Cardholder
	 * CardPaymentEnvironment34.Cardholder}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Cardholder = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CardPaymentEnvironment47.mmObject();
			businessComponentTrace_lazy = () -> CardholderRole.mmObject();
			isDerived = false;
			xmlTag = "Crdhldr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cardholder";
			definition = "Cardholder involved in the card payment.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment34.Cardholder;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentEnvironment60.Cardholder);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Cardholder11.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47
	 * CardPaymentEnvironment47}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment60#ProtectedCardholderData
	 * CardPaymentEnvironment60.ProtectedCardholderData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34#ProtectedCardholderData
	 * CardPaymentEnvironment34.ProtectedCardholderData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ProtectedCardholderData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CardPaymentEnvironment47.mmObject();
			isDerived = false;
			xmlTag = "PrtctdCrdhldrData";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedCardholderData";
			definition = "Replacement of the message element Cardholder by a digital envelope using a cryptographic key.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment34.ProtectedCardholderData;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentEnvironment60.ProtectedCardholderData);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ContentInformationType10.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentEnvironment47.Acquirer, com.tools20022.repository.msg.CardPaymentEnvironment47.Merchant,
						com.tools20022.repository.msg.CardPaymentEnvironment47.POI, com.tools20022.repository.msg.CardPaymentEnvironment47.Card, com.tools20022.repository.msg.CardPaymentEnvironment47.CustomerDevice,
						com.tools20022.repository.msg.CardPaymentEnvironment47.Wallet, com.tools20022.repository.msg.CardPaymentEnvironment47.PaymentToken, com.tools20022.repository.msg.CardPaymentEnvironment47.Cardholder,
						com.tools20022.repository.msg.CardPaymentEnvironment47.ProtectedCardholderData);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CardPaymentEnvironment47";
				definition = "Environment of the transaction.";
				previousVersion_lazy = () -> CardPaymentEnvironment34.mmObject();
				nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment60.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}