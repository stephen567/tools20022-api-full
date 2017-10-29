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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.CashClearingSystemMember;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Choice of identifiers for a clearing system member, as assigned by the
 * clearing system. In some clearing systems, the accounts of the clearing
 * system members are also assigned an identifier.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#CHIPSUniversalIdentification
 * ClearingSystemMemberIdentificationChoice.CHIPSUniversalIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#NewZealandNCCIdentification
 * ClearingSystemMemberIdentificationChoice.NewZealandNCCIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#IrishNSCIdentification
 * ClearingSystemMemberIdentificationChoice.IrishNSCIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#UKDomesticSortCode
 * ClearingSystemMemberIdentificationChoice.UKDomesticSortCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#CHIPSParticipantIdentification
 * ClearingSystemMemberIdentificationChoice.CHIPSParticipantIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#SwissBCIdentification
 * ClearingSystemMemberIdentificationChoice.SwissBCIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#FedwireRoutingNumberIdentification
 * ClearingSystemMemberIdentificationChoice.FedwireRoutingNumberIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#PortugueseNCCIdentification
 * ClearingSystemMemberIdentificationChoice.PortugueseNCCIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#RussianCentralBankIdentificationCode
 * ClearingSystemMemberIdentificationChoice.RussianCentralBankIdentificationCode
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#ItalianDomesticIdentificationCode
 * ClearingSystemMemberIdentificationChoice.ItalianDomesticIdentificationCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#AustrianBankleitzahlIdentification
 * ClearingSystemMemberIdentificationChoice.AustrianBankleitzahlIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#CanadianPaymentsAssociationRoutingNumberIdentification
 * ClearingSystemMemberIdentificationChoice.
 * CanadianPaymentsAssociationRoutingNumberIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#SwissSICIdentification
 * ClearingSystemMemberIdentificationChoice.SwissSICIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#GermanBankleitzahlIdentification
 * ClearingSystemMemberIdentificationChoice.GermanBankleitzahlIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#SpanishDomesticInterbankingIdentification
 * ClearingSystemMemberIdentificationChoice.
 * SpanishDomesticInterbankingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#SouthAfricanNCCIdentification
 * ClearingSystemMemberIdentificationChoice.SouthAfricanNCCIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#HongKongBankCode
 * ClearingSystemMemberIdentificationChoice.HongKongBankCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#AustralianExtensiveBranchNetworkIdentification
 * ClearingSystemMemberIdentificationChoice.
 * AustralianExtensiveBranchNetworkIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice#AustralianSmallNetworkIdentification
 * ClearingSystemMemberIdentificationChoice.AustralianSmallNetworkIdentification
 * }</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
 * CashClearingSystemMember}</li>
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
 * "ClearingSystemMemberIdentificationChoice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice of identifiers for a clearing system member, as assigned by the clearing system. In some clearing systems, the accounts of the clearing system members are also assigned an identifier."
 * </li>
 * </ul>
 */
public class ClearingSystemMemberIdentificationChoice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * (United States) Clearing House Interbank Payments System (CHIPS)
	 * Universal Identification (UID) - identifies entities that own accounts at
	 * CHIPS participating financial institutions, through which CHIPS payments
	 * are effected. The CHIPS UID is assigned by the New York Clearing House.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CHIPSUniversalIdentifier
	 * CHIPSUniversalIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#CHIPSUniversalIdentification
	 * CashClearingSystemMember.CHIPSUniversalIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice
	 * ClearingSystemMemberIdentificationChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "USCHU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CHIPSUniversalIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "(United States) Clearing House Interbank Payments System (CHIPS) Universal Identification (UID) - identifies entities that own accounts at CHIPS participating financial institutions, through which CHIPS payments are effected. The CHIPS UID is assigned by the New York Clearing House."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute CHIPSUniversalIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ClearingSystemMemberIdentificationChoice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.CHIPSUniversalIdentification;
			isDerived = false;
			xmlTag = "USCHU";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CHIPSUniversalIdentification";
			definition = "(United States) Clearing House Interbank Payments System (CHIPS) Universal Identification (UID) - identifies entities that own accounts at CHIPS participating financial institutions, through which CHIPS payments are effected. The CHIPS UID is assigned by the New York Clearing House.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CHIPSUniversalIdentifier.mmObject();
		}
	};
	/**
	 * New Zealand Bank/Branch Code - identifies New Zealand institutions on the
	 * New Zealand national clearing system. The code is assigned by the New
	 * Zealand Bankers' Association (NZBA).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.NewZealandNCCIdentifier
	 * NewZealandNCCIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#NewZealandNCC
	 * CashClearingSystemMember.NewZealandNCC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice
	 * ClearingSystemMemberIdentificationChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NZNCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewZealandNCCIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "New Zealand Bank/Branch Code - identifies New Zealand institutions on the New Zealand national clearing system. The code is assigned by the New Zealand Bankers' Association (NZBA)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute NewZealandNCCIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ClearingSystemMemberIdentificationChoice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.NewZealandNCC;
			isDerived = false;
			xmlTag = "NZNCC";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewZealandNCCIdentification";
			definition = "New Zealand Bank/Branch Code - identifies New Zealand institutions on the New Zealand national clearing system. The code is assigned by the New Zealand Bankers' Association (NZBA).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> NewZealandNCCIdentifier.mmObject();
		}
	};
	/**
	 * Irish National Sorting Code - identifies Irish financial institutions on
	 * the Irish national clearing system. The code is assigned by the Irish
	 * Payments Services Organisation (IPSO).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.IrishNSCIdentifier
	 * IrishNSCIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#IrishNSC
	 * CashClearingSystemMember.IrishNSC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice
	 * ClearingSystemMemberIdentificationChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IENSC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IrishNSCIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Irish National Sorting Code - identifies Irish financial institutions on the Irish national clearing system. The code is assigned by the Irish Payments Services Organisation (IPSO)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute IrishNSCIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ClearingSystemMemberIdentificationChoice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.IrishNSC;
			isDerived = false;
			xmlTag = "IENSC";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IrishNSCIdentification";
			definition = "Irish National Sorting Code - identifies Irish financial institutions on the Irish national clearing system. The code is assigned by the Irish Payments Services Organisation (IPSO).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> IrishNSCIdentifier.mmObject();
		}
	};
	/**
	 * United Kingdom (UK) Sort Code - identifies British financial institutions
	 * on the British national clearing systems. The sort code is assigned by
	 * the Association for Payments and Clearing Services (APACS).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.UKDomesticSortCodeIdentifier
	 * UKDomesticSortCodeIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#UKSortCode
	 * CashClearingSystemMember.UKSortCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice
	 * ClearingSystemMemberIdentificationChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GBSC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UKDomesticSortCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "United Kingdom (UK) Sort Code - identifies British financial institutions on the British national clearing systems. The sort code is assigned by the Association for Payments and Clearing Services (APACS)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute UKDomesticSortCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ClearingSystemMemberIdentificationChoice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.UKSortCode;
			isDerived = false;
			xmlTag = "GBSC";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UKDomesticSortCode";
			definition = "United Kingdom (UK) Sort Code - identifies British financial institutions on the British national clearing systems. The sort code is assigned by the Association for Payments and Clearing Services (APACS).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> UKDomesticSortCodeIdentifier.mmObject();
		}
	};
	/**
	 * (United States) Clearing House Interbank Payment System (CHIPS)
	 * Participant Identifier (ID) - identifies financial institutions
	 * participating on CHIPS. The CHIPS Participant ID is assigned by the New
	 * York Clearing House.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CHIPSParticipantIdentifier
	 * CHIPSParticipantIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#CHIPSParticipantIdentification
	 * CashClearingSystemMember.CHIPSParticipantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice
	 * ClearingSystemMemberIdentificationChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "USCH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CHIPSParticipantIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "(United States) Clearing House Interbank Payment System (CHIPS) Participant Identifier (ID) - identifies financial institutions participating on CHIPS. The CHIPS Participant ID is assigned by the New York Clearing House."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute CHIPSParticipantIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ClearingSystemMemberIdentificationChoice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.CHIPSParticipantIdentification;
			isDerived = false;
			xmlTag = "USCH";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CHIPSParticipantIdentification";
			definition = "(United States) Clearing House Interbank Payment System (CHIPS) Participant Identifier (ID) - identifies financial institutions participating on CHIPS. The CHIPS Participant ID is assigned by the New York Clearing House.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CHIPSParticipantIdentifier.mmObject();
		}
	};
	/**
	 * Swiss Bank Code - identifies Swiss institutions on the Swiss national
	 * clearing system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.SwissBCIdentifier
	 * SwissBCIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#SwissBC
	 * CashClearingSystemMember.SwissBC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice
	 * ClearingSystemMemberIdentificationChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CHBC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwissBCIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Swiss Bank Code - identifies Swiss institutions on the Swiss national clearing system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute SwissBCIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ClearingSystemMemberIdentificationChoice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.SwissBC;
			isDerived = false;
			xmlTag = "CHBC";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwissBCIdentification";
			definition = "Swiss Bank Code - identifies Swiss institutions on the Swiss national clearing system.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SwissBCIdentifier.mmObject();
		}
	};
	/**
	 * Fedwire Routing Number - identifies financial institutions, in the US, on
	 * the FedWire system. The routing number is assigned by the American
	 * Bankers Association (ABA).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.FedwireRoutingNumberIdentifier
	 * FedwireRoutingNumberIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#FedwireRoutingNumber
	 * CashClearingSystemMember.FedwireRoutingNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice
	 * ClearingSystemMemberIdentificationChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "USFW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FedwireRoutingNumberIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fedwire Routing Number - identifies financial institutions, in the US, on the FedWire system. The routing number is assigned by the American Bankers Association (ABA)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute FedwireRoutingNumberIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ClearingSystemMemberIdentificationChoice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.FedwireRoutingNumber;
			isDerived = false;
			xmlTag = "USFW";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FedwireRoutingNumberIdentification";
			definition = "Fedwire Routing Number - identifies financial institutions, in the US, on the FedWire system. The routing number is assigned by the American Bankers Association (ABA).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FedwireRoutingNumberIdentifier.mmObject();
		}
	};
	/**
	 * Portuguese National Clearing Code - identifies Portuguese financial
	 * institutions on the Portuguese national clearing system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PortugueseNCCIdentifier
	 * PortugueseNCCIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#PortugueseNCC
	 * CashClearingSystemMember.PortugueseNCC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice
	 * ClearingSystemMemberIdentificationChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PTNCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PortugueseNCCIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Portuguese National Clearing Code - identifies Portuguese financial institutions on the Portuguese national clearing system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute PortugueseNCCIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ClearingSystemMemberIdentificationChoice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.PortugueseNCC;
			isDerived = false;
			xmlTag = "PTNCC";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortugueseNCCIdentification";
			definition = "Portuguese National Clearing Code - identifies Portuguese financial institutions on the Portuguese national clearing system.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PortugueseNCCIdentifier.mmObject();
		}
	};
	/**
	 * Russian Central Bank Identification Code - identifies Russian financial
	 * institutions on the Russian national clearing system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RussianCentralBankIdentificationCodeIdentifier
	 * RussianCentralBankIdentificationCodeIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#RussianCentralBankIdentificationCode
	 * CashClearingSystemMember.RussianCentralBankIdentificationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice
	 * ClearingSystemMemberIdentificationChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RUCB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RussianCentralBankIdentificationCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Russian Central Bank Identification Code - identifies Russian financial institutions on the Russian national clearing system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute RussianCentralBankIdentificationCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ClearingSystemMemberIdentificationChoice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.RussianCentralBankIdentificationCode;
			isDerived = false;
			xmlTag = "RUCB";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RussianCentralBankIdentificationCode";
			definition = "Russian Central Bank Identification Code - identifies Russian financial institutions on the Russian national clearing system.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> RussianCentralBankIdentificationCodeIdentifier.mmObject();
		}
	};
	/**
	 * Italian Domestic Identification Code - identifies Italian financial
	 * institutions on the Italian national clearing system. The code is
	 * assigned by the Associazione Bancaria Italiana (ABI).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ItalianDomesticIdentifier
	 * ItalianDomesticIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#ItalianDomesticIdentificationCode
	 * CashClearingSystemMember.ItalianDomesticIdentificationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice
	 * ClearingSystemMemberIdentificationChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ITNCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ItalianDomesticIdentificationCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Italian Domestic Identification Code - identifies Italian financial institutions on the Italian national clearing system. The code is assigned by the Associazione Bancaria Italiana (ABI)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute ItalianDomesticIdentificationCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ClearingSystemMemberIdentificationChoice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.ItalianDomesticIdentificationCode;
			isDerived = false;
			xmlTag = "ITNCC";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ItalianDomesticIdentificationCode";
			definition = "Italian Domestic Identification Code - identifies Italian financial institutions on the Italian national clearing system. The code is assigned by the Associazione Bancaria Italiana (ABI).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ItalianDomesticIdentifier.mmObject();
		}
	};
	/**
	 * Austrian Bankleitzahl - identifies Austrian financial institutions on the
	 * Austrian national clearing system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.AustrianBankleitzahlIdentifier
	 * AustrianBankleitzahlIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#AustrianBankleitzahl
	 * CashClearingSystemMember.AustrianBankleitzahl}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice
	 * ClearingSystemMemberIdentificationChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATBLZ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AustrianBankleitzahlIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Austrian Bankleitzahl - identifies Austrian financial institutions on the Austrian national clearing system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute AustrianBankleitzahlIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ClearingSystemMemberIdentificationChoice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.AustrianBankleitzahl;
			isDerived = false;
			xmlTag = "ATBLZ";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AustrianBankleitzahlIdentification";
			definition = "Austrian Bankleitzahl - identifies Austrian financial institutions on the Austrian national clearing system.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AustrianBankleitzahlIdentifier.mmObject();
		}
	};
	/**
	 * Canadian Payments Association Routing Number - identifies Canadian
	 * financial institutions on the Canadian national clearing system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CanadianPaymentsARNIdentifier
	 * CanadianPaymentsARNIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#CanadianPaymentsAssociationRoutingNumber
	 * CashClearingSystemMember.CanadianPaymentsAssociationRoutingNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice
	 * ClearingSystemMemberIdentificationChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CACPA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CanadianPaymentsAssociationRoutingNumberIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Canadian Payments Association Routing Number - identifies Canadian financial institutions on the Canadian national clearing system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute CanadianPaymentsAssociationRoutingNumberIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ClearingSystemMemberIdentificationChoice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.CanadianPaymentsAssociationRoutingNumber;
			isDerived = false;
			xmlTag = "CACPA";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CanadianPaymentsAssociationRoutingNumberIdentification";
			definition = "Canadian Payments Association Routing Number - identifies Canadian financial institutions on the Canadian national clearing system.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CanadianPaymentsARNIdentifier.mmObject();
		}
	};
	/**
	 * Swiss Interbank Clearing (SIC) Code - identifies Swiss financial
	 * institutions domestically, on the Swiss national clearing system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.SwissSICIdentifier
	 * SwissSICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#SwissSIC
	 * CashClearingSystemMember.SwissSIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice
	 * ClearingSystemMemberIdentificationChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CHSIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwissSICIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Swiss Interbank Clearing (SIC) Code - identifies Swiss financial institutions domestically, on the Swiss national clearing system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute SwissSICIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ClearingSystemMemberIdentificationChoice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.SwissSIC;
			isDerived = false;
			xmlTag = "CHSIC";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwissSICIdentification";
			definition = "Swiss Interbank Clearing (SIC) Code - identifies Swiss financial institutions domestically, on the Swiss national clearing system.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SwissSICIdentifier.mmObject();
		}
	};
	/**
	 * German Bankleitzahl - identifies German financial institutions on the
	 * German national clearing systems.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.GermanBankleitzahlIdentifier
	 * GermanBankleitzahlIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#GermanBankleitzahl
	 * CashClearingSystemMember.GermanBankleitzahl}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice
	 * ClearingSystemMemberIdentificationChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DEBLZ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GermanBankleitzahlIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "German Bankleitzahl - identifies German financial institutions on the German national clearing systems."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute GermanBankleitzahlIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ClearingSystemMemberIdentificationChoice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.GermanBankleitzahl;
			isDerived = false;
			xmlTag = "DEBLZ";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GermanBankleitzahlIdentification";
			definition = "German Bankleitzahl - identifies German financial institutions on the German national clearing systems.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> GermanBankleitzahlIdentifier.mmObject();
		}
	};
	/**
	 * Spanish Domestic Interbanking Code - identifies Spanish financial
	 * institutions on the Spanish national clearing system. The code is
	 * assigned by the Centro de Cooperacion Interbancaria (CCI).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.SpanishDomesticInterbankingIdentifier
	 * SpanishDomesticInterbankingIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#SpanishDomesticInterbankingCode
	 * CashClearingSystemMember.SpanishDomesticInterbankingCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice
	 * ClearingSystemMemberIdentificationChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ESNCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpanishDomesticInterbankingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Spanish Domestic Interbanking Code - identifies Spanish financial institutions on the Spanish national clearing system. The code is assigned by the Centro de Cooperacion Interbancaria (CCI)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute SpanishDomesticInterbankingIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ClearingSystemMemberIdentificationChoice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.SpanishDomesticInterbankingCode;
			isDerived = false;
			xmlTag = "ESNCC";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpanishDomesticInterbankingIdentification";
			definition = "Spanish Domestic Interbanking Code - identifies Spanish financial institutions on the Spanish national clearing system. The code is assigned by the Centro de Cooperacion Interbancaria (CCI).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SpanishDomesticInterbankingIdentifier.mmObject();
		}
	};
	/**
	 * South African National Clearing Code (NCC) - identifies South African
	 * financial institutions on the South African national clearing system. The
	 * code is assigned by the South African Bankers Services Company Ltd.
	 * (BankServ).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.SouthAfricanNCCIdentifier
	 * SouthAfricanNCCIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#SouthAfricanNCC
	 * CashClearingSystemMember.SouthAfricanNCC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice
	 * ClearingSystemMemberIdentificationChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ZANCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SouthAfricanNCCIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "South African National Clearing Code (NCC) - identifies South African financial institutions on the South African national clearing system. The code is assigned by the South African Bankers Services Company Ltd. (BankServ)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute SouthAfricanNCCIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ClearingSystemMemberIdentificationChoice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.SouthAfricanNCC;
			isDerived = false;
			xmlTag = "ZANCC";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SouthAfricanNCCIdentification";
			definition = "South African National Clearing Code (NCC) - identifies South African financial institutions on the South African national clearing system. The code is assigned by the South African Bankers Services Company Ltd. (BankServ).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SouthAfricanNCCIdentifier.mmObject();
		}
	};
	/**
	 * Hong Kong Bank Code - identifies Hong Kong financial institutions on the
	 * Hong Kong local clearing system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.HongKongBankIdentifier
	 * HongKongBankIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#HongKongBankCode
	 * CashClearingSystemMember.HongKongBankCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice
	 * ClearingSystemMemberIdentificationChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HKNCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HongKongBankCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Hong Kong Bank Code - identifies Hong Kong financial institutions on the Hong Kong local clearing system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute HongKongBankCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ClearingSystemMemberIdentificationChoice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.HongKongBankCode;
			isDerived = false;
			xmlTag = "HKNCC";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HongKongBankCode";
			definition = "Hong Kong Bank Code - identifies Hong Kong financial institutions on the Hong Kong local clearing system.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> HongKongBankIdentifier.mmObject();
		}
	};
	/**
	 * Extensive branch network list of the Australian Bank State Branch (BSB)
	 * Code. The codes are used for identifying Australian financial
	 * institutions, as assigned by the Australian Payments Clearing Association
	 * (APCA).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ExtensiveBranchNetworkIdentifier
	 * ExtensiveBranchNetworkIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AustralianBSBIdentification#ExtensiveBranchNetworkIdentification
	 * AustralianBSBIdentification.ExtensiveBranchNetworkIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice
	 * ClearingSystemMemberIdentificationChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AUBSBx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AustralianExtensiveBranchNetworkIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Extensive branch network list of the Australian Bank State Branch (BSB) Code. The codes are used for identifying Australian financial institutions, as assigned by the Australian Payments Clearing Association (APCA)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute AustralianExtensiveBranchNetworkIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ClearingSystemMemberIdentificationChoice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AustralianBSBIdentification.ExtensiveBranchNetworkIdentification;
			isDerived = false;
			xmlTag = "AUBSBx";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AustralianExtensiveBranchNetworkIdentification";
			definition = "Extensive branch network list of the Australian Bank State Branch (BSB) Code. The codes are used for identifying Australian financial institutions, as assigned by the Australian Payments Clearing Association (APCA).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ExtensiveBranchNetworkIdentifier.mmObject();
		}
	};
	/**
	 * Small network list of the Australian Bank State Branch (BSB) Code. The
	 * codes are used for identifying Australian financial institutions , as
	 * assigned by the Australian Payments Clearing Association (APCA).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.SmallNetworkIdentifier
	 * SmallNetworkIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AustralianBSBIdentification#SmallNetworkIdentification
	 * AustralianBSBIdentification.SmallNetworkIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice
	 * ClearingSystemMemberIdentificationChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AUBSBs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AustralianSmallNetworkIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Small network list of the Australian Bank State Branch (BSB) Code. The codes are used for identifying Australian financial institutions , as assigned by the Australian Payments Clearing Association (APCA)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute AustralianSmallNetworkIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ClearingSystemMemberIdentificationChoice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AustralianBSBIdentification.SmallNetworkIdentification;
			isDerived = false;
			xmlTag = "AUBSBs";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AustralianSmallNetworkIdentification";
			definition = "Small network list of the Australian Bank State Branch (BSB) Code. The codes are used for identifying Australian financial institutions , as assigned by the Australian Payments Clearing Association (APCA).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SmallNetworkIdentifier.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice.CHIPSUniversalIdentification,
						com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice.NewZealandNCCIdentification, com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice.IrishNSCIdentification,
						com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice.UKDomesticSortCode, com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice.CHIPSParticipantIdentification,
						com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice.SwissBCIdentification, com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice.FedwireRoutingNumberIdentification,
						com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice.PortugueseNCCIdentification, com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice.RussianCentralBankIdentificationCode,
						com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice.ItalianDomesticIdentificationCode,
						com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice.AustrianBankleitzahlIdentification,
						com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice.CanadianPaymentsAssociationRoutingNumberIdentification,
						com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice.SwissSICIdentification, com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice.GermanBankleitzahlIdentification,
						com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice.SpanishDomesticInterbankingIdentification,
						com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice.SouthAfricanNCCIdentification, com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice.HongKongBankCode,
						com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice.AustralianExtensiveBranchNetworkIdentification,
						com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice.AustralianSmallNetworkIdentification);
				trace_lazy = () -> CashClearingSystemMember.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ClearingSystemMemberIdentificationChoice";
				definition = "Choice of identifiers for a clearing system member, as assigned by the clearing system. In some clearing systems, the accounts of the clearing system members are also assigned an identifier.";
			}
		});
		return mmObject_lazy.get();
	}
}