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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.DateFormat14Choice;
import com.tools20022.repository.choice.PartyIdentification33Choice;
import com.tools20022.repository.choice.SafekeepingPlaceFormat7Choice;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.OtherTypeOfCollateral2;
import com.tools20022.repository.msg.SecuritiesAccount19;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details about the letter of credit or bank guarantee, or other
 * collateral, posted as collateral.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral4#mmCollateralIdentification
 * OtherCollateral4.mmCollateralIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral4#mmAssetNumber
 * OtherCollateral4.mmAssetNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral4#mmLetterOfCreditIdentification
 * OtherCollateral4.mmLetterOfCreditIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral4#mmLetterOfCreditAmount
 * OtherCollateral4.mmLetterOfCreditAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral4#mmGuaranteeAmount
 * OtherCollateral4.mmGuaranteeAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral4#mmOtherTypeOfCollateral
 * OtherCollateral4.mmOtherTypeOfCollateral}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral4#mmIssueDate
 * OtherCollateral4.mmIssueDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral4#mmExpiryDate
 * OtherCollateral4.mmExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral4#mmLimitedCoverageIndicator
 * OtherCollateral4.mmLimitedCoverageIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral4#mmIssuer
 * OtherCollateral4.mmIssuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral4#mmValueDate
 * OtherCollateral4.mmValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral4#mmExchangeRate
 * OtherCollateral4.mmExchangeRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral4#mmMarketValue
 * OtherCollateral4.mmMarketValue}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral4#mmHaircut
 * OtherCollateral4.mmHaircut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral4#mmCollateralValue
 * OtherCollateral4.mmCollateralValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral4#mmSafekeepingPlace
 * OtherCollateral4.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral4#mmSafekeepingAccount
 * OtherCollateral4.mmSafekeepingAccount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OtherCollateral4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides details about the letter of credit or bank guarantee, or other collateral, posted as collateral."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral7
 * OtherCollateral7}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.OtherCollateral2 OtherCollateral2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OtherCollateral4", propOrder = {"collateralIdentification", "assetNumber", "letterOfCreditIdentification", "letterOfCreditAmount", "guaranteeAmount", "otherTypeOfCollateral", "issueDate", "expiryDate",
		"limitedCoverageIndicator", "issuer", "valueDate", "exchangeRate", "marketValue", "haircut", "collateralValue", "safekeepingPlace", "safekeepingAccount"})
public class OtherCollateral4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CollId")
	protected Max35Text collateralIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral4
	 * OtherCollateral4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the identification of the proposed collateral."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral7#mmCollateralIdentification
	 * OtherCollateral7.mmCollateralIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral2#mmCollateralIdentification
	 * OtherCollateral2.mmCollateralIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OtherCollateral4, Optional<Max35Text>> mmCollateralIdentification = new MMMessageAttribute<OtherCollateral4, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherCollateral4.mmObject();
			isDerived = false;
			xmlTag = "CollId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralIdentification";
			definition = "Provides the identification of the proposed collateral.";
			nextVersions_lazy = () -> Arrays.asList(OtherCollateral7.mmCollateralIdentification);
			previousVersion_lazy = () -> OtherCollateral2.mmCollateralIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(OtherCollateral4 obj) {
			return obj.getCollateralIdentification();
		}

		@Override
		public void setValue(OtherCollateral4 obj, Optional<Max35Text> value) {
			obj.setCollateralIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "AsstNb")
	protected Max35Text assetNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral4
	 * OtherCollateral4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AsstNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the register number of the collateral deposit assigned by the central counterparty."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral7#mmAssetNumber
	 * OtherCollateral7.mmAssetNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OtherCollateral4, Optional<Max35Text>> mmAssetNumber = new MMMessageAttribute<OtherCollateral4, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherCollateral4.mmObject();
			isDerived = false;
			xmlTag = "AsstNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetNumber";
			definition = "Identifies the register number of the collateral deposit assigned by the central counterparty.";
			nextVersions_lazy = () -> Arrays.asList(OtherCollateral7.mmAssetNumber);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(OtherCollateral4 obj) {
			return obj.getAssetNumber();
		}

		@Override
		public void setValue(OtherCollateral4 obj, Optional<Max35Text> value) {
			obj.setAssetNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "LttrOfCdtId")
	protected Max35Text letterOfCreditIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmDocumentIdentification
	 * Document.mmDocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral4
	 * OtherCollateral4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LttrOfCdtId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterOfCreditIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the unique identification of the letter of credit."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral7#mmLetterOfCreditIdentification
	 * OtherCollateral7.mmLetterOfCreditIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral2#mmLetterOfCreditIdentification
	 * OtherCollateral2.mmLetterOfCreditIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OtherCollateral4, Optional<Max35Text>> mmLetterOfCreditIdentification = new MMMessageAttribute<OtherCollateral4, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Document.mmDocumentIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherCollateral4.mmObject();
			isDerived = false;
			xmlTag = "LttrOfCdtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LetterOfCreditIdentification";
			definition = "Provides the unique identification of the letter of credit.";
			nextVersions_lazy = () -> Arrays.asList(OtherCollateral7.mmLetterOfCreditIdentification);
			previousVersion_lazy = () -> OtherCollateral2.mmLetterOfCreditIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(OtherCollateral4 obj) {
			return obj.getLetterOfCreditIdentification();
		}

		@Override
		public void setValue(OtherCollateral4 obj, Optional<Max35Text> value) {
			obj.setLetterOfCreditIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "LttrOfCdtAmt")
	protected ActiveCurrencyAndAmount letterOfCreditAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LetterOfCredit#mmAmount
	 * LetterOfCredit.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral4
	 * OtherCollateral4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LttrOfCdtAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterOfCreditAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of the letter/documentary credit."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral7#mmLetterOfCreditAmount
	 * OtherCollateral7.mmLetterOfCreditAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral2#mmLetterOfCreditAmount
	 * OtherCollateral2.mmLetterOfCreditAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OtherCollateral4, Optional<ActiveCurrencyAndAmount>> mmLetterOfCreditAmount = new MMMessageAttribute<OtherCollateral4, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> LetterOfCredit.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherCollateral4.mmObject();
			isDerived = false;
			xmlTag = "LttrOfCdtAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LetterOfCreditAmount";
			definition = "Amount of the letter/documentary credit.";
			nextVersions_lazy = () -> Arrays.asList(OtherCollateral7.mmLetterOfCreditAmount);
			previousVersion_lazy = () -> OtherCollateral2.mmLetterOfCreditAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(OtherCollateral4 obj) {
			return obj.getLetterOfCreditAmount();
		}

		@Override
		public void setValue(OtherCollateral4 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setLetterOfCreditAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "GrntAmt")
	protected ActiveCurrencyAndAmount guaranteeAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Guarantee#mmCoveredAmount
	 * Guarantee.mmCoveredAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral4
	 * OtherCollateral4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrntAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GuaranteeAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of the bank guarantee."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral7#mmGuaranteeAmount
	 * OtherCollateral7.mmGuaranteeAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral2#mmGuaranteeAmount
	 * OtherCollateral2.mmGuaranteeAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OtherCollateral4, Optional<ActiveCurrencyAndAmount>> mmGuaranteeAmount = new MMMessageAttribute<OtherCollateral4, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Guarantee.mmCoveredAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherCollateral4.mmObject();
			isDerived = false;
			xmlTag = "GrntAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GuaranteeAmount";
			definition = "Amount of the bank guarantee.";
			nextVersions_lazy = () -> Arrays.asList(OtherCollateral7.mmGuaranteeAmount);
			previousVersion_lazy = () -> OtherCollateral2.mmGuaranteeAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(OtherCollateral4 obj) {
			return obj.getGuaranteeAmount();
		}

		@Override
		public void setValue(OtherCollateral4 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setGuaranteeAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrTpOfColl")
	protected OtherTypeOfCollateral2 otherTypeOfCollateral;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OtherTypeOfCollateral2
	 * OtherTypeOfCollateral2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral4
	 * OtherCollateral4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrTpOfColl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherTypeOfCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides a description and an amount of another type of collateral."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral7#mmOtherTypeOfCollateral
	 * OtherCollateral7.mmOtherTypeOfCollateral}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral2#mmOtherTypeOfCollateral
	 * OtherCollateral2.mmOtherTypeOfCollateral}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OtherCollateral4, Optional<OtherTypeOfCollateral2>> mmOtherTypeOfCollateral = new MMMessageAssociationEnd<OtherCollateral4, Optional<OtherTypeOfCollateral2>>() {
		{
			businessComponentTrace_lazy = () -> Asset.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherCollateral4.mmObject();
			isDerived = false;
			xmlTag = "OthrTpOfColl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherTypeOfCollateral";
			definition = "Provides a description and an amount of another type of collateral.";
			nextVersions_lazy = () -> Arrays.asList(OtherCollateral7.mmOtherTypeOfCollateral);
			previousVersion_lazy = () -> OtherCollateral2.mmOtherTypeOfCollateral;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OtherTypeOfCollateral2.mmObject();
		}

		@Override
		public Optional<OtherTypeOfCollateral2> getValue(OtherCollateral4 obj) {
			return obj.getOtherTypeOfCollateral();
		}

		@Override
		public void setValue(OtherCollateral4 obj, Optional<OtherTypeOfCollateral2> value) {
			obj.setOtherTypeOfCollateral(value.orElse(null));
		}
	};
	@XmlElement(name = "IsseDt")
	protected DateFormat14Choice issueDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat14Choice
	 * DateFormat14Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmIssueDate
	 * Issuance.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral4
	 * OtherCollateral4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IsseDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the other collateral was issued."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral7#mmIssueDate
	 * OtherCollateral7.mmIssueDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral2#mmIssueDate
	 * OtherCollateral2.mmIssueDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OtherCollateral4, Optional<DateFormat14Choice>> mmIssueDate = new MMMessageAssociationEnd<OtherCollateral4, Optional<DateFormat14Choice>>() {
		{
			businessElementTrace_lazy = () -> Issuance.mmIssueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherCollateral4.mmObject();
			isDerived = false;
			xmlTag = "IsseDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueDate";
			definition = "Date on which the other collateral was issued.";
			nextVersions_lazy = () -> Arrays.asList(OtherCollateral7.mmIssueDate);
			previousVersion_lazy = () -> OtherCollateral2.mmIssueDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat14Choice.mmObject();
		}

		@Override
		public Optional<DateFormat14Choice> getValue(OtherCollateral4 obj) {
			return obj.getIssueDate();
		}

		@Override
		public void setValue(OtherCollateral4 obj, Optional<DateFormat14Choice> value) {
			obj.setIssueDate(value.orElse(null));
		}
	};
	@XmlElement(name = "XpryDt")
	protected DateFormat14Choice expiryDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat14Choice
	 * DateFormat14Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmExpiryDate
	 * Asset.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral4
	 * OtherCollateral4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpryDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the other collateral expires."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral7#mmExpiryDate
	 * OtherCollateral7.mmExpiryDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral2#mmExpiryDate
	 * OtherCollateral2.mmExpiryDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OtherCollateral4, Optional<DateFormat14Choice>> mmExpiryDate = new MMMessageAssociationEnd<OtherCollateral4, Optional<DateFormat14Choice>>() {
		{
			businessElementTrace_lazy = () -> Asset.mmExpiryDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherCollateral4.mmObject();
			isDerived = false;
			xmlTag = "XpryDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryDate";
			definition = "Date on which the other collateral expires.";
			nextVersions_lazy = () -> Arrays.asList(OtherCollateral7.mmExpiryDate);
			previousVersion_lazy = () -> OtherCollateral2.mmExpiryDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat14Choice.mmObject();
		}

		@Override
		public Optional<DateFormat14Choice> getValue(OtherCollateral4 obj) {
			return obj.getExpiryDate();
		}

		@Override
		public void setValue(OtherCollateral4 obj, Optional<DateFormat14Choice> value) {
			obj.setExpiryDate(value.orElse(null));
		}
	};
	@XmlElement(name = "LtdCvrgInd")
	protected YesNoIndicator limitedCoverageIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral4
	 * OtherCollateral4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LtdCvrgInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitedCoverageIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the collateral deposited in the clearing house covers the margin until a specific timeframe."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral7#mmLimitedCoverageIndicator
	 * OtherCollateral7.mmLimitedCoverageIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral2#mmLimitedCoverageIndicator
	 * OtherCollateral2.mmLimitedCoverageIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OtherCollateral4, Optional<YesNoIndicator>> mmLimitedCoverageIndicator = new MMMessageAttribute<OtherCollateral4, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherCollateral4.mmObject();
			isDerived = false;
			xmlTag = "LtdCvrgInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitedCoverageIndicator";
			definition = "Indicates that the collateral deposited in the clearing house covers the margin until a specific timeframe.";
			nextVersions_lazy = () -> Arrays.asList(OtherCollateral7.mmLimitedCoverageIndicator);
			previousVersion_lazy = () -> OtherCollateral2.mmLimitedCoverageIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(OtherCollateral4 obj) {
			return obj.getLimitedCoverageIndicator();
		}

		@Override
		public void setValue(OtherCollateral4 obj, Optional<YesNoIndicator> value) {
			obj.setLimitedCoverageIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "Issr")
	protected PartyIdentification33Choice issuer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification33Choice
	 * PartyIdentification33Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral4
	 * OtherCollateral4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Issr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that issues the bank guarantee or letter of / documentary credit."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral7#mmIssuer
	 * OtherCollateral7.mmIssuer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral2#mmIssuer
	 * OtherCollateral2.mmIssuer}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OtherCollateral4, Optional<PartyIdentification33Choice>> mmIssuer = new MMMessageAssociationEnd<OtherCollateral4, Optional<PartyIdentification33Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherCollateral4.mmObject();
			isDerived = false;
			xmlTag = "Issr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuer";
			definition = "Party that issues the bank guarantee or letter of / documentary credit.";
			nextVersions_lazy = () -> Arrays.asList(OtherCollateral7.mmIssuer);
			previousVersion_lazy = () -> OtherCollateral2.mmIssuer;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification33Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification33Choice> getValue(OtherCollateral4 obj) {
			return obj.getIssuer();
		}

		@Override
		public void setValue(OtherCollateral4 obj, Optional<PartyIdentification33Choice> value) {
			obj.setIssuer(value.orElse(null));
		}
	};
	@XmlElement(name = "ValDt")
	protected ISODate valueDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation#mmCollateralValuationDate
	 * CollateralValuation.mmCollateralValuationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral4
	 * OtherCollateral4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Valuation date of the other collateral when it was taken as collateral."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral7#mmValueDate
	 * OtherCollateral7.mmValueDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral2#mmValueDate
	 * OtherCollateral2.mmValueDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OtherCollateral4, Optional<ISODate>> mmValueDate = new MMMessageAttribute<OtherCollateral4, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> CollateralValuation.mmCollateralValuationDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherCollateral4.mmObject();
			isDerived = false;
			xmlTag = "ValDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueDate";
			definition = "Valuation date of the other collateral when it was taken as collateral.";
			nextVersions_lazy = () -> Arrays.asList(OtherCollateral7.mmValueDate);
			previousVersion_lazy = () -> OtherCollateral2.mmValueDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(OtherCollateral4 obj) {
			return obj.getValueDate();
		}

		@Override
		public void setValue(OtherCollateral4 obj, Optional<ISODate> value) {
			obj.setValueDate(value.orElse(null));
		}
	};
	@XmlElement(name = "XchgRate")
	protected BaseOneRate exchangeRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmExchangeRate
	 * AssetHolding.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral4
	 * OtherCollateral4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XchgRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Exchange rate."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral7#mmExchangeRate
	 * OtherCollateral7.mmExchangeRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral2#mmExchangeRate
	 * OtherCollateral2.mmExchangeRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OtherCollateral4, Optional<BaseOneRate>> mmExchangeRate = new MMMessageAttribute<OtherCollateral4, Optional<BaseOneRate>>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmExchangeRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherCollateral4.mmObject();
			isDerived = false;
			xmlTag = "XchgRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeRate";
			definition = "Exchange rate.";
			nextVersions_lazy = () -> Arrays.asList(OtherCollateral7.mmExchangeRate);
			previousVersion_lazy = () -> OtherCollateral2.mmExchangeRate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}

		@Override
		public Optional<BaseOneRate> getValue(OtherCollateral4 obj) {
			return obj.getExchangeRate();
		}

		@Override
		public void setValue(OtherCollateral4 obj, Optional<BaseOneRate> value) {
			obj.setExchangeRate(value.orElse(null));
		}
	};
	@XmlElement(name = "MktVal")
	protected ActiveCurrencyAndAmount marketValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmMarketValue
	 * AssetHolding.mmMarketValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral4
	 * OtherCollateral4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktVal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of the collateral based on current market prices."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral7#mmMarketValue
	 * OtherCollateral7.mmMarketValue}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral2#mmMarketValue
	 * OtherCollateral2.mmMarketValue}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OtherCollateral4, Optional<ActiveCurrencyAndAmount>> mmMarketValue = new MMMessageAttribute<OtherCollateral4, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmMarketValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherCollateral4.mmObject();
			isDerived = false;
			xmlTag = "MktVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketValue";
			definition = "Value of the collateral based on current market prices.";
			nextVersions_lazy = () -> Arrays.asList(OtherCollateral7.mmMarketValue);
			previousVersion_lazy = () -> OtherCollateral2.mmMarketValue;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(OtherCollateral4 obj) {
			return obj.getMarketValue();
		}

		@Override
		public void setValue(OtherCollateral4 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setMarketValue(value.orElse(null));
		}
	};
	@XmlElement(name = "Hrcut")
	protected PercentageRate haircut;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.HaircutValuation#mmHaircut
	 * HaircutValuation.mmHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral4
	 * OtherCollateral4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Hrcut"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Haircut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Haircut or valuation factor on the collateral expressed as a percentage."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral7#mmHaircut
	 * OtherCollateral7.mmHaircut}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral2#mmHaircut
	 * OtherCollateral2.mmHaircut}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OtherCollateral4, Optional<PercentageRate>> mmHaircut = new MMMessageAttribute<OtherCollateral4, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> HaircutValuation.mmHaircut;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherCollateral4.mmObject();
			isDerived = false;
			xmlTag = "Hrcut";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Haircut";
			definition = "Haircut or valuation factor on the collateral expressed as a percentage.";
			nextVersions_lazy = () -> Arrays.asList(OtherCollateral7.mmHaircut);
			previousVersion_lazy = () -> OtherCollateral2.mmHaircut;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(OtherCollateral4 obj) {
			return obj.getHaircut();
		}

		@Override
		public void setValue(OtherCollateral4 obj, Optional<PercentageRate> value) {
			obj.setHaircut(value.orElse(null));
		}
	};
	@XmlElement(name = "CollVal", required = true)
	protected ActiveCurrencyAndAmount collateralValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmRiskAdjustedValue
	 * AssetHolding.mmRiskAdjustedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral4
	 * OtherCollateral4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollVal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of the collateral after taking into account the haircut, if any."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral7#mmCollateralValue
	 * OtherCollateral7.mmCollateralValue}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral2#mmCollateralValue
	 * OtherCollateral2.mmCollateralValue}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OtherCollateral4, ActiveCurrencyAndAmount> mmCollateralValue = new MMMessageAttribute<OtherCollateral4, ActiveCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmRiskAdjustedValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherCollateral4.mmObject();
			isDerived = false;
			xmlTag = "CollVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralValue";
			definition = "Value of the collateral after taking into account the haircut, if any.";
			nextVersions_lazy = () -> Arrays.asList(OtherCollateral7.mmCollateralValue);
			previousVersion_lazy = () -> OtherCollateral2.mmCollateralValue;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(OtherCollateral4 obj) {
			return obj.getCollateralValue();
		}

		@Override
		public void setValue(OtherCollateral4 obj, ActiveCurrencyAndAmount value) {
			obj.setCollateralValue(value);
		}
	};
	@XmlElement(name = "SfkpgPlc")
	protected SafekeepingPlaceFormat7Choice safekeepingPlace;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat7Choice
	 * SafekeepingPlaceFormat7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral4
	 * OtherCollateral4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgPlc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place where the securities are safe-kept, physically or notionally. This place can be, for example, a local custodian, a Central Securities Depository (CSD) or an International Central Securities Depository (ICSD)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral7#mmSafekeepingPlace
	 * OtherCollateral7.mmSafekeepingPlace}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral2#mmSafekeepingPlace
	 * OtherCollateral2.mmSafekeepingPlace}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OtherCollateral4, Optional<SafekeepingPlaceFormat7Choice>> mmSafekeepingPlace = new MMMessageAssociationEnd<OtherCollateral4, Optional<SafekeepingPlaceFormat7Choice>>() {
		{
			businessComponentTrace_lazy = () -> SafekeepingPlace.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherCollateral4.mmObject();
			isDerived = false;
			xmlTag = "SfkpgPlc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlace";
			definition = "Place where the securities are safe-kept, physically or notionally. This place can be, for example, a local custodian, a Central Securities Depository (CSD) or an International Central Securities Depository (ICSD).";
			nextVersions_lazy = () -> Arrays.asList(OtherCollateral7.mmSafekeepingPlace);
			previousVersion_lazy = () -> OtherCollateral2.mmSafekeepingPlace;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SafekeepingPlaceFormat7Choice.mmObject();
		}

		@Override
		public Optional<SafekeepingPlaceFormat7Choice> getValue(OtherCollateral4 obj) {
			return obj.getSafekeepingPlace();
		}

		@Override
		public void setValue(OtherCollateral4 obj, Optional<SafekeepingPlaceFormat7Choice> value) {
			obj.setSafekeepingPlace(value.orElse(null));
		}
	};
	@XmlElement(name = "SfkpgAcct")
	protected SecuritiesAccount19 safekeepingAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesAccount19
	 * SecuritiesAccount19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesAccount
	 * Security.mmSecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral4
	 * OtherCollateral4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a securities entry is made."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral7#mmSafekeepingAccount
	 * OtherCollateral7.mmSafekeepingAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral2#mmSafekeepingAccount
	 * OtherCollateral2.mmSafekeepingAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OtherCollateral4, Optional<SecuritiesAccount19>> mmSafekeepingAccount = new MMMessageAssociationEnd<OtherCollateral4, Optional<SecuritiesAccount19>>() {
		{
			businessElementTrace_lazy = () -> Security.mmSecuritiesAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherCollateral4.mmObject();
			isDerived = false;
			xmlTag = "SfkpgAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			definition = "Account to or from which a securities entry is made.";
			nextVersions_lazy = () -> Arrays.asList(OtherCollateral7.mmSafekeepingAccount);
			previousVersion_lazy = () -> OtherCollateral2.mmSafekeepingAccount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecuritiesAccount19.mmObject();
		}

		@Override
		public Optional<SecuritiesAccount19> getValue(OtherCollateral4 obj) {
			return obj.getSafekeepingAccount();
		}

		@Override
		public void setValue(OtherCollateral4 obj, Optional<SecuritiesAccount19> value) {
			obj.setSafekeepingAccount(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherCollateral4.mmCollateralIdentification, com.tools20022.repository.msg.OtherCollateral4.mmAssetNumber,
						com.tools20022.repository.msg.OtherCollateral4.mmLetterOfCreditIdentification, com.tools20022.repository.msg.OtherCollateral4.mmLetterOfCreditAmount, com.tools20022.repository.msg.OtherCollateral4.mmGuaranteeAmount,
						com.tools20022.repository.msg.OtherCollateral4.mmOtherTypeOfCollateral, com.tools20022.repository.msg.OtherCollateral4.mmIssueDate, com.tools20022.repository.msg.OtherCollateral4.mmExpiryDate,
						com.tools20022.repository.msg.OtherCollateral4.mmLimitedCoverageIndicator, com.tools20022.repository.msg.OtherCollateral4.mmIssuer, com.tools20022.repository.msg.OtherCollateral4.mmValueDate,
						com.tools20022.repository.msg.OtherCollateral4.mmExchangeRate, com.tools20022.repository.msg.OtherCollateral4.mmMarketValue, com.tools20022.repository.msg.OtherCollateral4.mmHaircut,
						com.tools20022.repository.msg.OtherCollateral4.mmCollateralValue, com.tools20022.repository.msg.OtherCollateral4.mmSafekeepingPlace, com.tools20022.repository.msg.OtherCollateral4.mmSafekeepingAccount);
				trace_lazy = () -> Asset.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OtherCollateral4";
				definition = "Provides details about the letter of credit or bank guarantee, or other collateral, posted as collateral.";
				nextVersions_lazy = () -> Arrays.asList(OtherCollateral7.mmObject());
				previousVersion_lazy = () -> OtherCollateral2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getCollateralIdentification() {
		return collateralIdentification == null ? Optional.empty() : Optional.of(collateralIdentification);
	}

	public OtherCollateral4 setCollateralIdentification(Max35Text collateralIdentification) {
		this.collateralIdentification = collateralIdentification;
		return this;
	}

	public Optional<Max35Text> getAssetNumber() {
		return assetNumber == null ? Optional.empty() : Optional.of(assetNumber);
	}

	public OtherCollateral4 setAssetNumber(Max35Text assetNumber) {
		this.assetNumber = assetNumber;
		return this;
	}

	public Optional<Max35Text> getLetterOfCreditIdentification() {
		return letterOfCreditIdentification == null ? Optional.empty() : Optional.of(letterOfCreditIdentification);
	}

	public OtherCollateral4 setLetterOfCreditIdentification(Max35Text letterOfCreditIdentification) {
		this.letterOfCreditIdentification = letterOfCreditIdentification;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getLetterOfCreditAmount() {
		return letterOfCreditAmount == null ? Optional.empty() : Optional.of(letterOfCreditAmount);
	}

	public OtherCollateral4 setLetterOfCreditAmount(ActiveCurrencyAndAmount letterOfCreditAmount) {
		this.letterOfCreditAmount = letterOfCreditAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getGuaranteeAmount() {
		return guaranteeAmount == null ? Optional.empty() : Optional.of(guaranteeAmount);
	}

	public OtherCollateral4 setGuaranteeAmount(ActiveCurrencyAndAmount guaranteeAmount) {
		this.guaranteeAmount = guaranteeAmount;
		return this;
	}

	public Optional<OtherTypeOfCollateral2> getOtherTypeOfCollateral() {
		return otherTypeOfCollateral == null ? Optional.empty() : Optional.of(otherTypeOfCollateral);
	}

	public OtherCollateral4 setOtherTypeOfCollateral(OtherTypeOfCollateral2 otherTypeOfCollateral) {
		this.otherTypeOfCollateral = otherTypeOfCollateral;
		return this;
	}

	public Optional<DateFormat14Choice> getIssueDate() {
		return issueDate == null ? Optional.empty() : Optional.of(issueDate);
	}

	public OtherCollateral4 setIssueDate(DateFormat14Choice issueDate) {
		this.issueDate = issueDate;
		return this;
	}

	public Optional<DateFormat14Choice> getExpiryDate() {
		return expiryDate == null ? Optional.empty() : Optional.of(expiryDate);
	}

	public OtherCollateral4 setExpiryDate(DateFormat14Choice expiryDate) {
		this.expiryDate = expiryDate;
		return this;
	}

	public Optional<YesNoIndicator> getLimitedCoverageIndicator() {
		return limitedCoverageIndicator == null ? Optional.empty() : Optional.of(limitedCoverageIndicator);
	}

	public OtherCollateral4 setLimitedCoverageIndicator(YesNoIndicator limitedCoverageIndicator) {
		this.limitedCoverageIndicator = limitedCoverageIndicator;
		return this;
	}

	public Optional<PartyIdentification33Choice> getIssuer() {
		return issuer == null ? Optional.empty() : Optional.of(issuer);
	}

	public OtherCollateral4 setIssuer(PartyIdentification33Choice issuer) {
		this.issuer = issuer;
		return this;
	}

	public Optional<ISODate> getValueDate() {
		return valueDate == null ? Optional.empty() : Optional.of(valueDate);
	}

	public OtherCollateral4 setValueDate(ISODate valueDate) {
		this.valueDate = valueDate;
		return this;
	}

	public Optional<BaseOneRate> getExchangeRate() {
		return exchangeRate == null ? Optional.empty() : Optional.of(exchangeRate);
	}

	public OtherCollateral4 setExchangeRate(BaseOneRate exchangeRate) {
		this.exchangeRate = exchangeRate;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getMarketValue() {
		return marketValue == null ? Optional.empty() : Optional.of(marketValue);
	}

	public OtherCollateral4 setMarketValue(ActiveCurrencyAndAmount marketValue) {
		this.marketValue = marketValue;
		return this;
	}

	public Optional<PercentageRate> getHaircut() {
		return haircut == null ? Optional.empty() : Optional.of(haircut);
	}

	public OtherCollateral4 setHaircut(PercentageRate haircut) {
		this.haircut = haircut;
		return this;
	}

	public ActiveCurrencyAndAmount getCollateralValue() {
		return collateralValue;
	}

	public OtherCollateral4 setCollateralValue(ActiveCurrencyAndAmount collateralValue) {
		this.collateralValue = Objects.requireNonNull(collateralValue);
		return this;
	}

	public Optional<SafekeepingPlaceFormat7Choice> getSafekeepingPlace() {
		return safekeepingPlace == null ? Optional.empty() : Optional.of(safekeepingPlace);
	}

	public OtherCollateral4 setSafekeepingPlace(SafekeepingPlaceFormat7Choice safekeepingPlace) {
		this.safekeepingPlace = safekeepingPlace;
		return this;
	}

	public Optional<SecuritiesAccount19> getSafekeepingAccount() {
		return safekeepingAccount == null ? Optional.empty() : Optional.of(safekeepingAccount);
	}

	public OtherCollateral4 setSafekeepingAccount(SecuritiesAccount19 safekeepingAccount) {
		this.safekeepingAccount = safekeepingAccount;
		return this;
	}
}