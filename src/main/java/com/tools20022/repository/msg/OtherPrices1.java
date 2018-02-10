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
import com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01;
import com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV02;
import com.tools20022.repository.entity.Adjustment;
import com.tools20022.repository.entity.Price;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the type of price and information about the price.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices1#mmMaximum
 * OtherPrices1.mmMaximum}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices1#mmTransaction
 * OtherPrices1.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherPrices1#mmMarketBrokerCommission
 * OtherPrices1.mmMarketBrokerCommission}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices1#mmMarkedUp
 * OtherPrices1.mmMarkedUp}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices1#mmMarkedDown
 * OtherPrices1.mmMarkedDown}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices1#mmNetDisclosed
 * OtherPrices1.mmNetDisclosed}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices1#mmNetUndisclosed
 * OtherPrices1.mmNetUndisclosed}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices1#mmNotionalGross
 * OtherPrices1.mmNotionalGross}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherPrices1#mmBenchmarkWeightedAverage
 * OtherPrices1.mmBenchmarkWeightedAverage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherPrices1#mmAllMarketsWeightedAverage
 * OtherPrices1.mmAllMarketsWeightedAverage}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices1#mmBenchmark
 * OtherPrices1.mmBenchmark}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices1#mmOtherPrice
 * OtherPrices1.mmOtherPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices1#mmIndexPrice
 * OtherPrices1.mmIndexPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices1#mmReportedPrice
 * OtherPrices1.mmReportedPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices1#mmReferencePrice
 * OtherPrices1.mmReferencePrice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Price Price}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01#mmOtherPrices
 * SecuritiesTradeConfirmationV01.mmOtherPrices}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV02#mmOtherPrices
 * SecuritiesTradeConfirmationV02.mmOtherPrices}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OtherPrices1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of price and information about the price."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2 OtherPrices2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OtherPrices1", propOrder = {"maximum", "transaction", "marketBrokerCommission", "markedUp", "markedDown", "netDisclosed", "netUndisclosed", "notionalGross", "benchmarkWeightedAverage", "allMarketsWeightedAverage",
		"benchmark", "otherPrice", "indexPrice", "reportedPrice", "referencePrice"})
public class OtherPrices1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Max")
	protected Price4 maximum;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Price4 Price4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1 OtherPrices1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Max"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Maximum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the maximum price."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#mmMaximum
	 * OtherPrices2.mmMaximum}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMaximum = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Price.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherPrices1.mmObject();
			isDerived = false;
			xmlTag = "Max";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Maximum";
			definition = "Specifies the maximum price.";
			nextVersions_lazy = () -> Arrays.asList(OtherPrices2.mmMaximum);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Price4.mmObject();
		}
	};
	@XmlElement(name = "Tx")
	protected Price4 transaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Price4 Price4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1 OtherPrices1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the transaction price."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#mmTransaction
	 * OtherPrices2.mmTransaction}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransaction = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Price.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherPrices1.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Specifies the transaction price.";
			nextVersions_lazy = () -> Arrays.asList(OtherPrices2.mmTransaction);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Price4.mmObject();
		}
	};
	@XmlElement(name = "MktBrkrComssn")
	protected Price4 marketBrokerCommission;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price4 Price4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmPrice
	 * Adjustment.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1 OtherPrices1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktBrkrComssn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketBrokerCommission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Market price including or excluding the broker's commission."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherPrices2#mmMarketBrokerCommission
	 * OtherPrices2.mmMarketBrokerCommission}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMarketBrokerCommission = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherPrices1.mmObject();
			isDerived = false;
			xmlTag = "MktBrkrComssn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketBrokerCommission";
			definition = "Market price including or excluding the broker's commission.";
			nextVersions_lazy = () -> Arrays.asList(OtherPrices2.mmMarketBrokerCommission);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Price4.mmObject();
		}
	};
	@XmlElement(name = "MrkdUp")
	protected Price4 markedUp;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Price4 Price4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1 OtherPrices1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrkdUp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarkedUp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of an order to buy, the price that the broker paid on the market plus the broker's commission."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#mmMarkedUp
	 * OtherPrices2.mmMarkedUp}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMarkedUp = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Price.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherPrices1.mmObject();
			isDerived = false;
			xmlTag = "MrkdUp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkedUp";
			definition = "In case of an order to buy, the price that the broker paid on the market plus the broker's commission.";
			nextVersions_lazy = () -> Arrays.asList(OtherPrices2.mmMarkedUp);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Price4.mmObject();
		}
	};
	@XmlElement(name = "MrkdDwn")
	protected Price4 markedDown;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Price4 Price4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1 OtherPrices1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrkdDwn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarkedDown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of an order to sell, the price the broker receives in the market minus the broker's commission."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#mmMarkedDown
	 * OtherPrices2.mmMarkedDown}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMarkedDown = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Price.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherPrices1.mmObject();
			isDerived = false;
			xmlTag = "MrkdDwn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkedDown";
			definition = "In case of an order to sell, the price the broker receives in the market minus the broker's commission.";
			nextVersions_lazy = () -> Arrays.asList(OtherPrices2.mmMarkedDown);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Price4.mmObject();
		}
	};
	@XmlElement(name = "NetDscld")
	protected Price4 netDisclosed;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price4 Price4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1 OtherPrices1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetDscld"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetDisclosed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price is net to the disclosed client."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherPrices2#mmNetDisclosed
	 * OtherPrices2.mmNetDisclosed}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNetDisclosed = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Price.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherPrices1.mmObject();
			isDerived = false;
			xmlTag = "NetDscld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDisclosed";
			definition = "Price is net to the disclosed client.";
			nextVersions_lazy = () -> Arrays.asList(OtherPrices2.mmNetDisclosed);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Price4.mmObject();
		}
	};
	@XmlElement(name = "NetUdscld")
	protected Price4 netUndisclosed;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price4 Price4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1 OtherPrices1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetUdscld"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetUndisclosed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price is net to the client undisclosed (used in the UK market)."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherPrices2#mmNetUndisclosed
	 * OtherPrices2.mmNetUndisclosed}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNetUndisclosed = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Price.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherPrices1.mmObject();
			isDerived = false;
			xmlTag = "NetUdscld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetUndisclosed";
			definition = "Price is net to the client undisclosed (used in the UK market).";
			nextVersions_lazy = () -> Arrays.asList(OtherPrices2.mmNetUndisclosed);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Price4.mmObject();
		}
	};
	@XmlElement(name = "NtnlGrss")
	protected Price4 notionalGross;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price4 Price4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1 OtherPrices1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtnlGrss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotionalGross"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price is notional gross (used in the UK market)."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherPrices2#mmNotionalGross
	 * OtherPrices2.mmNotionalGross}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNotionalGross = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Price.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherPrices1.mmObject();
			isDerived = false;
			xmlTag = "NtnlGrss";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotionalGross";
			definition = "Price is notional gross (used in the UK market).";
			nextVersions_lazy = () -> Arrays.asList(OtherPrices2.mmNotionalGross);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Price4.mmObject();
		}
	};
	@XmlElement(name = "BchmkWghtdAvrg")
	protected Price4 benchmarkWeightedAverage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price4 Price4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1 OtherPrices1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BchmkWghtdAvrg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BenchmarkWeightedAverage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price is weighted average price of the benchmark prices at the time of each partial fill."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherPrices2#mmBenchmarkWeightedAverage
	 * OtherPrices2.mmBenchmarkWeightedAverage}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBenchmarkWeightedAverage = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Price.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherPrices1.mmObject();
			isDerived = false;
			xmlTag = "BchmkWghtdAvrg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BenchmarkWeightedAverage";
			definition = "Price is weighted average price of the benchmark prices at the time of each partial fill.";
			nextVersions_lazy = () -> Arrays.asList(OtherPrices2.mmBenchmarkWeightedAverage);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Price4.mmObject();
		}
	};
	@XmlElement(name = "AllMktsWghtdAvrg")
	protected Price4 allMarketsWeightedAverage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price4 Price4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1 OtherPrices1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AllMktsWghtdAvrg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllMarketsWeightedAverage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price is weighted average price of all market executions during the completion of the order."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherPrices2#mmAllMarketsWeightedAverage
	 * OtherPrices2.mmAllMarketsWeightedAverage}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAllMarketsWeightedAverage = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Price.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherPrices1.mmObject();
			isDerived = false;
			xmlTag = "AllMktsWghtdAvrg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllMarketsWeightedAverage";
			definition = "Price is weighted average price of all market executions during the completion of the order.";
			nextVersions_lazy = () -> Arrays.asList(OtherPrices2.mmAllMarketsWeightedAverage);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Price4.mmObject();
		}
	};
	@XmlElement(name = "Bchmk")
	protected Price4 benchmark;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price4 Price4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1 OtherPrices1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Bchmk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Benchmark"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price is a benchmark price relating to the current partial fills (eg, last trade tick from market)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#mmBenchmark
	 * OtherPrices2.mmBenchmark}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBenchmark = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Price.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherPrices1.mmObject();
			isDerived = false;
			xmlTag = "Bchmk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Benchmark";
			definition = "Price is a benchmark price relating to the current partial fills (eg, last trade tick from market).";
			nextVersions_lazy = () -> Arrays.asList(OtherPrices2.mmBenchmark);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Price4.mmObject();
		}
	};
	@XmlElement(name = "OthrPric")
	protected Price4 otherPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price4 Price4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1 OtherPrices1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of price that is not defined explicitly."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#mmOtherPrice
	 * OtherPrices2.mmOtherPrice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOtherPrice = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Price.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherPrices1.mmObject();
			isDerived = false;
			xmlTag = "OthrPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherPrice";
			definition = "Type of price that is not defined explicitly.";
			nextVersions_lazy = () -> Arrays.asList(OtherPrices2.mmOtherPrice);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Price4.mmObject();
		}
	};
	@XmlElement(name = "IndxPric")
	protected Price4 indexPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price4 Price4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1 OtherPrices1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndxPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price of securities representing a particular market or a portion of it."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#mmIndexPrice
	 * OtherPrices2.mmIndexPrice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIndexPrice = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Price.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherPrices1.mmObject();
			isDerived = false;
			xmlTag = "IndxPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndexPrice";
			definition = "Price of securities representing a particular market or a portion of it.";
			nextVersions_lazy = () -> Arrays.asList(OtherPrices2.mmIndexPrice);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Price4.mmObject();
		}
	};
	@XmlElement(name = "RptdPric")
	protected Price4 reportedPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price4 Price4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1 OtherPrices1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptdPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportedPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price used to differentiate from price on a confirmation of a marked up or marked down principal trade."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherPrices2#mmReportedPrice
	 * OtherPrices2.mmReportedPrice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReportedPrice = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Price.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherPrices1.mmObject();
			isDerived = false;
			xmlTag = "RptdPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportedPrice";
			definition = "Price used to differentiate from price on a confirmation of a marked up or marked down principal trade.";
			nextVersions_lazy = () -> Arrays.asList(OtherPrices2.mmReportedPrice);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Price4.mmObject();
		}
	};
	@XmlElement(name = "RefPric")
	protected PriceInformation9 referencePrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PriceInformation9
	 * PriceInformation9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1 OtherPrices1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RefPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferencePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price of reference of the concerned financial instrument."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherPrices2#mmReferencePrice
	 * OtherPrices2.mmReferencePrice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReferencePrice = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Price.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherPrices1.mmObject();
			isDerived = false;
			xmlTag = "RefPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferencePrice";
			definition = "Price of reference of the concerned financial instrument.";
			nextVersions_lazy = () -> Arrays.asList(OtherPrices2.mmReferencePrice);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PriceInformation9.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherPrices1.mmMaximum, com.tools20022.repository.msg.OtherPrices1.mmTransaction, com.tools20022.repository.msg.OtherPrices1.mmMarketBrokerCommission,
						com.tools20022.repository.msg.OtherPrices1.mmMarkedUp, com.tools20022.repository.msg.OtherPrices1.mmMarkedDown, com.tools20022.repository.msg.OtherPrices1.mmNetDisclosed,
						com.tools20022.repository.msg.OtherPrices1.mmNetUndisclosed, com.tools20022.repository.msg.OtherPrices1.mmNotionalGross, com.tools20022.repository.msg.OtherPrices1.mmBenchmarkWeightedAverage,
						com.tools20022.repository.msg.OtherPrices1.mmAllMarketsWeightedAverage, com.tools20022.repository.msg.OtherPrices1.mmBenchmark, com.tools20022.repository.msg.OtherPrices1.mmOtherPrice,
						com.tools20022.repository.msg.OtherPrices1.mmIndexPrice, com.tools20022.repository.msg.OtherPrices1.mmReportedPrice, com.tools20022.repository.msg.OtherPrices1.mmReferencePrice);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesTradeConfirmationV01.mmOtherPrices, SecuritiesTradeConfirmationV02.mmOtherPrices);
				trace_lazy = () -> Price.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OtherPrices1";
				definition = "Specifies the type of price and information about the price.";
				nextVersions_lazy = () -> Arrays.asList(OtherPrices2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Price4> getMaximum() {
		return maximum == null ? Optional.empty() : Optional.of(maximum);
	}

	public OtherPrices1 setMaximum(com.tools20022.repository.msg.Price4 maximum) {
		this.maximum = maximum;
		return this;
	}

	public Optional<Price4> getTransaction() {
		return transaction == null ? Optional.empty() : Optional.of(transaction);
	}

	public OtherPrices1 setTransaction(com.tools20022.repository.msg.Price4 transaction) {
		this.transaction = transaction;
		return this;
	}

	public Optional<Price4> getMarketBrokerCommission() {
		return marketBrokerCommission == null ? Optional.empty() : Optional.of(marketBrokerCommission);
	}

	public OtherPrices1 setMarketBrokerCommission(com.tools20022.repository.msg.Price4 marketBrokerCommission) {
		this.marketBrokerCommission = marketBrokerCommission;
		return this;
	}

	public Optional<Price4> getMarkedUp() {
		return markedUp == null ? Optional.empty() : Optional.of(markedUp);
	}

	public OtherPrices1 setMarkedUp(com.tools20022.repository.msg.Price4 markedUp) {
		this.markedUp = markedUp;
		return this;
	}

	public Optional<Price4> getMarkedDown() {
		return markedDown == null ? Optional.empty() : Optional.of(markedDown);
	}

	public OtherPrices1 setMarkedDown(com.tools20022.repository.msg.Price4 markedDown) {
		this.markedDown = markedDown;
		return this;
	}

	public Optional<Price4> getNetDisclosed() {
		return netDisclosed == null ? Optional.empty() : Optional.of(netDisclosed);
	}

	public OtherPrices1 setNetDisclosed(com.tools20022.repository.msg.Price4 netDisclosed) {
		this.netDisclosed = netDisclosed;
		return this;
	}

	public Optional<Price4> getNetUndisclosed() {
		return netUndisclosed == null ? Optional.empty() : Optional.of(netUndisclosed);
	}

	public OtherPrices1 setNetUndisclosed(com.tools20022.repository.msg.Price4 netUndisclosed) {
		this.netUndisclosed = netUndisclosed;
		return this;
	}

	public Optional<Price4> getNotionalGross() {
		return notionalGross == null ? Optional.empty() : Optional.of(notionalGross);
	}

	public OtherPrices1 setNotionalGross(com.tools20022.repository.msg.Price4 notionalGross) {
		this.notionalGross = notionalGross;
		return this;
	}

	public Optional<Price4> getBenchmarkWeightedAverage() {
		return benchmarkWeightedAverage == null ? Optional.empty() : Optional.of(benchmarkWeightedAverage);
	}

	public OtherPrices1 setBenchmarkWeightedAverage(com.tools20022.repository.msg.Price4 benchmarkWeightedAverage) {
		this.benchmarkWeightedAverage = benchmarkWeightedAverage;
		return this;
	}

	public Optional<Price4> getAllMarketsWeightedAverage() {
		return allMarketsWeightedAverage == null ? Optional.empty() : Optional.of(allMarketsWeightedAverage);
	}

	public OtherPrices1 setAllMarketsWeightedAverage(com.tools20022.repository.msg.Price4 allMarketsWeightedAverage) {
		this.allMarketsWeightedAverage = allMarketsWeightedAverage;
		return this;
	}

	public Optional<Price4> getBenchmark() {
		return benchmark == null ? Optional.empty() : Optional.of(benchmark);
	}

	public OtherPrices1 setBenchmark(com.tools20022.repository.msg.Price4 benchmark) {
		this.benchmark = benchmark;
		return this;
	}

	public Optional<Price4> getOtherPrice() {
		return otherPrice == null ? Optional.empty() : Optional.of(otherPrice);
	}

	public OtherPrices1 setOtherPrice(com.tools20022.repository.msg.Price4 otherPrice) {
		this.otherPrice = otherPrice;
		return this;
	}

	public Optional<Price4> getIndexPrice() {
		return indexPrice == null ? Optional.empty() : Optional.of(indexPrice);
	}

	public OtherPrices1 setIndexPrice(com.tools20022.repository.msg.Price4 indexPrice) {
		this.indexPrice = indexPrice;
		return this;
	}

	public Optional<Price4> getReportedPrice() {
		return reportedPrice == null ? Optional.empty() : Optional.of(reportedPrice);
	}

	public OtherPrices1 setReportedPrice(com.tools20022.repository.msg.Price4 reportedPrice) {
		this.reportedPrice = reportedPrice;
		return this;
	}

	public Optional<PriceInformation9> getReferencePrice() {
		return referencePrice == null ? Optional.empty() : Optional.of(referencePrice);
	}

	public OtherPrices1 setReferencePrice(com.tools20022.repository.msg.PriceInformation9 referencePrice) {
		this.referencePrice = referencePrice;
		return this;
	}
}