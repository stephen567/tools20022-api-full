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
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.codeset.HoldingsPlanType1Code;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAnd13DecimalAmount;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.FinancialInstrument13;
import com.tools20022.repository.msg.FinancialInstrumentQuantity1;
import com.tools20022.repository.msg.Unit3;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Completion of a securities settlement instruction, wherein securities are
 * delivered/debited from a securities account and received/credited to the
 * designated securities account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer17#mmEffectiveTransferDate
 * Transfer17.mmEffectiveTransferDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer17#mmTradeDate
 * Transfer17.mmTradeDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer17#mmHoldingsPlanType
 * Transfer17.mmHoldingsPlanType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer17#mmFinancialInstrumentDetails
 * Transfer17.mmFinancialInstrumentDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer17#mmTotalUnitsNumber
 * Transfer17.mmTotalUnitsNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer17#mmUnitsDetails
 * Transfer17.mmUnitsDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer17#mmAveragePrice
 * Transfer17.mmAveragePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer17#mmOwnAccountTransferIndicator
 * Transfer17.mmOwnAccountTransferIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer17#mmNonStandardSettlementInformation
 * Transfer17.mmNonStandardSettlementInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
 * SecuritiesTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Transfer17"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Completion of a securities settlement instruction, wherein securities are delivered/debited from a securities account and received/credited to the designated securities account."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalUnitsNumberRule#forTransfer17
 * ConstraintTotalUnitsNumberRule.forTransfer17}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer25 Transfer25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer18 Transfer18}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Transfer7
 * Transfer7}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Transfer17", propOrder = {"effectiveTransferDate", "tradeDate", "holdingsPlanType", "financialInstrumentDetails", "totalUnitsNumber", "unitsDetails", "averagePrice", "ownAccountTransferIndicator",
		"nonStandardSettlementInformation"})
public class Transfer17 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FctvTrfDt", required = true)
	protected DateAndDateTimeChoice effectiveTransferDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment#mmDate
	 * ObligationFulfilment.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer17
	 * Transfer17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FctvTrfDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveTransferDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the transfer was executed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Transfer17, DateAndDateTimeChoice> mmEffectiveTransferDate = new MMMessageAttribute<Transfer17, DateAndDateTimeChoice>() {
		{
			businessElementTrace_lazy = () -> ObligationFulfilment.mmDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer17.mmObject();
			isDerived = false;
			xmlTag = "FctvTrfDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveTransferDate";
			definition = "Date and time at which the transfer was executed.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public DateAndDateTimeChoice getValue(Transfer17 obj) {
			return obj.getEffectiveTransferDate();
		}

		@Override
		public void setValue(Transfer17 obj, DateAndDateTimeChoice value) {
			obj.setEffectiveTransferDate(value);
		}
	};
	@XmlElement(name = "TradDt")
	protected DateAndDateTimeChoice tradeDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeDateTime
	 * Trade.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer17
	 * Transfer17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which a transaction is completed and cleared, ie, securities are delivered."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Transfer17, Optional<DateAndDateTimeChoice>> mmTradeDate = new MMMessageAttribute<Transfer17, Optional<DateAndDateTimeChoice>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer17.mmObject();
			isDerived = false;
			xmlTag = "TradDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "Date and time at which a transaction is completed and cleared, ie, securities are delivered.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeChoice> getValue(Transfer17 obj) {
			return obj.getTradeDate();
		}

		@Override
		public void setValue(Transfer17 obj, Optional<DateAndDateTimeChoice> value) {
			obj.setTradeDate(value.orElse(null));
		}
	};
	@XmlElement(name = "HldgsPlanTp")
	protected List<HoldingsPlanType1Code> holdingsPlanType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingsPlanType1Code
	 * HoldingsPlanType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmHoldingsPlanType
	 * SecuritiesSettlement.mmHoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer17
	 * Transfer17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HldgsPlanTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingsPlanType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies whether or not saving plan or withdrawal or switch plan are included in the holdings."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Transfer17, List<HoldingsPlanType1Code>> mmHoldingsPlanType = new MMMessageAttribute<Transfer17, List<HoldingsPlanType1Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmHoldingsPlanType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer17.mmObject();
			isDerived = false;
			xmlTag = "HldgsPlanTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingsPlanType";
			definition = "Identifies whether or not saving plan or withdrawal or switch plan are included in the holdings.";
			maxOccurs = 3;
			minOccurs = 0;
			simpleType_lazy = () -> HoldingsPlanType1Code.mmObject();
		}

		@Override
		public List<HoldingsPlanType1Code> getValue(Transfer17 obj) {
			return obj.getHoldingsPlanType();
		}

		@Override
		public void setValue(Transfer17 obj, List<HoldingsPlanType1Code> value) {
			obj.setHoldingsPlanType(value);
		}
	};
	@XmlElement(name = "FinInstrmDtls", required = true)
	protected FinancialInstrument13 financialInstrumentDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument13
	 * FinancialInstrument13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer17
	 * Transfer17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to the financial instrument received."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Transfer17, FinancialInstrument13> mmFinancialInstrumentDetails = new MMMessageAttribute<Transfer17, FinancialInstrument13>() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundClass.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer17.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentDetails";
			definition = "Information related to the financial instrument received.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> FinancialInstrument13.mmObject();
		}

		@Override
		public FinancialInstrument13 getValue(Transfer17 obj) {
			return obj.getFinancialInstrumentDetails();
		}

		@Override
		public void setValue(Transfer17 obj, FinancialInstrument13 value) {
			obj.setFinancialInstrumentDetails(value);
		}
	};
	@XmlElement(name = "TtlUnitsNb", required = true)
	protected FinancialInstrumentQuantity1 totalUnitsNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity1
	 * FinancialInstrumentQuantity1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferredQuantity
	 * SecuritiesTransfer.mmTransferredQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer17
	 * Transfer17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlUnitsNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalUnitsNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total quantity of securities settled."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Transfer17, FinancialInstrumentQuantity1> mmTotalUnitsNumber = new MMMessageAttribute<Transfer17, FinancialInstrumentQuantity1>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmTransferredQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer17.mmObject();
			isDerived = false;
			xmlTag = "TtlUnitsNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalUnitsNumber";
			definition = "Total quantity of securities settled.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> FinancialInstrumentQuantity1.mmObject();
		}

		@Override
		public FinancialInstrumentQuantity1 getValue(Transfer17 obj) {
			return obj.getTotalUnitsNumber();
		}

		@Override
		public void setValue(Transfer17 obj, FinancialInstrumentQuantity1 value) {
			obj.setTotalUnitsNumber(value);
		}
	};
	@XmlElement(name = "UnitsDtls")
	protected List<Unit3> unitsDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Unit3 Unit3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferredQuantity
	 * SecuritiesTransfer.mmTransferredQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer17
	 * Transfer17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnitsDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitsDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about the units to be transferred."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Transfer17, List<Unit3>> mmUnitsDetails = new MMMessageAssociationEnd<Transfer17, List<Unit3>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmTransferredQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer17.mmObject();
			isDerived = false;
			xmlTag = "UnitsDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitsDetails";
			definition = "Information about the units to be transferred.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Unit3.mmObject();
		}

		@Override
		public List<Unit3> getValue(Transfer17 obj) {
			return obj.getUnitsDetails();
		}

		@Override
		public void setValue(Transfer17 obj, List<Unit3> value) {
			obj.setUnitsDetails(value);
		}
	};
	@XmlElement(name = "AvrgPric")
	protected ActiveOrHistoricCurrencyAnd13DecimalAmount averagePrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAnd13DecimalAmount
	 * ActiveOrHistoricCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmBookValue
	 * AssetHolding.mmBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer17
	 * Transfer17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AvrgPric"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AveragePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of a security, as booked in an account. Book value is often different from the current market value of the security."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Transfer17, Optional<ActiveOrHistoricCurrencyAnd13DecimalAmount>> mmAveragePrice = new MMMessageAttribute<Transfer17, Optional<ActiveOrHistoricCurrencyAnd13DecimalAmount>>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmBookValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer17.mmObject();
			isDerived = false;
			xmlTag = "AvrgPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AveragePrice";
			definition = "Value of a security, as booked in an account. Book value is often different from the current market value of the security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAnd13DecimalAmount.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyAnd13DecimalAmount> getValue(Transfer17 obj) {
			return obj.getAveragePrice();
		}

		@Override
		public void setValue(Transfer17 obj, Optional<ActiveOrHistoricCurrencyAnd13DecimalAmount> value) {
			obj.setAveragePrice(value.orElse(null));
		}
	};
	@XmlElement(name = "OwnAcctTrfInd")
	protected YesNoIndicator ownAccountTransferIndicator;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmOwnAccountTransferIndicator
	 * SecuritiesTransfer.mmOwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer17
	 * Transfer17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OwnAcctTrfInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OwnAccountTransferIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the transfer results in a change of beneficial owner."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Transfer17, Optional<YesNoIndicator>> mmOwnAccountTransferIndicator = new MMMessageAttribute<Transfer17, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmOwnAccountTransferIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer17.mmObject();
			isDerived = false;
			xmlTag = "OwnAcctTrfInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OwnAccountTransferIndicator";
			definition = "Indicates whether the transfer results in a change of beneficial owner.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(Transfer17 obj) {
			return obj.getOwnAccountTransferIndicator();
		}

		@Override
		public void setValue(Transfer17 obj, Optional<YesNoIndicator> value) {
			obj.setOwnAccountTransferIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "NonStdSttlmInf")
	protected Max350Text nonStandardSettlementInformation;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmNonStandardSettlementInformation
	 * InvestmentFundOrderExecution.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer17
	 * Transfer17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonStdSttlmInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonStandardSettlementInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional specific settlement information for non-regulated traded funds."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Transfer17, Optional<Max350Text>> mmNonStandardSettlementInformation = new MMMessageAttribute<Transfer17, Optional<Max350Text>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmNonStandardSettlementInformation;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer17.mmObject();
			isDerived = false;
			xmlTag = "NonStdSttlmInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonStandardSettlementInformation";
			definition = "Additional specific settlement information for non-regulated traded funds.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(Transfer17 obj) {
			return obj.getNonStandardSettlementInformation();
		}

		@Override
		public void setValue(Transfer17 obj, Optional<Max350Text> value) {
			obj.setNonStandardSettlementInformation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Transfer17.mmEffectiveTransferDate, com.tools20022.repository.msg.Transfer17.mmTradeDate, com.tools20022.repository.msg.Transfer17.mmHoldingsPlanType,
						com.tools20022.repository.msg.Transfer17.mmFinancialInstrumentDetails, com.tools20022.repository.msg.Transfer17.mmTotalUnitsNumber, com.tools20022.repository.msg.Transfer17.mmUnitsDetails,
						com.tools20022.repository.msg.Transfer17.mmAveragePrice, com.tools20022.repository.msg.Transfer17.mmOwnAccountTransferIndicator, com.tools20022.repository.msg.Transfer17.mmNonStandardSettlementInformation);
				trace_lazy = () -> SecuritiesTransfer.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTotalUnitsNumberRule.forTransfer17);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Transfer17";
				definition = "Completion of a securities settlement instruction, wherein securities are delivered/debited from a securities account and received/credited to the designated securities account.";
				nextVersions_lazy = () -> Arrays.asList(Transfer25.mmObject(), Transfer18.mmObject());
				previousVersion_lazy = () -> Transfer7.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public DateAndDateTimeChoice getEffectiveTransferDate() {
		return effectiveTransferDate;
	}

	public Transfer17 setEffectiveTransferDate(DateAndDateTimeChoice effectiveTransferDate) {
		this.effectiveTransferDate = Objects.requireNonNull(effectiveTransferDate);
		return this;
	}

	public Optional<DateAndDateTimeChoice> getTradeDate() {
		return tradeDate == null ? Optional.empty() : Optional.of(tradeDate);
	}

	public Transfer17 setTradeDate(DateAndDateTimeChoice tradeDate) {
		this.tradeDate = tradeDate;
		return this;
	}

	public List<HoldingsPlanType1Code> getHoldingsPlanType() {
		return holdingsPlanType == null ? holdingsPlanType = new ArrayList<>() : holdingsPlanType;
	}

	public Transfer17 setHoldingsPlanType(List<HoldingsPlanType1Code> holdingsPlanType) {
		this.holdingsPlanType = Objects.requireNonNull(holdingsPlanType);
		return this;
	}

	public FinancialInstrument13 getFinancialInstrumentDetails() {
		return financialInstrumentDetails;
	}

	public Transfer17 setFinancialInstrumentDetails(FinancialInstrument13 financialInstrumentDetails) {
		this.financialInstrumentDetails = Objects.requireNonNull(financialInstrumentDetails);
		return this;
	}

	public FinancialInstrumentQuantity1 getTotalUnitsNumber() {
		return totalUnitsNumber;
	}

	public Transfer17 setTotalUnitsNumber(FinancialInstrumentQuantity1 totalUnitsNumber) {
		this.totalUnitsNumber = Objects.requireNonNull(totalUnitsNumber);
		return this;
	}

	public List<Unit3> getUnitsDetails() {
		return unitsDetails == null ? unitsDetails = new ArrayList<>() : unitsDetails;
	}

	public Transfer17 setUnitsDetails(List<Unit3> unitsDetails) {
		this.unitsDetails = Objects.requireNonNull(unitsDetails);
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAnd13DecimalAmount> getAveragePrice() {
		return averagePrice == null ? Optional.empty() : Optional.of(averagePrice);
	}

	public Transfer17 setAveragePrice(ActiveOrHistoricCurrencyAnd13DecimalAmount averagePrice) {
		this.averagePrice = averagePrice;
		return this;
	}

	public Optional<YesNoIndicator> getOwnAccountTransferIndicator() {
		return ownAccountTransferIndicator == null ? Optional.empty() : Optional.of(ownAccountTransferIndicator);
	}

	public Transfer17 setOwnAccountTransferIndicator(YesNoIndicator ownAccountTransferIndicator) {
		this.ownAccountTransferIndicator = ownAccountTransferIndicator;
		return this;
	}

	public Optional<Max350Text> getNonStandardSettlementInformation() {
		return nonStandardSettlementInformation == null ? Optional.empty() : Optional.of(nonStandardSettlementInformation);
	}

	public Transfer17 setNonStandardSettlementInformation(Max350Text nonStandardSettlementInformation) {
		this.nonStandardSettlementInformation = nonStandardSettlementInformation;
		return this;
	}
}