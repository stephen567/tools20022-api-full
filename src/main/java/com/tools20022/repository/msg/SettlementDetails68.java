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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification20;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of settlement of a transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmSecuritiesTransactionType
 * SettlementDetails68.mmSecuritiesTransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmSettlementTransactionCondition
 * SettlementDetails68.mmSettlementTransactionCondition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmBeneficialOwnership
 * SettlementDetails68.mmBeneficialOwnership}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmCCPEligibility
 * SettlementDetails68.mmCCPEligibility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmDeliveryReturnReason
 * SettlementDetails68.mmDeliveryReturnReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmCashClearingSystem
 * SettlementDetails68.mmCashClearingSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmExposureType
 * SettlementDetails68.mmExposureType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmFXStandingInstruction
 * SettlementDetails68.mmFXStandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmMarketClientSide
 * SettlementDetails68.mmMarketClientSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmNettingEligibility
 * SettlementDetails68.mmNettingEligibility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmRegistration
 * SettlementDetails68.mmRegistration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmLegalRestrictions
 * SettlementDetails68.mmLegalRestrictions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmSettlingCapacity
 * SettlementDetails68.mmSettlingCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmTaxCapacity
 * SettlementDetails68.mmTaxCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmStampDutyTaxBasis
 * SettlementDetails68.mmStampDutyTaxBasis}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementDetails68#mmTracking
 * SettlementDetails68.mmTracking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmLetterOfGuarantee
 * SettlementDetails68.mmLetterOfGuarantee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmReturnLeg
 * SettlementDetails68.mmReturnLeg}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmModificationCancellationAllowed
 * SettlementDetails68.mmModificationCancellationAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmEligibleForCollateral
 * SettlementDetails68.mmEligibleForCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmSecuritiesSubBalanceType
 * SettlementDetails68.mmSecuritiesSubBalanceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmCashSubBalanceType
 * SettlementDetails68.mmCashSubBalanceType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
 * SecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementDetails68"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of settlement of a transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsElementsUsageRule#forSettlementDetails68
 * ConstraintSettlementDetailsElementsUsageRule.forSettlementDetails68}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCashSettlementSystemUsageRule#forSettlementDetails68
 * ConstraintCashSettlementSystemUsageRule.forSettlementDetails68}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOpeningClosingUsageRule#forSettlementDetails68
 * ConstraintOpeningClosingUsageRule.forSettlementDetails68}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementDetails94
 * SettlementDetails94}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SettlementDetails50
 * SettlementDetails50}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SettlementDetails68", propOrder = {"securitiesTransactionType", "settlementTransactionCondition", "beneficialOwnership", "cCPEligibility", "deliveryReturnReason", "cashClearingSystem", "exposureType",
		"fXStandingInstruction", "marketClientSide", "nettingEligibility", "registration", "legalRestrictions", "settlingCapacity", "taxCapacity", "stampDutyTaxBasis", "tracking", "letterOfGuarantee", "returnLeg",
		"modificationCancellationAllowed", "eligibleForCollateral", "securitiesSubBalanceType", "cashSubBalanceType"})
public class SettlementDetails68 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SctiesTxTp")
	protected SecuritiesTransactionType9Choice securitiesTransactionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType9Choice
	 * SecuritiesTransactionType9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesTransactionType
	 * SecuritiesTrade.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68
	 * SettlementDetails68}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesTxTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTransactionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the type of securities transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmSecuritiesTransactionType
	 * SettlementDetails94.mmSecuritiesTransactionType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#mmSecuritiesTransactionType
	 * SettlementDetails50.mmSecuritiesTransactionType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementDetails68, Optional<SecuritiesTransactionType9Choice>> mmSecuritiesTransactionType = new MMMessageAttribute<SettlementDetails68, Optional<SecuritiesTransactionType9Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmSecuritiesTransactionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails68.mmObject();
			isDerived = false;
			xmlTag = "SctiesTxTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesTransactionType";
			definition = "Identifies the type of securities transaction.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails94.mmSecuritiesTransactionType);
			previousVersion_lazy = () -> SettlementDetails50.mmSecuritiesTransactionType;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SecuritiesTransactionType9Choice.mmObject();
		}

		@Override
		public Optional<SecuritiesTransactionType9Choice> getValue(SettlementDetails68 obj) {
			return obj.getSecuritiesTransactionType();
		}

		@Override
		public void setValue(SettlementDetails68 obj, Optional<SecuritiesTransactionType9Choice> value) {
			obj.setSecuritiesTransactionType(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmTxCond")
	protected List<SettlementTransactionCondition12Choice> settlementTransactionCondition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition12Choice
	 * SettlementTransactionCondition12Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementTransactionCondition
	 * SecuritiesSettlement.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68
	 * SettlementDetails68}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmTxCond"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTransactionCondition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Conditions under which the order/trade is to be settled."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmSettlementTransactionCondition
	 * SettlementDetails94.mmSettlementTransactionCondition}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#mmSettlementTransactionCondition
	 * SettlementDetails50.mmSettlementTransactionCondition}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementDetails68, List<SettlementTransactionCondition12Choice>> mmSettlementTransactionCondition = new MMMessageAttribute<SettlementDetails68, List<SettlementTransactionCondition12Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementTransactionCondition;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails68.mmObject();
			isDerived = false;
			xmlTag = "SttlmTxCond";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTransactionCondition";
			definition = "Conditions under which the order/trade is to be settled.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails94.mmSettlementTransactionCondition);
			previousVersion_lazy = () -> SettlementDetails50.mmSettlementTransactionCondition;
			minOccurs = 0;
			complexType_lazy = () -> SettlementTransactionCondition12Choice.mmObject();
		}

		@Override
		public List<SettlementTransactionCondition12Choice> getValue(SettlementDetails68 obj) {
			return obj.getSettlementTransactionCondition();
		}

		@Override
		public void setValue(SettlementDetails68 obj, List<SettlementTransactionCondition12Choice> value) {
			obj.setSettlementTransactionCondition(value);
		}
	};
	@XmlElement(name = "BnfclOwnrsh")
	protected BeneficialOwnership1Choice beneficialOwnership;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BeneficialOwnership1Choice
	 * BeneficialOwnership1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmBeneficialOwnershipIndicator
	 * SecuritiesSettlement.mmBeneficialOwnershipIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68
	 * SettlementDetails68}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BnfclOwnrsh"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficialOwnership"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether there is change of beneficial ownership."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmBeneficialOwnership
	 * SettlementDetails94.mmBeneficialOwnership}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#mmBeneficialOwnership
	 * SettlementDetails50.mmBeneficialOwnership}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementDetails68, Optional<BeneficialOwnership1Choice>> mmBeneficialOwnership = new MMMessageAttribute<SettlementDetails68, Optional<BeneficialOwnership1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmBeneficialOwnershipIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails68.mmObject();
			isDerived = false;
			xmlTag = "BnfclOwnrsh";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficialOwnership";
			definition = "Specifies whether there is change of beneficial ownership.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails94.mmBeneficialOwnership);
			previousVersion_lazy = () -> SettlementDetails50.mmBeneficialOwnership;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BeneficialOwnership1Choice.mmObject();
		}

		@Override
		public Optional<BeneficialOwnership1Choice> getValue(SettlementDetails68 obj) {
			return obj.getBeneficialOwnership();
		}

		@Override
		public void setValue(SettlementDetails68 obj, Optional<BeneficialOwnership1Choice> value) {
			obj.setBeneficialOwnership(value.orElse(null));
		}
	};
	@XmlElement(name = "CCPElgblty")
	protected CentralCounterPartyEligibility1Choice cCPEligibility;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CentralCounterPartyEligibility1Choice
	 * CentralCounterPartyEligibility1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmCCPEligibility
	 * SecuritiesDeliveryObligation.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68
	 * SettlementDetails68}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CCPElgblty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CCPEligibility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the settlement transaction is CCP (Central Counterparty) eligible."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmCCPEligibility
	 * SettlementDetails94.mmCCPEligibility}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#mmCCPEligibility
	 * SettlementDetails50.mmCCPEligibility}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementDetails68, Optional<CentralCounterPartyEligibility1Choice>> mmCCPEligibility = new MMMessageAttribute<SettlementDetails68, Optional<CentralCounterPartyEligibility1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesDeliveryObligation.mmCCPEligibility;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails68.mmObject();
			isDerived = false;
			xmlTag = "CCPElgblty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CCPEligibility";
			definition = "Specifies whether the settlement transaction is CCP (Central Counterparty) eligible.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails94.mmCCPEligibility);
			previousVersion_lazy = () -> SettlementDetails50.mmCCPEligibility;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CentralCounterPartyEligibility1Choice.mmObject();
		}

		@Override
		public Optional<CentralCounterPartyEligibility1Choice> getValue(SettlementDetails68 obj) {
			return obj.getCCPEligibility();
		}

		@Override
		public void setValue(SettlementDetails68 obj, Optional<CentralCounterPartyEligibility1Choice> value) {
			obj.setCCPEligibility(value.orElse(null));
		}
	};
	@XmlElement(name = "DlvryRtrRsn")
	protected DeliveryReturn1Choice deliveryReturnReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DeliveryReturn1Choice
	 * DeliveryReturn1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmReason
	 * SecuritiesTradeStatus.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68
	 * SettlementDetails68}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvryRtrRsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryReturnReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reason of a delivery return."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmDeliveryReturnReason
	 * SettlementDetails94.mmDeliveryReturnReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#mmDeliveryReturnReason
	 * SettlementDetails50.mmDeliveryReturnReason}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementDetails68, Optional<DeliveryReturn1Choice>> mmDeliveryReturnReason = new MMMessageAttribute<SettlementDetails68, Optional<DeliveryReturn1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails68.mmObject();
			isDerived = false;
			xmlTag = "DlvryRtrRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryReturnReason";
			definition = "Specifies the reason of a delivery return.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails94.mmDeliveryReturnReason);
			previousVersion_lazy = () -> SettlementDetails50.mmDeliveryReturnReason;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DeliveryReturn1Choice.mmObject();
		}

		@Override
		public Optional<DeliveryReturn1Choice> getValue(SettlementDetails68 obj) {
			return obj.getDeliveryReturnReason();
		}

		@Override
		public void setValue(SettlementDetails68 obj, Optional<DeliveryReturn1Choice> value) {
			obj.setDeliveryReturnReason(value.orElse(null));
		}
	};
	@XmlElement(name = "CshClrSys")
	protected CashSettlementSystem1Choice cashClearingSystem;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CashSettlementSystem1Choice
	 * CashSettlementSystem1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SettlementInstructionSystemRole#mmSystem
	 * SettlementInstructionSystemRole.mmSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68
	 * SettlementDetails68}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshClrSys"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the category of cash clearing system, for example, cheque clearing."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmCashClearingSystem
	 * SettlementDetails94.mmCashClearingSystem}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#mmCashClearingSystem
	 * SettlementDetails50.mmCashClearingSystem}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementDetails68, Optional<CashSettlementSystem1Choice>> mmCashClearingSystem = new MMMessageAttribute<SettlementDetails68, Optional<CashSettlementSystem1Choice>>() {
		{
			businessElementTrace_lazy = () -> SettlementInstructionSystemRole.mmSystem;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails68.mmObject();
			isDerived = false;
			xmlTag = "CshClrSys";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystem";
			definition = "Specifies the category of cash clearing system, for example, cheque clearing.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails94.mmCashClearingSystem);
			previousVersion_lazy = () -> SettlementDetails50.mmCashClearingSystem;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CashSettlementSystem1Choice.mmObject();
		}

		@Override
		public Optional<CashSettlementSystem1Choice> getValue(SettlementDetails68 obj) {
			return obj.getCashClearingSystem();
		}

		@Override
		public void setValue(SettlementDetails68 obj, Optional<CashSettlementSystem1Choice> value) {
			obj.setCashClearingSystem(value.orElse(null));
		}
	};
	@XmlElement(name = "XpsrTp")
	protected ExposureType10Choice exposureType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ExposureType10Choice
	 * ExposureType10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExposureTerm#mmExposureType
	 * ExposureTerm.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68
	 * SettlementDetails68}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpsrTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExposureType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the underlying business area/type of trade causing the collateral movement."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmExposureType
	 * SettlementDetails94.mmExposureType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#mmExposureType
	 * SettlementDetails50.mmExposureType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementDetails68, Optional<ExposureType10Choice>> mmExposureType = new MMMessageAttribute<SettlementDetails68, Optional<ExposureType10Choice>>() {
		{
			businessElementTrace_lazy = () -> ExposureTerm.mmExposureType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails68.mmObject();
			isDerived = false;
			xmlTag = "XpsrTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExposureType";
			definition = "Specifies the underlying business area/type of trade causing the collateral movement.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails94.mmExposureType);
			previousVersion_lazy = () -> SettlementDetails50.mmExposureType;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ExposureType10Choice.mmObject();
		}

		@Override
		public Optional<ExposureType10Choice> getValue(SettlementDetails68 obj) {
			return obj.getExposureType();
		}

		@Override
		public void setValue(SettlementDetails68 obj, Optional<ExposureType10Choice> value) {
			obj.setExposureType(value.orElse(null));
		}
	};
	@XmlElement(name = "FxStgInstr")
	protected FXStandingInstruction1Choice fXStandingInstruction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FXStandingInstruction1Choice
	 * FXStandingInstruction1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Settlement#mmStandingSettlementInstruction
	 * Settlement.mmStandingSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68
	 * SettlementDetails68}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FxStgInstr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXStandingInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the forex standing instruction in place should apply."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmFXStandingInstruction
	 * SettlementDetails94.mmFXStandingInstruction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#mmFXStandingInstruction
	 * SettlementDetails50.mmFXStandingInstruction}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementDetails68, Optional<FXStandingInstruction1Choice>> mmFXStandingInstruction = new MMMessageAttribute<SettlementDetails68, Optional<FXStandingInstruction1Choice>>() {
		{
			businessElementTrace_lazy = () -> Settlement.mmStandingSettlementInstruction;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails68.mmObject();
			isDerived = false;
			xmlTag = "FxStgInstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXStandingInstruction";
			definition = "Specifies whether the forex standing instruction in place should apply.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails94.mmFXStandingInstruction);
			previousVersion_lazy = () -> SettlementDetails50.mmFXStandingInstruction;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FXStandingInstruction1Choice.mmObject();
		}

		@Override
		public Optional<FXStandingInstruction1Choice> getValue(SettlementDetails68 obj) {
			return obj.getFXStandingInstruction();
		}

		@Override
		public void setValue(SettlementDetails68 obj, Optional<FXStandingInstruction1Choice> value) {
			obj.setFXStandingInstruction(value.orElse(null));
		}
	};
	@XmlElement(name = "MktClntSd")
	protected MarketClientSide1Choice marketClientSide;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.MarketClientSide1Choice
	 * MarketClientSide1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmMarketClientSide
	 * SecuritiesSettlement.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68
	 * SettlementDetails68}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktClntSd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketClientSide"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if an instruction is for a market side or a client side transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmMarketClientSide
	 * SettlementDetails94.mmMarketClientSide}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#mmMarketClientSide
	 * SettlementDetails50.mmMarketClientSide}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementDetails68, Optional<MarketClientSide1Choice>> mmMarketClientSide = new MMMessageAttribute<SettlementDetails68, Optional<MarketClientSide1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmMarketClientSide;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails68.mmObject();
			isDerived = false;
			xmlTag = "MktClntSd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketClientSide";
			definition = "Specifies if an instruction is for a market side or a client side transaction.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails94.mmMarketClientSide);
			previousVersion_lazy = () -> SettlementDetails50.mmMarketClientSide;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MarketClientSide1Choice.mmObject();
		}

		@Override
		public Optional<MarketClientSide1Choice> getValue(SettlementDetails68 obj) {
			return obj.getMarketClientSide();
		}

		@Override
		public void setValue(SettlementDetails68 obj, Optional<MarketClientSide1Choice> value) {
			obj.setMarketClientSide(value.orElse(null));
		}
	};
	@XmlElement(name = "NetgElgblty")
	protected NettingEligibility1Choice nettingEligibility;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.NettingEligibility1Choice
	 * NettingEligibility1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmNettingEligibility
	 * SecuritiesDeliveryObligation.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68
	 * SettlementDetails68}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetgElgblty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NettingEligibility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the settlement transaction is eligible for netting."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmNettingEligibility
	 * SettlementDetails94.mmNettingEligibility}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#mmNettingEligibility
	 * SettlementDetails50.mmNettingEligibility}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementDetails68, Optional<NettingEligibility1Choice>> mmNettingEligibility = new MMMessageAttribute<SettlementDetails68, Optional<NettingEligibility1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesDeliveryObligation.mmNettingEligibility;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails68.mmObject();
			isDerived = false;
			xmlTag = "NetgElgblty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NettingEligibility";
			definition = "Specifies whether the settlement transaction is eligible for netting.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails94.mmNettingEligibility);
			previousVersion_lazy = () -> SettlementDetails50.mmNettingEligibility;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> NettingEligibility1Choice.mmObject();
		}

		@Override
		public Optional<NettingEligibility1Choice> getValue(SettlementDetails68 obj) {
			return obj.getNettingEligibility();
		}

		@Override
		public void setValue(SettlementDetails68 obj, Optional<NettingEligibility1Choice> value) {
			obj.setNettingEligibility(value.orElse(null));
		}
	};
	@XmlElement(name = "Regn")
	protected Registration1Choice registration;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Registration1Choice
	 * Registration1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmRegistration
	 * Security.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68
	 * SettlementDetails68}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Regn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Registration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether registration should occur upon receipt."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmRegistration
	 * SettlementDetails94.mmRegistration}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#mmRegistration
	 * SettlementDetails50.mmRegistration}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementDetails68, Optional<Registration1Choice>> mmRegistration = new MMMessageAttribute<SettlementDetails68, Optional<Registration1Choice>>() {
		{
			businessElementTrace_lazy = () -> Security.mmRegistration;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails68.mmObject();
			isDerived = false;
			xmlTag = "Regn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Registration";
			definition = "Specifies whether registration should occur upon receipt.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails94.mmRegistration);
			previousVersion_lazy = () -> SettlementDetails50.mmRegistration;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Registration1Choice.mmObject();
		}

		@Override
		public Optional<Registration1Choice> getValue(SettlementDetails68 obj) {
			return obj.getRegistration();
		}

		@Override
		public void setValue(SettlementDetails68 obj, Optional<Registration1Choice> value) {
			obj.setRegistration(value.orElse(null));
		}
	};
	@XmlElement(name = "LglRstrctns")
	protected Restriction1Choice legalRestrictions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Restriction1Choice
	 * Restriction1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmRestriction
	 * Security.mmRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68
	 * SettlementDetails68}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LglRstrctns"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalRestrictions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Regulatory restrictions applicable to a security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmLegalRestrictions
	 * SettlementDetails94.mmLegalRestrictions}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#mmLegalRestrictions
	 * SettlementDetails50.mmLegalRestrictions}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementDetails68, Optional<Restriction1Choice>> mmLegalRestrictions = new MMMessageAttribute<SettlementDetails68, Optional<Restriction1Choice>>() {
		{
			businessElementTrace_lazy = () -> Security.mmRestriction;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails68.mmObject();
			isDerived = false;
			xmlTag = "LglRstrctns";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalRestrictions";
			definition = "Regulatory restrictions applicable to a security.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails94.mmLegalRestrictions);
			previousVersion_lazy = () -> SettlementDetails50.mmLegalRestrictions;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Restriction1Choice.mmObject();
		}

		@Override
		public Optional<Restriction1Choice> getValue(SettlementDetails68 obj) {
			return obj.getLegalRestrictions();
		}

		@Override
		public void setValue(SettlementDetails68 obj, Optional<Restriction1Choice> value) {
			obj.setLegalRestrictions(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlgCpcty")
	protected SettlingCapacity4Choice settlingCapacity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SettlingCapacity4Choice
	 * SettlingCapacity4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole#mmSettlingCapacity
	 * SecuritiesSettlementPartyRole.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68
	 * SettlementDetails68}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlgCpcty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlingCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Role of a party in the settlement of the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmSettlingCapacity
	 * SettlementDetails94.mmSettlingCapacity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#mmSettlingCapacity
	 * SettlementDetails50.mmSettlingCapacity}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementDetails68, Optional<SettlingCapacity4Choice>> mmSettlingCapacity = new MMMessageAttribute<SettlementDetails68, Optional<SettlingCapacity4Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlementPartyRole.mmSettlingCapacity;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails68.mmObject();
			isDerived = false;
			xmlTag = "SttlgCpcty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlingCapacity";
			definition = "Role of a party in the settlement of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails94.mmSettlingCapacity);
			previousVersion_lazy = () -> SettlementDetails50.mmSettlingCapacity;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlingCapacity4Choice.mmObject();
		}

		@Override
		public Optional<SettlingCapacity4Choice> getValue(SettlementDetails68 obj) {
			return obj.getSettlingCapacity();
		}

		@Override
		public void setValue(SettlementDetails68 obj, Optional<SettlingCapacity4Choice> value) {
			obj.setSettlingCapacity(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxCpcty")
	protected TaxCapacityParty1Choice taxCapacity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TaxCapacityParty1Choice
	 * TaxCapacityParty1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole#mmTaxCapacity
	 * SecuritiesSettlementPartyRole.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68
	 * SettlementDetails68}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxCpcty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax role capacity of the instructing party."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmTaxCapacity
	 * SettlementDetails94.mmTaxCapacity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#mmTaxCapacity
	 * SettlementDetails50.mmTaxCapacity}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementDetails68, Optional<TaxCapacityParty1Choice>> mmTaxCapacity = new MMMessageAttribute<SettlementDetails68, Optional<TaxCapacityParty1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlementPartyRole.mmTaxCapacity;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails68.mmObject();
			isDerived = false;
			xmlTag = "TaxCpcty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCapacity";
			definition = "Tax role capacity of the instructing party.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails94.mmTaxCapacity);
			previousVersion_lazy = () -> SettlementDetails50.mmTaxCapacity;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TaxCapacityParty1Choice.mmObject();
		}

		@Override
		public Optional<TaxCapacityParty1Choice> getValue(SettlementDetails68 obj) {
			return obj.getTaxCapacity();
		}

		@Override
		public void setValue(SettlementDetails68 obj, Optional<TaxCapacityParty1Choice> value) {
			obj.setTaxCapacity(value.orElse(null));
		}
	};
	@XmlElement(name = "StmpDtyTaxBsis")
	protected GenericIdentification20 stampDutyTaxBasis;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification20
	 * GenericIdentification20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmStampDutyTaxBasis
	 * SecuritiesTax.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68
	 * SettlementDetails68}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmpDtyTaxBsis"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StampDutyTaxBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the stamp duty type or exemption reason applicable to the settlement transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmStampDutyTaxBasis
	 * SettlementDetails94.mmStampDutyTaxBasis}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#mmStampDutyTaxBasis
	 * SettlementDetails50.mmStampDutyTaxBasis}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementDetails68, Optional<GenericIdentification20>> mmStampDutyTaxBasis = new MMMessageAttribute<SettlementDetails68, Optional<GenericIdentification20>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmStampDutyTaxBasis;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails68.mmObject();
			isDerived = false;
			xmlTag = "StmpDtyTaxBsis";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StampDutyTaxBasis";
			definition = "Specifies the stamp duty type or exemption reason applicable to the settlement transaction.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails94.mmStampDutyTaxBasis);
			previousVersion_lazy = () -> SettlementDetails50.mmStampDutyTaxBasis;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> GenericIdentification20.mmObject();
		}

		@Override
		public Optional<GenericIdentification20> getValue(SettlementDetails68 obj) {
			return obj.getStampDutyTaxBasis();
		}

		@Override
		public void setValue(SettlementDetails68 obj, Optional<GenericIdentification20> value) {
			obj.setStampDutyTaxBasis(value.orElse(null));
		}
	};
	@XmlElement(name = "Trckg")
	protected Tracking1Choice tracking;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Tracking1Choice
	 * Tracking1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmTracking
	 * SecuritiesSettlement.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68
	 * SettlementDetails68}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Trckg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tracking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether the loan and/or collateral is tracked."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmTracking
	 * SettlementDetails94.mmTracking}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#mmTracking
	 * SettlementDetails50.mmTracking}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementDetails68, Optional<Tracking1Choice>> mmTracking = new MMMessageAttribute<SettlementDetails68, Optional<Tracking1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmTracking;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails68.mmObject();
			isDerived = false;
			xmlTag = "Trckg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tracking";
			definition = "Specifies whether the loan and/or collateral is tracked.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails94.mmTracking);
			previousVersion_lazy = () -> SettlementDetails50.mmTracking;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Tracking1Choice.mmObject();
		}

		@Override
		public Optional<Tracking1Choice> getValue(SettlementDetails68 obj) {
			return obj.getTracking();
		}

		@Override
		public void setValue(SettlementDetails68 obj, Optional<Tracking1Choice> value) {
			obj.setTracking(value.orElse(null));
		}
	};
	@XmlElement(name = "LttrOfGrnt")
	protected LetterOfGuarantee1Choice letterOfGuarantee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.LetterOfGuarantee1Choice
	 * LetterOfGuarantee1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmLetterOfGuarantee
	 * SecuritiesSettlement.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68
	 * SettlementDetails68}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LttrOfGrnt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterOfGuarantee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether physical settlement may be executed using a letter of guarantee or if the physical certificates should be used."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmLetterOfGuarantee
	 * SettlementDetails94.mmLetterOfGuarantee}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#mmLetterOfGuarantee
	 * SettlementDetails50.mmLetterOfGuarantee}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementDetails68, Optional<LetterOfGuarantee1Choice>> mmLetterOfGuarantee = new MMMessageAttribute<SettlementDetails68, Optional<LetterOfGuarantee1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmLetterOfGuarantee;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails68.mmObject();
			isDerived = false;
			xmlTag = "LttrOfGrnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LetterOfGuarantee";
			definition = "Specifies whether physical settlement may be executed using a letter of guarantee or if the physical certificates should be used.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails94.mmLetterOfGuarantee);
			previousVersion_lazy = () -> SettlementDetails50.mmLetterOfGuarantee;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> LetterOfGuarantee1Choice.mmObject();
		}

		@Override
		public Optional<LetterOfGuarantee1Choice> getValue(SettlementDetails68 obj) {
			return obj.getLetterOfGuarantee();
		}

		@Override
		public void setValue(SettlementDetails68 obj, Optional<LetterOfGuarantee1Choice> value) {
			obj.setLetterOfGuarantee(value.orElse(null));
		}
	};
	@XmlElement(name = "RtrLeg")
	protected YesNoIndicator returnLeg;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmReturnLegInstruction
	 * SecuritiesFinancing.mmReturnLegInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68
	 * SettlementDetails68}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RtrLeg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnLeg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether, for a securities lending/borrowing settlement transaction, the lender will instruct the return leg as agreed with the borrower."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmReturnLeg
	 * SettlementDetails94.mmReturnLeg}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#mmReturnLeg
	 * SettlementDetails50.mmReturnLeg}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementDetails68, Optional<YesNoIndicator>> mmReturnLeg = new MMMessageAttribute<SettlementDetails68, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmReturnLegInstruction;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails68.mmObject();
			isDerived = false;
			xmlTag = "RtrLeg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnLeg";
			definition = "Specifies whether, for a securities lending/borrowing settlement transaction, the lender will instruct the return leg as agreed with the borrower.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails94.mmReturnLeg);
			previousVersion_lazy = () -> SettlementDetails50.mmReturnLeg;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SettlementDetails68 obj) {
			return obj.getReturnLeg();
		}

		@Override
		public void setValue(SettlementDetails68 obj, Optional<YesNoIndicator> value) {
			obj.setReturnLeg(value.orElse(null));
		}
	};
	@XmlElement(name = "ModCxlAllwd")
	protected ModificationCancellationAllowed1Choice modificationCancellationAllowed;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ModificationCancellationAllowed1Choice
	 * ModificationCancellationAllowed1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68
	 * SettlementDetails68}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModCxlAllwd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModificationCancellationAllowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether a third party is allowed to modify or cancel the transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmModificationCancellationAllowed
	 * SettlementDetails94.mmModificationCancellationAllowed}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#mmModificationCancellationAllowed
	 * SettlementDetails50.mmModificationCancellationAllowed}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementDetails68, Optional<ModificationCancellationAllowed1Choice>> mmModificationCancellationAllowed = new MMMessageAttribute<SettlementDetails68, Optional<ModificationCancellationAllowed1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails68.mmObject();
			isDerived = false;
			xmlTag = "ModCxlAllwd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModificationCancellationAllowed";
			definition = "Specifies whether a third party is allowed to modify or cancel the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails94.mmModificationCancellationAllowed);
			previousVersion_lazy = () -> SettlementDetails50.mmModificationCancellationAllowed;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ModificationCancellationAllowed1Choice.mmObject();
		}

		@Override
		public Optional<ModificationCancellationAllowed1Choice> getValue(SettlementDetails68 obj) {
			return obj.getModificationCancellationAllowed();
		}

		@Override
		public void setValue(SettlementDetails68 obj, Optional<ModificationCancellationAllowed1Choice> value) {
			obj.setModificationCancellationAllowed(value.orElse(null));
		}
	};
	@XmlElement(name = "ElgblForColl")
	protected YesNoIndicator eligibleForCollateral;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmEligibleForCollateral
	 * SecuritiesSettlement.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68
	 * SettlementDetails68}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElgblForColl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibleForCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether securities should be included in the pool of securities eligible for collateral purposes."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmEligibleForCollateral
	 * SettlementDetails94.mmEligibleForCollateral}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#mmEligibleForCollateral
	 * SettlementDetails50.mmEligibleForCollateral}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementDetails68, Optional<YesNoIndicator>> mmEligibleForCollateral = new MMMessageAttribute<SettlementDetails68, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmEligibleForCollateral;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails68.mmObject();
			isDerived = false;
			xmlTag = "ElgblForColl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EligibleForCollateral";
			definition = "Specifies whether securities should be included in the pool of securities eligible for collateral purposes.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails94.mmEligibleForCollateral);
			previousVersion_lazy = () -> SettlementDetails50.mmEligibleForCollateral;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SettlementDetails68 obj) {
			return obj.getEligibleForCollateral();
		}

		@Override
		public void setValue(SettlementDetails68 obj, Optional<YesNoIndicator> value) {
			obj.setEligibleForCollateral(value.orElse(null));
		}
	};
	@XmlElement(name = "SctiesSubBalTp")
	protected GenericIdentification20 securitiesSubBalanceType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification20
	 * GenericIdentification20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Balance#mmType
	 * Balance.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68
	 * SettlementDetails68}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesSubBalTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSubBalanceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the securities sub balance type indicator (example restriction type for a market infrastructure)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmSecuritiesSubBalanceType
	 * SettlementDetails94.mmSecuritiesSubBalanceType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#mmSecuritiesSubBalanceType
	 * SettlementDetails50.mmSecuritiesSubBalanceType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementDetails68, Optional<GenericIdentification20>> mmSecuritiesSubBalanceType = new MMMessageAttribute<SettlementDetails68, Optional<GenericIdentification20>>() {
		{
			businessElementTrace_lazy = () -> Balance.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails68.mmObject();
			isDerived = false;
			xmlTag = "SctiesSubBalTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSubBalanceType";
			definition = "Specifies the securities sub balance type indicator (example restriction type for a market infrastructure).";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails94.mmSecuritiesSubBalanceType);
			previousVersion_lazy = () -> SettlementDetails50.mmSecuritiesSubBalanceType;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> GenericIdentification20.mmObject();
		}

		@Override
		public Optional<GenericIdentification20> getValue(SettlementDetails68 obj) {
			return obj.getSecuritiesSubBalanceType();
		}

		@Override
		public void setValue(SettlementDetails68 obj, Optional<GenericIdentification20> value) {
			obj.setSecuritiesSubBalanceType(value.orElse(null));
		}
	};
	@XmlElement(name = "CshSubBalTp")
	protected GenericIdentification20 cashSubBalanceType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification20
	 * GenericIdentification20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Balance#mmType
	 * Balance.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68
	 * SettlementDetails68}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshSubBalTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSubBalanceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the cash sub balance type indicator (example restriction type for a market infrastructure)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmCashSubBalanceType
	 * SettlementDetails94.mmCashSubBalanceType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#mmCashSubBalanceType
	 * SettlementDetails50.mmCashSubBalanceType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementDetails68, Optional<GenericIdentification20>> mmCashSubBalanceType = new MMMessageAttribute<SettlementDetails68, Optional<GenericIdentification20>>() {
		{
			businessElementTrace_lazy = () -> Balance.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails68.mmObject();
			isDerived = false;
			xmlTag = "CshSubBalTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSubBalanceType";
			definition = "Specifies the cash sub balance type indicator (example restriction type for a market infrastructure).";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails94.mmCashSubBalanceType);
			previousVersion_lazy = () -> SettlementDetails50.mmCashSubBalanceType;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> GenericIdentification20.mmObject();
		}

		@Override
		public Optional<GenericIdentification20> getValue(SettlementDetails68 obj) {
			return obj.getCashSubBalanceType();
		}

		@Override
		public void setValue(SettlementDetails68 obj, Optional<GenericIdentification20> value) {
			obj.setCashSubBalanceType(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDetails68.mmSecuritiesTransactionType, com.tools20022.repository.msg.SettlementDetails68.mmSettlementTransactionCondition,
						com.tools20022.repository.msg.SettlementDetails68.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails68.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails68.mmDeliveryReturnReason,
						com.tools20022.repository.msg.SettlementDetails68.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails68.mmExposureType, com.tools20022.repository.msg.SettlementDetails68.mmFXStandingInstruction,
						com.tools20022.repository.msg.SettlementDetails68.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails68.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails68.mmRegistration,
						com.tools20022.repository.msg.SettlementDetails68.mmLegalRestrictions, com.tools20022.repository.msg.SettlementDetails68.mmSettlingCapacity, com.tools20022.repository.msg.SettlementDetails68.mmTaxCapacity,
						com.tools20022.repository.msg.SettlementDetails68.mmStampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails68.mmTracking, com.tools20022.repository.msg.SettlementDetails68.mmLetterOfGuarantee,
						com.tools20022.repository.msg.SettlementDetails68.mmReturnLeg, com.tools20022.repository.msg.SettlementDetails68.mmModificationCancellationAllowed,
						com.tools20022.repository.msg.SettlementDetails68.mmEligibleForCollateral, com.tools20022.repository.msg.SettlementDetails68.mmSecuritiesSubBalanceType,
						com.tools20022.repository.msg.SettlementDetails68.mmCashSubBalanceType);
				trace_lazy = () -> SecuritiesSettlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementDetailsElementsUsageRule.forSettlementDetails68,
						com.tools20022.repository.constraints.ConstraintCashSettlementSystemUsageRule.forSettlementDetails68, com.tools20022.repository.constraints.ConstraintOpeningClosingUsageRule.forSettlementDetails68);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementDetails68";
				definition = "Details of settlement of a transaction.";
				nextVersions_lazy = () -> Arrays.asList(SettlementDetails94.mmObject());
				previousVersion_lazy = () -> SettlementDetails50.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<SecuritiesTransactionType9Choice> getSecuritiesTransactionType() {
		return securitiesTransactionType == null ? Optional.empty() : Optional.of(securitiesTransactionType);
	}

	public SettlementDetails68 setSecuritiesTransactionType(SecuritiesTransactionType9Choice securitiesTransactionType) {
		this.securitiesTransactionType = securitiesTransactionType;
		return this;
	}

	public List<SettlementTransactionCondition12Choice> getSettlementTransactionCondition() {
		return settlementTransactionCondition == null ? settlementTransactionCondition = new ArrayList<>() : settlementTransactionCondition;
	}

	public SettlementDetails68 setSettlementTransactionCondition(List<SettlementTransactionCondition12Choice> settlementTransactionCondition) {
		this.settlementTransactionCondition = Objects.requireNonNull(settlementTransactionCondition);
		return this;
	}

	public Optional<BeneficialOwnership1Choice> getBeneficialOwnership() {
		return beneficialOwnership == null ? Optional.empty() : Optional.of(beneficialOwnership);
	}

	public SettlementDetails68 setBeneficialOwnership(BeneficialOwnership1Choice beneficialOwnership) {
		this.beneficialOwnership = beneficialOwnership;
		return this;
	}

	public Optional<CentralCounterPartyEligibility1Choice> getCCPEligibility() {
		return cCPEligibility == null ? Optional.empty() : Optional.of(cCPEligibility);
	}

	public SettlementDetails68 setCCPEligibility(CentralCounterPartyEligibility1Choice cCPEligibility) {
		this.cCPEligibility = cCPEligibility;
		return this;
	}

	public Optional<DeliveryReturn1Choice> getDeliveryReturnReason() {
		return deliveryReturnReason == null ? Optional.empty() : Optional.of(deliveryReturnReason);
	}

	public SettlementDetails68 setDeliveryReturnReason(DeliveryReturn1Choice deliveryReturnReason) {
		this.deliveryReturnReason = deliveryReturnReason;
		return this;
	}

	public Optional<CashSettlementSystem1Choice> getCashClearingSystem() {
		return cashClearingSystem == null ? Optional.empty() : Optional.of(cashClearingSystem);
	}

	public SettlementDetails68 setCashClearingSystem(CashSettlementSystem1Choice cashClearingSystem) {
		this.cashClearingSystem = cashClearingSystem;
		return this;
	}

	public Optional<ExposureType10Choice> getExposureType() {
		return exposureType == null ? Optional.empty() : Optional.of(exposureType);
	}

	public SettlementDetails68 setExposureType(ExposureType10Choice exposureType) {
		this.exposureType = exposureType;
		return this;
	}

	public Optional<FXStandingInstruction1Choice> getFXStandingInstruction() {
		return fXStandingInstruction == null ? Optional.empty() : Optional.of(fXStandingInstruction);
	}

	public SettlementDetails68 setFXStandingInstruction(FXStandingInstruction1Choice fXStandingInstruction) {
		this.fXStandingInstruction = fXStandingInstruction;
		return this;
	}

	public Optional<MarketClientSide1Choice> getMarketClientSide() {
		return marketClientSide == null ? Optional.empty() : Optional.of(marketClientSide);
	}

	public SettlementDetails68 setMarketClientSide(MarketClientSide1Choice marketClientSide) {
		this.marketClientSide = marketClientSide;
		return this;
	}

	public Optional<NettingEligibility1Choice> getNettingEligibility() {
		return nettingEligibility == null ? Optional.empty() : Optional.of(nettingEligibility);
	}

	public SettlementDetails68 setNettingEligibility(NettingEligibility1Choice nettingEligibility) {
		this.nettingEligibility = nettingEligibility;
		return this;
	}

	public Optional<Registration1Choice> getRegistration() {
		return registration == null ? Optional.empty() : Optional.of(registration);
	}

	public SettlementDetails68 setRegistration(Registration1Choice registration) {
		this.registration = registration;
		return this;
	}

	public Optional<Restriction1Choice> getLegalRestrictions() {
		return legalRestrictions == null ? Optional.empty() : Optional.of(legalRestrictions);
	}

	public SettlementDetails68 setLegalRestrictions(Restriction1Choice legalRestrictions) {
		this.legalRestrictions = legalRestrictions;
		return this;
	}

	public Optional<SettlingCapacity4Choice> getSettlingCapacity() {
		return settlingCapacity == null ? Optional.empty() : Optional.of(settlingCapacity);
	}

	public SettlementDetails68 setSettlingCapacity(SettlingCapacity4Choice settlingCapacity) {
		this.settlingCapacity = settlingCapacity;
		return this;
	}

	public Optional<TaxCapacityParty1Choice> getTaxCapacity() {
		return taxCapacity == null ? Optional.empty() : Optional.of(taxCapacity);
	}

	public SettlementDetails68 setTaxCapacity(TaxCapacityParty1Choice taxCapacity) {
		this.taxCapacity = taxCapacity;
		return this;
	}

	public Optional<GenericIdentification20> getStampDutyTaxBasis() {
		return stampDutyTaxBasis == null ? Optional.empty() : Optional.of(stampDutyTaxBasis);
	}

	public SettlementDetails68 setStampDutyTaxBasis(GenericIdentification20 stampDutyTaxBasis) {
		this.stampDutyTaxBasis = stampDutyTaxBasis;
		return this;
	}

	public Optional<Tracking1Choice> getTracking() {
		return tracking == null ? Optional.empty() : Optional.of(tracking);
	}

	public SettlementDetails68 setTracking(Tracking1Choice tracking) {
		this.tracking = tracking;
		return this;
	}

	public Optional<LetterOfGuarantee1Choice> getLetterOfGuarantee() {
		return letterOfGuarantee == null ? Optional.empty() : Optional.of(letterOfGuarantee);
	}

	public SettlementDetails68 setLetterOfGuarantee(LetterOfGuarantee1Choice letterOfGuarantee) {
		this.letterOfGuarantee = letterOfGuarantee;
		return this;
	}

	public Optional<YesNoIndicator> getReturnLeg() {
		return returnLeg == null ? Optional.empty() : Optional.of(returnLeg);
	}

	public SettlementDetails68 setReturnLeg(YesNoIndicator returnLeg) {
		this.returnLeg = returnLeg;
		return this;
	}

	public Optional<ModificationCancellationAllowed1Choice> getModificationCancellationAllowed() {
		return modificationCancellationAllowed == null ? Optional.empty() : Optional.of(modificationCancellationAllowed);
	}

	public SettlementDetails68 setModificationCancellationAllowed(ModificationCancellationAllowed1Choice modificationCancellationAllowed) {
		this.modificationCancellationAllowed = modificationCancellationAllowed;
		return this;
	}

	public Optional<YesNoIndicator> getEligibleForCollateral() {
		return eligibleForCollateral == null ? Optional.empty() : Optional.of(eligibleForCollateral);
	}

	public SettlementDetails68 setEligibleForCollateral(YesNoIndicator eligibleForCollateral) {
		this.eligibleForCollateral = eligibleForCollateral;
		return this;
	}

	public Optional<GenericIdentification20> getSecuritiesSubBalanceType() {
		return securitiesSubBalanceType == null ? Optional.empty() : Optional.of(securitiesSubBalanceType);
	}

	public SettlementDetails68 setSecuritiesSubBalanceType(GenericIdentification20 securitiesSubBalanceType) {
		this.securitiesSubBalanceType = securitiesSubBalanceType;
		return this;
	}

	public Optional<GenericIdentification20> getCashSubBalanceType() {
		return cashSubBalanceType == null ? Optional.empty() : Optional.of(cashSubBalanceType);
	}

	public SettlementDetails68 setCashSubBalanceType(GenericIdentification20 cashSubBalanceType) {
		this.cashSubBalanceType = cashSubBalanceType;
		return this;
	}
}