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
import com.tools20022.repository.codeset.AssetClass1Code;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.codeset.DTCAssetType2Code;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max50Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides additional information regarding underlying security details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD14#PlaceAndName
 * FinancialInstrumentAttributesSD14.PlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD14#IncomeSourceCountry
 * FinancialInstrumentAttributesSD14.IncomeSourceCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD14#DTCAssetClass
 * FinancialInstrumentAttributesSD14.DTCAssetClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD14#DTCAssetType
 * FinancialInstrumentAttributesSD14.DTCAssetType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD14#SecurityEligibilityIndicator
 * FinancialInstrumentAttributesSD14.SecurityEligibilityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD14#TickerSymbol
 * FinancialInstrumentAttributesSD14.TickerSymbol}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD14#LinkedSecurity
 * FinancialInstrumentAttributesSD14.LinkedSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD14#OriginatingSecurityIdentification
 * FinancialInstrumentAttributesSD14.OriginatingSecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD14#DIVANNSecurityDescription
 * FinancialInstrumentAttributesSD14.DIVANNSecurityDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD14#ForeignIssueFlag
 * FinancialInstrumentAttributesSD14.ForeignIssueFlag}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialInstrumentAttributesSD14"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding underlying security details."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD12
 * FinancialInstrumentAttributesSD12}</li>
 * </ul>
 */
public class FinancialInstrumentAttributesSD14 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * xPath to the element that is being extended.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD14
	 * FinancialInstrumentAttributesSD14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "xPath to the element that is being extended."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD12#PlaceAndName
	 * FinancialInstrumentAttributesSD12.PlaceAndName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute PlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributesSD14.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD12.PlaceAndName;
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Country of source income for the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD14
	 * FinancialInstrumentAttributesSD14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IncmSrcCtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomeSourceCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country of source income for the security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD12#IncomeSourceCountry
	 * FinancialInstrumentAttributesSD12.IncomeSourceCountry}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute IncomeSourceCountry = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributesSD14.mmObject();
			isDerived = false;
			xmlTag = "IncmSrcCtry";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeSourceCountry";
			definition = "Country of source income for the security.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD12.IncomeSourceCountry;
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	/**
	 * Classification of instruments into asset classes at DTC (The Depository
	 * Trust Corporation).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClass1Code
	 * AssetClass1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD14
	 * FinancialInstrumentAttributesSD14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCAsstClss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCAssetClass"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Classification of instruments into asset classes at DTC (The Depository Trust Corporation)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD12#DTCAssetClass
	 * FinancialInstrumentAttributesSD12.DTCAssetClass}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute DTCAssetClass = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributesSD14.mmObject();
			isDerived = false;
			xmlTag = "DTCAsstClss";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCAssetClass";
			definition = "Classification of instruments into asset classes at DTC (The Depository Trust Corporation).";
			previousVersion_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD12.DTCAssetClass;
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> AssetClass1Code.mmObject();
		}
	};
	/**
	 * Further classification of instruments into (issue) asset types at DTC
	 * (The Depository Trust Corporation).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD14
	 * FinancialInstrumentAttributesSD14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCAsstTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCAssetType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further classification of instruments into (issue) asset types at DTC (The Depository Trust Corporation)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD12#DTCAssetType
	 * FinancialInstrumentAttributesSD12.DTCAssetType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute DTCAssetType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributesSD14.mmObject();
			isDerived = false;
			xmlTag = "DTCAsstTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCAssetType";
			definition = "Further classification of instruments into (issue) asset types at DTC (The Depository Trust Corporation).";
			previousVersion_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD12.DTCAssetType;
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> DTCAssetType2Code.mmObject();
		}
	};
	/**
	 * Indicates whether the security is eligible for holding at DTC.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD14
	 * FinancialInstrumentAttributesSD14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyElgbltyInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityEligibilityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the security is eligible for holding at DTC."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD12#SecurityEligibilityIndicator
	 * FinancialInstrumentAttributesSD12.SecurityEligibilityIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute SecurityEligibilityIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributesSD14.mmObject();
			isDerived = false;
			xmlTag = "SctyElgbltyInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityEligibilityIndicator";
			definition = "Indicates whether the security is eligible for holding at DTC.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD12.SecurityEligibilityIndicator;
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Ticket symbol for the event security (underlying security).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD14
	 * FinancialInstrumentAttributesSD14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TckrSymb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TickerSymbol"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ticket symbol for the event security (underlying security). "</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD12#TickerSymbol
	 * FinancialInstrumentAttributesSD12.TickerSymbol}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute TickerSymbol = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributesSD14.mmObject();
			isDerived = false;
			xmlTag = "TckrSymb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TickerSymbol";
			definition = "Ticket symbol for the event security (underlying security). ";
			previousVersion_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD12.TickerSymbol;
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Security whose characteristics mirror the event security for purposes of
	 * FCP eligibility and tax relief. Certain derivative securities like HOLDR
	 * may have certain events where the source of payments are from an
	 * underlying security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification15
	 * SecurityIdentification15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD14
	 * FinancialInstrumentAttributesSD14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LkdScty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkedSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security whose characteristics mirror the event security for purposes of FCP eligibility and tax relief. Certain derivative securities like HOLDR may have certain events where the source of payments are from an underlying security. "
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD12#LinkedSecurity
	 * FinancialInstrumentAttributesSD12.LinkedSecurity}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute LinkedSecurity = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributesSD14.mmObject();
			isDerived = false;
			xmlTag = "LkdScty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedSecurity";
			definition = "Security whose characteristics mirror the event security for purposes of FCP eligibility and tax relief. Certain derivative securities like HOLDR may have certain events where the source of payments are from an underlying security. ";
			previousVersion_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD12.LinkedSecurity;
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> SecurityIdentification15.mmObject();
		}
	};
	/**
	 * Represents the 'original' security identifier of the event. It is used in
	 * the scenarios like "partial call" where there are 2 events. The first
	 * event distributes into the Contra CUSIP, a temporary security; and on the
	 * second event that temporary security becomes the underlying security of
	 * the event. This element is used in the second event to point to the
	 * original CUSIP.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OtherIdentification2
	 * OtherIdentification2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD14
	 * FinancialInstrumentAttributesSD14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgtgSctyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginatingSecurityIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Represents the 'original' security identifier of the event. It is used in the scenarios like \"partial call\" where there are 2 events. The first event distributes into the Contra CUSIP, a temporary security; and on the second event that temporary security becomes the underlying security of the event. This element is used in the second event to point to the original CUSIP. "
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD12#OriginatingSecurityIdentification
	 * FinancialInstrumentAttributesSD12.OriginatingSecurityIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd OriginatingSecurityIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributesSD14.mmObject();
			isDerived = false;
			xmlTag = "OrgtgSctyId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginatingSecurityIdentification";
			definition = "Represents the 'original' security identifier of the event. It is used in the scenarios like \"partial call\" where there are 2 events. The first event distributes into the Contra CUSIP, a temporary security; and on the second event that temporary security becomes the underlying security of the event. This element is used in the second event to point to the original CUSIP. ";
			previousVersion_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD12.OriginatingSecurityIdentification;
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> OtherIdentification2.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Security description associated with DIVANN legacy system which contains
	 * additional values such as NTL for interest only notional.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max50Text
	 * Max50Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD14
	 * FinancialInstrumentAttributesSD14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DIVANNSctyDesc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DIVANNSecurityDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security description associated with DIVANN legacy system which contains additional values such as NTL for interest only notional. "
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD12#DIVANNSecurityDescription
	 * FinancialInstrumentAttributesSD12.DIVANNSecurityDescription}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute DIVANNSecurityDescription = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributesSD14.mmObject();
			isDerived = false;
			xmlTag = "DIVANNSctyDesc";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DIVANNSecurityDescription";
			definition = "Security description associated with DIVANN legacy system which contains additional values such as NTL for interest only notional. ";
			previousVersion_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD12.DIVANNSecurityDescription;
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max50Text.mmObject();
		}
	};
	/**
	 * Indicates whether the event security is a foreign issue. This field will
	 * be initially used for CD Early Redemptions AC63.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD14
	 * FinancialInstrumentAttributesSD14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrgnIsseFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignIssueFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the event security is a foreign issue.  This field will be initially used for CD Early Redemptions AC63."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute ForeignIssueFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributesSD14.mmObject();
			isDerived = false;
			xmlTag = "FrgnIsseFlg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignIssueFlag";
			definition = "Indicates whether the event security is a foreign issue.  This field will be initially used for CD Early Redemptions AC63.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributesSD14.PlaceAndName, com.tools20022.repository.msg.FinancialInstrumentAttributesSD14.IncomeSourceCountry,
						com.tools20022.repository.msg.FinancialInstrumentAttributesSD14.DTCAssetClass, com.tools20022.repository.msg.FinancialInstrumentAttributesSD14.DTCAssetType,
						com.tools20022.repository.msg.FinancialInstrumentAttributesSD14.SecurityEligibilityIndicator, com.tools20022.repository.msg.FinancialInstrumentAttributesSD14.TickerSymbol,
						com.tools20022.repository.msg.FinancialInstrumentAttributesSD14.LinkedSecurity, com.tools20022.repository.msg.FinancialInstrumentAttributesSD14.OriginatingSecurityIdentification,
						com.tools20022.repository.msg.FinancialInstrumentAttributesSD14.DIVANNSecurityDescription, com.tools20022.repository.msg.FinancialInstrumentAttributesSD14.ForeignIssueFlag);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "FinancialInstrumentAttributesSD14";
				definition = "Provides additional information regarding underlying security details.";
				previousVersion_lazy = () -> FinancialInstrumentAttributesSD12.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}