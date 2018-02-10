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

import com.tools20022.metamodel.ext.DTCCSynonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.DTCBaseDisbursed1Code;
import com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code;
import com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code;
import com.tools20022.repository.codeset.SecuritiesExitReason1Code;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max3NumericText;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information regarding corporate action option securities
 * movement details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD2#mmPlaceAndName
 * SecuritiesOptionSD2.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD2#mmDTCPayMethod
 * SecuritiesOptionSD2.mmDTCPayMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD2#mmDTCPayOrder
 * SecuritiesOptionSD2.mmDTCPayOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD2#mmReinvestmentIncomeClassification
 * SecuritiesOptionSD2.mmReinvestmentIncomeClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD2#mmEntitlementCalculationMethod
 * SecuritiesOptionSD2.mmEntitlementCalculationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD2#mmPriceBasis
 * SecuritiesOptionSD2.mmPriceBasis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD2#mmDTCExitExplanationIndicator
 * SecuritiesOptionSD2.mmDTCExitExplanationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD2#mmChargeFlag
 * SecuritiesOptionSD2.mmChargeFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD2#mmProtectChargeFlag
 * SecuritiesOptionSD2.mmProtectChargeFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD2#mmEstimatedPriceFlag
 * SecuritiesOptionSD2.mmEstimatedPriceFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD2#mmDTCFractionalShareInstructionPeriod
 * SecuritiesOptionSD2.mmDTCFractionalShareInstructionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD2#mmDTCUSTaxInstructionPeriod
 * SecuritiesOptionSD2.mmDTCUSTaxInstructionPeriod}</li>
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
 * "SecuritiesOptionSD2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action option securities movement details."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOptionSD5
 * SecuritiesOptionSD5}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesOptionSD2", propOrder = {"placeAndName", "dTCPayMethod", "dTCPayOrder", "reinvestmentIncomeClassification", "entitlementCalculationMethod", "priceBasis", "dTCExitExplanationIndicator", "chargeFlag",
		"protectChargeFlag", "estimatedPriceFlag", "dTCFractionalShareInstructionPeriod", "dTCUSTaxInstructionPeriod"})
public class SecuritiesOptionSD2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm", required = true)
	protected Max350Text placeAndName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD2
	 * SecuritiesOptionSD2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOptionSD2.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "DTCPayMtd")
	protected Max3NumericText dTCPayMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max3NumericText
	 * Max3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD2
	 * SecuritiesOptionSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCPayMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Pay Method</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCPayMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the type of payment. Used in stock dividends processing at DTC(The Depository Trust Corporation). Valid values list will be maintained separately from the schema. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCPayMethod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOptionSD2.mmObject();
			isDerived = false;
			xmlTag = "DTCPayMtd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Pay Method"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCPayMethod";
			definition = "Indicates the type of payment. Used in stock dividends processing at DTC(The Depository Trust Corporation). Valid values list will be maintained separately from the schema. ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}
	};
	@XmlElement(name = "DTCPayOrdr")
	protected Max3NumericText dTCPayOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max3NumericText
	 * Max3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD2
	 * SecuritiesOptionSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCPayOrdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Pay Order</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCPayOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the payment order. Used in stock dividends processing at DTC (The Depository Trust Corporation).  Valid values list will be maintained separately from the schema."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCPayOrder = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOptionSD2.mmObject();
			isDerived = false;
			xmlTag = "DTCPayOrdr";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Pay Order"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCPayOrder";
			definition = "Indicates the payment order. Used in stock dividends processing at DTC (The Depository Trust Corporation).  Valid values list will be maintained separately from the schema.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}
	};
	@XmlElement(name = "RinvstmtIncmClssfctn")
	protected ReinvestmentIncomeClassification1Code reinvestmentIncomeClassification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code
	 * ReinvestmentIncomeClassification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD2
	 * SecuritiesOptionSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RinvstmtIncmClssfctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Reinvestment Income Classification</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinvestmentIncomeClassification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Income classification of the cash proceeds for dividend reinvestment ."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReinvestmentIncomeClassification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOptionSD2.mmObject();
			isDerived = false;
			xmlTag = "RinvstmtIncmClssfctn";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Reinvestment Income Classification"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReinvestmentIncomeClassification";
			definition = "Income classification of the cash proceeds for dividend reinvestment .";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ReinvestmentIncomeClassification1Code.mmObject();
		}
	};
	@XmlElement(name = "EntitlmntClctnMtd")
	protected DTCEntitlementCalculationMethod1Code entitlementCalculationMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code
	 * DTCEntitlementCalculationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD2
	 * SecuritiesOptionSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EntitlmntClctnMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Entitlement Calculation Method</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntitlementCalculationMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates how the entitlements were calculated optional dividends."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEntitlementCalculationMethod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOptionSD2.mmObject();
			isDerived = false;
			xmlTag = "EntitlmntClctnMtd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Entitlement Calculation Method"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntitlementCalculationMethod";
			definition = "Indicates how the entitlements were calculated optional dividends.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCEntitlementCalculationMethod1Code.mmObject();
		}
	};
	@XmlElement(name = "PricBsis")
	protected DTCBaseDisbursed1Code priceBasis;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCBaseDisbursed1Code
	 * DTCBaseDisbursed1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD2
	 * SecuritiesOptionSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricBsis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Price Basis</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price is based on either base or disbursed security. "</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPriceBasis = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOptionSD2.mmObject();
			isDerived = false;
			xmlTag = "PricBsis";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Price Basis"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceBasis";
			definition = "Price is based on either base or disbursed security. ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCBaseDisbursed1Code.mmObject();
		}
	};
	@XmlElement(name = "DTCExitExpltnInd")
	protected SecuritiesExitReason1Code dTCExitExplanationIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesExitReason1Code
	 * SecuritiesExitReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD2
	 * SecuritiesOptionSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCExitExpltnInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Exit Explanation Indicator</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCExitExplanationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason for DTC (The Depository Trust Corporation) to exit the shares. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCExitExplanationIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOptionSD2.mmObject();
			isDerived = false;
			xmlTag = "DTCExitExpltnInd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Exit Explanation Indicator"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCExitExplanationIndicator";
			definition = "Specifies the reason for DTC (The Depository Trust Corporation) to exit the shares. ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> SecuritiesExitReason1Code.mmObject();
		}
	};
	@XmlElement(name = "ChrgFlg")
	protected YesNoIndicator chargeFlag;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD2
	 * SecuritiesOptionSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Charge Indicator Flag</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether a DTC (The Depository Trust Corporation) participant, using one or more payment bonds in connection with a warrant exercise, will be charged (through settlement on exercise date) the value of the upcoming interest payment on the bond(s)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmChargeFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOptionSD2.mmObject();
			isDerived = false;
			xmlTag = "ChrgFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Charge Indicator Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeFlag";
			definition = "Indicates whether a DTC (The Depository Trust Corporation) participant, using one or more payment bonds in connection with a warrant exercise, will be charged (through settlement on exercise date) the value of the upcoming interest payment on the bond(s).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "PrtctChrgFlg")
	protected YesNoIndicator protectChargeFlag;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD2
	 * SecuritiesOptionSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctChrgFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Protect Charge Flag</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectChargeFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether a charge is levied on the protect instructions at the time when the protect is submitted or at the time of the cover. Applies to warrants or rights exercise scenario where the holder must put up money with rights or warrants execution. When this flag is set to yes - charges are due at the time of the protect, when it is set to \"no\" changes are due when protect is covered."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProtectChargeFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOptionSD2.mmObject();
			isDerived = false;
			xmlTag = "PrtctChrgFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Protect Charge Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectChargeFlag";
			definition = "Indicates whether a charge is levied on the protect instructions at the time when the protect is submitted or at the time of the cover. Applies to warrants or rights exercise scenario where the holder must put up money with rights or warrants execution. When this flag is set to yes - charges are due at the time of the protect, when it is set to \"no\" changes are due when protect is covered.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "EstmtdPricFlg")
	protected YesNoIndicator estimatedPriceFlag;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD2
	 * SecuritiesOptionSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EstmtdPricFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Estimated Price Flag</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EstimatedPriceFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the price from the offeror is estimated or final. "</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEstimatedPriceFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOptionSD2.mmObject();
			isDerived = false;
			xmlTag = "EstmtdPricFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Estimated Price Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstimatedPriceFlag";
			definition = "Indicates whether the price from the offeror is estimated or final. ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "DTCFrctnlShrInstrPrd")
	protected Period3 dTCFractionalShareInstructionPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Period3 Period3}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD2
	 * SecuritiesOptionSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCFrctnlShrInstrPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Fractional Share Instruction
	 * Expiration Date</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCFractionalShareInstructionPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Time period during which instructions regarding the disposition of fractional entitlements will be accepted at DTC (The Depository Trust Corporation)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCFractionalShareInstructionPeriod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOptionSD2.mmObject();
			isDerived = false;
			xmlTag = "DTCFrctnlShrInstrPrd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Fractional Share Instruction Expiration Date"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCFractionalShareInstructionPeriod";
			definition = "Time period during which instructions regarding the disposition of fractional entitlements will be accepted at DTC (The Depository Trust Corporation).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Period3.mmObject();
		}
	};
	@XmlElement(name = "DTCUSTaxInstrPrd")
	protected Period3 dTCUSTaxInstructionPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Period3 Period3}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOptionSD2
	 * SecuritiesOptionSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCUSTaxInstrPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC NRA Tax Instruction Expiration Date</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCUSTaxInstructionPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the period during which the instructions for US Tax service will be accepted at DTC (The Depository Trust Corporation)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCUSTaxInstructionPeriod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOptionSD2.mmObject();
			isDerived = false;
			xmlTag = "DTCUSTaxInstrPrd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC NRA Tax Instruction Expiration Date"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCUSTaxInstructionPeriod";
			definition = "Indicates the period during which the instructions for US Tax service will be accepted at DTC (The Depository Trust Corporation).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Period3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesOptionSD2.mmPlaceAndName, com.tools20022.repository.msg.SecuritiesOptionSD2.mmDTCPayMethod,
						com.tools20022.repository.msg.SecuritiesOptionSD2.mmDTCPayOrder, com.tools20022.repository.msg.SecuritiesOptionSD2.mmReinvestmentIncomeClassification,
						com.tools20022.repository.msg.SecuritiesOptionSD2.mmEntitlementCalculationMethod, com.tools20022.repository.msg.SecuritiesOptionSD2.mmPriceBasis,
						com.tools20022.repository.msg.SecuritiesOptionSD2.mmDTCExitExplanationIndicator, com.tools20022.repository.msg.SecuritiesOptionSD2.mmChargeFlag, com.tools20022.repository.msg.SecuritiesOptionSD2.mmProtectChargeFlag,
						com.tools20022.repository.msg.SecuritiesOptionSD2.mmEstimatedPriceFlag, com.tools20022.repository.msg.SecuritiesOptionSD2.mmDTCFractionalShareInstructionPeriod,
						com.tools20022.repository.msg.SecuritiesOptionSD2.mmDTCUSTaxInstructionPeriod);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SecuritiesOptionSD2";
				definition = "Provides additional information regarding corporate action option securities movement details.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesOptionSD5.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public SecuritiesOptionSD2 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = Objects.requireNonNull(placeAndName);
		return this;
	}

	public Optional<Max3NumericText> getDTCPayMethod() {
		return dTCPayMethod == null ? Optional.empty() : Optional.of(dTCPayMethod);
	}

	public SecuritiesOptionSD2 setDTCPayMethod(Max3NumericText dTCPayMethod) {
		this.dTCPayMethod = dTCPayMethod;
		return this;
	}

	public Optional<Max3NumericText> getDTCPayOrder() {
		return dTCPayOrder == null ? Optional.empty() : Optional.of(dTCPayOrder);
	}

	public SecuritiesOptionSD2 setDTCPayOrder(Max3NumericText dTCPayOrder) {
		this.dTCPayOrder = dTCPayOrder;
		return this;
	}

	public Optional<ReinvestmentIncomeClassification1Code> getReinvestmentIncomeClassification() {
		return reinvestmentIncomeClassification == null ? Optional.empty() : Optional.of(reinvestmentIncomeClassification);
	}

	public SecuritiesOptionSD2 setReinvestmentIncomeClassification(ReinvestmentIncomeClassification1Code reinvestmentIncomeClassification) {
		this.reinvestmentIncomeClassification = reinvestmentIncomeClassification;
		return this;
	}

	public Optional<DTCEntitlementCalculationMethod1Code> getEntitlementCalculationMethod() {
		return entitlementCalculationMethod == null ? Optional.empty() : Optional.of(entitlementCalculationMethod);
	}

	public SecuritiesOptionSD2 setEntitlementCalculationMethod(DTCEntitlementCalculationMethod1Code entitlementCalculationMethod) {
		this.entitlementCalculationMethod = entitlementCalculationMethod;
		return this;
	}

	public Optional<DTCBaseDisbursed1Code> getPriceBasis() {
		return priceBasis == null ? Optional.empty() : Optional.of(priceBasis);
	}

	public SecuritiesOptionSD2 setPriceBasis(DTCBaseDisbursed1Code priceBasis) {
		this.priceBasis = priceBasis;
		return this;
	}

	public Optional<SecuritiesExitReason1Code> getDTCExitExplanationIndicator() {
		return dTCExitExplanationIndicator == null ? Optional.empty() : Optional.of(dTCExitExplanationIndicator);
	}

	public SecuritiesOptionSD2 setDTCExitExplanationIndicator(SecuritiesExitReason1Code dTCExitExplanationIndicator) {
		this.dTCExitExplanationIndicator = dTCExitExplanationIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getChargeFlag() {
		return chargeFlag == null ? Optional.empty() : Optional.of(chargeFlag);
	}

	public SecuritiesOptionSD2 setChargeFlag(YesNoIndicator chargeFlag) {
		this.chargeFlag = chargeFlag;
		return this;
	}

	public Optional<YesNoIndicator> getProtectChargeFlag() {
		return protectChargeFlag == null ? Optional.empty() : Optional.of(protectChargeFlag);
	}

	public SecuritiesOptionSD2 setProtectChargeFlag(YesNoIndicator protectChargeFlag) {
		this.protectChargeFlag = protectChargeFlag;
		return this;
	}

	public Optional<YesNoIndicator> getEstimatedPriceFlag() {
		return estimatedPriceFlag == null ? Optional.empty() : Optional.of(estimatedPriceFlag);
	}

	public SecuritiesOptionSD2 setEstimatedPriceFlag(YesNoIndicator estimatedPriceFlag) {
		this.estimatedPriceFlag = estimatedPriceFlag;
		return this;
	}

	public Optional<Period3> getDTCFractionalShareInstructionPeriod() {
		return dTCFractionalShareInstructionPeriod == null ? Optional.empty() : Optional.of(dTCFractionalShareInstructionPeriod);
	}

	public SecuritiesOptionSD2 setDTCFractionalShareInstructionPeriod(com.tools20022.repository.msg.Period3 dTCFractionalShareInstructionPeriod) {
		this.dTCFractionalShareInstructionPeriod = dTCFractionalShareInstructionPeriod;
		return this;
	}

	public Optional<Period3> getDTCUSTaxInstructionPeriod() {
		return dTCUSTaxInstructionPeriod == null ? Optional.empty() : Optional.of(dTCUSTaxInstructionPeriod);
	}

	public SecuritiesOptionSD2 setDTCUSTaxInstructionPeriod(com.tools20022.repository.msg.Period3 dTCUSTaxInstructionPeriod) {
		this.dTCUSTaxInstructionPeriod = dTCUSTaxInstructionPeriod;
		return this;
	}
}