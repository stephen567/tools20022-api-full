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
import com.tools20022.repository.choice.ReportParameter2Choice;
import com.tools20022.repository.entity.FundsCashFlow;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CashInForecast1;
import com.tools20022.repository.msg.CashOutForecast1;
import com.tools20022.repository.msg.NetCashForecast1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Parameters used to report cash movements,eg, country code, currency code, BIC
 * or a user defined parameter.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ForecastParameter2#mmReportParameter
 * ForecastParameter2.mmReportParameter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ForecastParameter2#mmCashInForecastDetails
 * ForecastParameter2.mmCashInForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ForecastParameter2#mmCashOutForecastDetails
 * ForecastParameter2.mmCashOutForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ForecastParameter2#mmNetCashForecastDetails
 * ForecastParameter2.mmNetCashForecastDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.FundsCashFlow
 * FundsCashFlow}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ForecastParameter2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Parameters used to report cash movements,eg, country code, currency code, BIC or a user defined parameter."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ForecastParameter2", propOrder = {"reportParameter", "cashInForecastDetails", "cashOutForecastDetails", "netCashForecastDetails"})
public class ForecastParameter2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RptParam", required = true)
	protected ReportParameter2Choice reportParameter;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ReportParameter2Choice
	 * ReportParameter2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ForecastParameter2
	 * ForecastParameter2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptParam"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportParameter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of parameter used for grouping the information in a report, eg, country code, currency code, BIC or a user defined parameter."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ForecastParameter2, ReportParameter2Choice> mmReportParameter = new MMMessageAttribute<ForecastParameter2, ReportParameter2Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ForecastParameter2.mmObject();
			isDerived = false;
			xmlTag = "RptParam";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportParameter";
			definition = "Type of parameter used for grouping the information in a report, eg, country code, currency code, BIC or a user defined parameter.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ReportParameter2Choice.mmObject();
		}

		@Override
		public ReportParameter2Choice getValue(ForecastParameter2 obj) {
			return obj.getReportParameter();
		}

		@Override
		public void setValue(ForecastParameter2 obj, ReportParameter2Choice value) {
			obj.setReportParameter(value);
		}
	};
	@XmlElement(name = "CshInFcstDtls")
	protected List<CashInForecast1> cashInForecastDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashInForecast1
	 * CashInForecast1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow FundsCashFlow}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ForecastParameter2
	 * ForecastParameter2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshInFcstDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashInForecastDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash movement in to of a fund as a result of investment funds transactions, eg, subscriptions or switch-out."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ForecastParameter2, List<CashInForecast1>> mmCashInForecastDetails = new MMMessageAssociationEnd<ForecastParameter2, List<CashInForecast1>>() {
		{
			businessComponentTrace_lazy = () -> FundsCashFlow.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ForecastParameter2.mmObject();
			isDerived = false;
			xmlTag = "CshInFcstDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashInForecastDetails";
			definition = "Cash movement in to of a fund as a result of investment funds transactions, eg, subscriptions or switch-out.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashInForecast1.mmObject();
		}

		@Override
		public List<CashInForecast1> getValue(ForecastParameter2 obj) {
			return obj.getCashInForecastDetails();
		}

		@Override
		public void setValue(ForecastParameter2 obj, List<CashInForecast1> value) {
			obj.setCashInForecastDetails(value);
		}
	};
	@XmlElement(name = "CshOutFcstDtls")
	protected List<CashOutForecast1> cashOutForecastDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashOutForecast1
	 * CashOutForecast1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow FundsCashFlow}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ForecastParameter2
	 * ForecastParameter2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshOutFcstDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashOutForecastDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash movement out of a fund as a result of investment funds transactions, eg, redemptions or switch-out."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ForecastParameter2, List<CashOutForecast1>> mmCashOutForecastDetails = new MMMessageAssociationEnd<ForecastParameter2, List<CashOutForecast1>>() {
		{
			businessComponentTrace_lazy = () -> FundsCashFlow.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ForecastParameter2.mmObject();
			isDerived = false;
			xmlTag = "CshOutFcstDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashOutForecastDetails";
			definition = "Cash movement out of a fund as a result of investment funds transactions, eg, redemptions or switch-out.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashOutForecast1.mmObject();
		}

		@Override
		public List<CashOutForecast1> getValue(ForecastParameter2 obj) {
			return obj.getCashOutForecastDetails();
		}

		@Override
		public void setValue(ForecastParameter2 obj, List<CashOutForecast1> value) {
			obj.setCashOutForecastDetails(value);
		}
	};
	@XmlElement(name = "NetCshFcstDtls")
	protected List<NetCashForecast1> netCashForecastDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NetCashForecast1
	 * NetCashForecast1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow FundsCashFlow}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ForecastParameter2
	 * ForecastParameter2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetCshFcstDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetCashForecastDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net cash movements to a fund as a result of investment funds transactions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ForecastParameter2, List<NetCashForecast1>> mmNetCashForecastDetails = new MMMessageAssociationEnd<ForecastParameter2, List<NetCashForecast1>>() {
		{
			businessComponentTrace_lazy = () -> FundsCashFlow.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ForecastParameter2.mmObject();
			isDerived = false;
			xmlTag = "NetCshFcstDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetCashForecastDetails";
			definition = "Net cash movements to a fund as a result of investment funds transactions.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NetCashForecast1.mmObject();
		}

		@Override
		public List<NetCashForecast1> getValue(ForecastParameter2 obj) {
			return obj.getNetCashForecastDetails();
		}

		@Override
		public void setValue(ForecastParameter2 obj, List<NetCashForecast1> value) {
			obj.setNetCashForecastDetails(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ForecastParameter2.mmReportParameter, com.tools20022.repository.msg.ForecastParameter2.mmCashInForecastDetails,
						com.tools20022.repository.msg.ForecastParameter2.mmCashOutForecastDetails, com.tools20022.repository.msg.ForecastParameter2.mmNetCashForecastDetails);
				trace_lazy = () -> FundsCashFlow.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ForecastParameter2";
				definition = "Parameters used to report cash movements,eg, country code, currency code, BIC or a user defined parameter.";
			}
		});
		return mmObject_lazy.get();
	}

	public ReportParameter2Choice getReportParameter() {
		return reportParameter;
	}

	public ForecastParameter2 setReportParameter(ReportParameter2Choice reportParameter) {
		this.reportParameter = Objects.requireNonNull(reportParameter);
		return this;
	}

	public List<CashInForecast1> getCashInForecastDetails() {
		return cashInForecastDetails == null ? cashInForecastDetails = new ArrayList<>() : cashInForecastDetails;
	}

	public ForecastParameter2 setCashInForecastDetails(List<CashInForecast1> cashInForecastDetails) {
		this.cashInForecastDetails = Objects.requireNonNull(cashInForecastDetails);
		return this;
	}

	public List<CashOutForecast1> getCashOutForecastDetails() {
		return cashOutForecastDetails == null ? cashOutForecastDetails = new ArrayList<>() : cashOutForecastDetails;
	}

	public ForecastParameter2 setCashOutForecastDetails(List<CashOutForecast1> cashOutForecastDetails) {
		this.cashOutForecastDetails = Objects.requireNonNull(cashOutForecastDetails);
		return this;
	}

	public List<NetCashForecast1> getNetCashForecastDetails() {
		return netCashForecastDetails == null ? netCashForecastDetails = new ArrayList<>() : netCashForecastDetails;
	}

	public ForecastParameter2 setNetCashForecastDetails(List<NetCashForecast1> netCashForecastDetails) {
		this.netCashForecastDetails = Objects.requireNonNull(netCashForecastDetails);
		return this;
	}
}