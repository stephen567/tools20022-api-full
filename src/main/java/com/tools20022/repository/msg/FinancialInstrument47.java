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
import com.tools20022.repository.choice.Quantity12Choice;
import com.tools20022.repository.choice.SecurityIdentification23Choice;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
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
 * Security that is a sub-set of an investment fund, and is governed by the same
 * investment fund policy, for example, dividend option or valuation currency.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument47#mmIdentification
 * FinancialInstrument47.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument47#mmName
 * FinancialInstrument47.mmName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument47#mmShortName
 * FinancialInstrument47.mmShortName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument47#mmQuantity
 * FinancialInstrument47.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument47#mmAverageAcquisitionPrice
 * FinancialInstrument47.mmAverageAcquisitionPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument47#mmTotalBookValue
 * FinancialInstrument47.mmTotalBookValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument47#mmTransfereeAccount
 * FinancialInstrument47.mmTransfereeAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument47#mmSubAccountDetails
 * FinancialInstrument47.mmSubAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument47#mmDeliveringAgentDetails
 * FinancialInstrument47.mmDeliveringAgentDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentFundClass
 * InvestmentFundClass}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline#forFinancialInstrument47
 * ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument47
 * }</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialInstrument47"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Security that is a sub-set of an investment fund, and is governed by the same investment fund policy, for example, dividend option or valuation currency."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument37
 * FinancialInstrument37}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FinancialInstrument47", propOrder = {"identification", "name", "shortName", "quantity", "averageAcquisitionPrice", "totalBookValue", "transfereeAccount", "subAccountDetails", "deliveringAgentDetails"})
public class FinancialInstrument47 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected SecurityIdentification23Choice identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice
	 * SecurityIdentification23Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument47
	 * FinancialInstrument47}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier of a security, assigned under a formal or proprietary identification scheme."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument37#mmIdentification
	 * FinancialInstrument37.mmIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument47.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identifier of a security, assigned under a formal or proprietary identification scheme.";
			previousVersion_lazy = () -> FinancialInstrument37.mmIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecurityIdentification23Choice.mmObject();
		}
	};
	@XmlElement(name = "Nm")
	protected Max350Text name;
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
	 * {@linkplain com.tools20022.repository.entity.LocalName#mmFullName
	 * LocalName.mmFullName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument47
	 * FinancialInstrument47}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the financial instrument in free format text."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument37#mmName
	 * FinancialInstrument37.mmName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> LocalName.mmFullName;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument47.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name of the financial instrument in free format text.";
			previousVersion_lazy = () -> FinancialInstrument37.mmName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "ShrtNm")
	protected Max35Text shortName;
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
	 * {@linkplain com.tools20022.repository.entity.LocalName#mmShortName
	 * LocalName.mmShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument47
	 * FinancialInstrument47}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShrtNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial Instrument Short Name (FISN) expressed in conformance with the ISO 18774 standard."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmShortName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> LocalName.mmShortName;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument47.mmObject();
			isDerived = false;
			xmlTag = "ShrtNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortName";
			definition = "Financial Instrument Short Name (FISN) expressed in conformance with the ISO 18774 standard.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "Qty")
	protected Quantity12Choice quantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Quantity12Choice
	 * Quantity12Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesQuantity
	 * Security.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument47
	 * FinancialInstrument47}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Qty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the quantity of assets to be transferred in units or in a percentage rate."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument37#mmQuantity
	 * FinancialInstrument37.mmQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmSecuritiesQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument47.mmObject();
			isDerived = false;
			xmlTag = "Qty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quantity";
			definition = "Specifies the quantity of assets to be transferred in units or in a percentage rate.";
			previousVersion_lazy = () -> FinancialInstrument37.mmQuantity;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Quantity12Choice.mmObject();
		}
	};
	@XmlElement(name = "AvrgAcqstnPric")
	protected ActiveOrHistoricCurrencyAndAmount averageAcquisitionPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmHoldingValue
	 * AssetHolding.mmHoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument47
	 * FinancialInstrument47}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AvrgAcqstnPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AverageAcquisitionPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Average cost per share of a security, including all charges and commissions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument37#mmAverageAcquisitionPrice
	 * FinancialInstrument37.mmAverageAcquisitionPrice}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAverageAcquisitionPrice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmHoldingValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument47.mmObject();
			isDerived = false;
			xmlTag = "AvrgAcqstnPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AverageAcquisitionPrice";
			definition = "Average cost per share of a security, including all charges and commissions.";
			previousVersion_lazy = () -> FinancialInstrument37.mmAverageAcquisitionPrice;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "TtlBookVal")
	protected ActiveOrHistoricCurrencyAndAmount totalBookValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmBookValue
	 * AssetHolding.mmBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument47
	 * FinancialInstrument47}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlBookVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalBookValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net asset on balance sheet - total portfolio value minus or plus the unrealised gain or loss."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument37#mmTotalBookValue
	 * FinancialInstrument37.mmTotalBookValue}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalBookValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmBookValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument47.mmObject();
			isDerived = false;
			xmlTag = "TtlBookVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalBookValue";
			definition = "Net asset on balance sheet - total portfolio value minus or plus the unrealised gain or loss.";
			previousVersion_lazy = () -> FinancialInstrument37.mmTotalBookValue;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "TrfeeAcct")
	protected Account19 transfereeAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Account19
	 * Account19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmInvestmentAccount
	 * InvestmentFundClass.mmInvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument47
	 * FinancialInstrument47}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfeeAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransfereeAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account held in the name of a party that is not the name of the beneficial owner of the shares."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument37#mmTransfereeAccount
	 * FinancialInstrument37.mmTransfereeAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransfereeAccount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmInvestmentAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument47.mmObject();
			isDerived = false;
			xmlTag = "TrfeeAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransfereeAccount";
			definition = "Account held in the name of a party that is not the name of the beneficial owner of the shares.";
			previousVersion_lazy = () -> FinancialInstrument37.mmTransfereeAccount;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Account19.mmObject();
		}
	};
	@XmlElement(name = "SubAcctDtls")
	protected SubAccount5 subAccountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SubAccount5
	 * SubAccount5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmInvestmentAccount
	 * InvestmentFundClass.mmInvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument47
	 * FinancialInstrument47}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubAcctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubAccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sub-accounts that are grouped in a master or omnibus account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument37#mmSubAccountDetails
	 * FinancialInstrument37.mmSubAccountDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSubAccountDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmInvestmentAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument47.mmObject();
			isDerived = false;
			xmlTag = "SubAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubAccountDetails";
			definition = "Sub-accounts that are grouped in a master or omnibus account.";
			previousVersion_lazy = () -> FinancialInstrument37.mmSubAccountDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SubAccount5.mmObject();
		}
	};
	@XmlElement(name = "DlvrgAgtDtls")
	protected PartyIdentificationAndAccount125 deliveringAgentDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount125
	 * PartyIdentificationAndAccount125}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument47
	 * FinancialInstrument47}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrgAgtDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringAgentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that delivers securities to the receiving agent at the place of settlement, for example, a central securities depository."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument37#mmDeliveringAgentDetails
	 * FinancialInstrument37.mmDeliveringAgentDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeliveringAgentDetails = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument47.mmObject();
			isDerived = false;
			xmlTag = "DlvrgAgtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringAgentDetails";
			definition = "Party that delivers securities to the receiving agent at the place of settlement, for example, a central securities depository.";
			previousVersion_lazy = () -> FinancialInstrument37.mmDeliveringAgentDetails;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount125.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrument47.mmIdentification, com.tools20022.repository.msg.FinancialInstrument47.mmName,
						com.tools20022.repository.msg.FinancialInstrument47.mmShortName, com.tools20022.repository.msg.FinancialInstrument47.mmQuantity, com.tools20022.repository.msg.FinancialInstrument47.mmAverageAcquisitionPrice,
						com.tools20022.repository.msg.FinancialInstrument47.mmTotalBookValue, com.tools20022.repository.msg.FinancialInstrument47.mmTransfereeAccount, com.tools20022.repository.msg.FinancialInstrument47.mmSubAccountDetails,
						com.tools20022.repository.msg.FinancialInstrument47.mmDeliveringAgentDetails);
				trace_lazy = () -> InvestmentFundClass.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument47);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstrument47";
				definition = "Security that is a sub-set of an investment fund, and is governed by the same investment fund policy, for example, dividend option or valuation currency.";
				previousVersion_lazy = () -> FinancialInstrument37.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public SecurityIdentification23Choice getIdentification() {
		return identification;
	}

	public FinancialInstrument47 setIdentification(SecurityIdentification23Choice identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<Max350Text> getName() {
		return name == null ? Optional.empty() : Optional.of(name);
	}

	public FinancialInstrument47 setName(Max350Text name) {
		this.name = name;
		return this;
	}

	public Optional<Max35Text> getShortName() {
		return shortName == null ? Optional.empty() : Optional.of(shortName);
	}

	public FinancialInstrument47 setShortName(Max35Text shortName) {
		this.shortName = shortName;
		return this;
	}

	public Optional<Quantity12Choice> getQuantity() {
		return quantity == null ? Optional.empty() : Optional.of(quantity);
	}

	public FinancialInstrument47 setQuantity(Quantity12Choice quantity) {
		this.quantity = quantity;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAndAmount> getAverageAcquisitionPrice() {
		return averageAcquisitionPrice == null ? Optional.empty() : Optional.of(averageAcquisitionPrice);
	}

	public FinancialInstrument47 setAverageAcquisitionPrice(ActiveOrHistoricCurrencyAndAmount averageAcquisitionPrice) {
		this.averageAcquisitionPrice = averageAcquisitionPrice;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAndAmount> getTotalBookValue() {
		return totalBookValue == null ? Optional.empty() : Optional.of(totalBookValue);
	}

	public FinancialInstrument47 setTotalBookValue(ActiveOrHistoricCurrencyAndAmount totalBookValue) {
		this.totalBookValue = totalBookValue;
		return this;
	}

	public Optional<Account19> getTransfereeAccount() {
		return transfereeAccount == null ? Optional.empty() : Optional.of(transfereeAccount);
	}

	public FinancialInstrument47 setTransfereeAccount(com.tools20022.repository.msg.Account19 transfereeAccount) {
		this.transfereeAccount = transfereeAccount;
		return this;
	}

	public Optional<SubAccount5> getSubAccountDetails() {
		return subAccountDetails == null ? Optional.empty() : Optional.of(subAccountDetails);
	}

	public FinancialInstrument47 setSubAccountDetails(com.tools20022.repository.msg.SubAccount5 subAccountDetails) {
		this.subAccountDetails = subAccountDetails;
		return this;
	}

	public Optional<PartyIdentificationAndAccount125> getDeliveringAgentDetails() {
		return deliveringAgentDetails == null ? Optional.empty() : Optional.of(deliveringAgentDetails);
	}

	public FinancialInstrument47 setDeliveringAgentDetails(com.tools20022.repository.msg.PartyIdentificationAndAccount125 deliveringAgentDetails) {
		this.deliveringAgentDetails = deliveringAgentDetails;
		return this;
	}
}