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
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CollateralValueReport1;
import com.tools20022.repository.msg.ErrorHandling3;
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
 * Report on collateral values or error report in case of business processing of
 * the related request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CollateralValueReportOrError1Choice#mmBusinessReport
 * CollateralValueReportOrError1Choice.mmBusinessReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CollateralValueReportOrError1Choice#mmOperationalError
 * CollateralValueReportOrError1Choice.mmOperationalError}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CollateralValueReportOrError1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Report on collateral values or error report in case of business processing of the related request."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CollateralValueReportOrError3Choice
 * CollateralValueReportOrError3Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CollateralValueReportOrError1Choice", propOrder = {"businessReport", "operationalError"})
public class CollateralValueReportOrError1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "BizRpt", required = true)
	protected List<CollateralValueReport1> businessReport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CollateralValueReport1
	 * CollateralValueReport1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CollateralValueReportOrError1Choice
	 * CollateralValueReportOrError1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BizRpt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information specific to the collateral value reports included in the message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralValueReportOrError3Choice#mmBusinessReport
	 * CollateralValueReportOrError3Choice.mmBusinessReport}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CollateralValueReportOrError1Choice, List<CollateralValueReport1>> mmBusinessReport = new MMMessageAssociationEnd<CollateralValueReportOrError1Choice, List<CollateralValueReport1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.CollateralValueReportOrError1Choice.mmObject();
			isDerived = false;
			xmlTag = "BizRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessReport";
			definition = "Provides information specific to the collateral value reports included in the message.";
			nextVersions_lazy = () -> Arrays.asList(CollateralValueReportOrError3Choice.mmBusinessReport);
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CollateralValueReport1.mmObject();
		}

		@Override
		public List<CollateralValueReport1> getValue(CollateralValueReportOrError1Choice obj) {
			return obj.getBusinessReport();
		}

		@Override
		public void setValue(CollateralValueReportOrError1Choice obj, List<CollateralValueReport1> value) {
			obj.setBusinessReport(value);
		}
	};
	@XmlElement(name = "OprlErr", required = true)
	protected List<ErrorHandling3> operationalError;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ErrorHandling3
	 * ErrorHandling3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CollateralValueReportOrError1Choice
	 * CollateralValueReportOrError1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OprlErr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OperationalError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether an operational error has been issued during the processing of the related request."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralValueReportOrError3Choice#mmOperationalError
	 * CollateralValueReportOrError3Choice.mmOperationalError}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CollateralValueReportOrError1Choice, List<ErrorHandling3>> mmOperationalError = new MMMessageAssociationEnd<CollateralValueReportOrError1Choice, List<ErrorHandling3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.CollateralValueReportOrError1Choice.mmObject();
			isDerived = false;
			xmlTag = "OprlErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OperationalError";
			definition = "Indicates whether an operational error has been issued during the processing of the related request.";
			nextVersions_lazy = () -> Arrays.asList(CollateralValueReportOrError3Choice.mmOperationalError);
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ErrorHandling3.mmObject();
		}

		@Override
		public List<ErrorHandling3> getValue(CollateralValueReportOrError1Choice obj) {
			return obj.getOperationalError();
		}

		@Override
		public void setValue(CollateralValueReportOrError1Choice obj, List<ErrorHandling3> value) {
			obj.setOperationalError(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CollateralValueReportOrError1Choice.mmBusinessReport, com.tools20022.repository.choice.CollateralValueReportOrError1Choice.mmOperationalError);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CollateralValueReportOrError1Choice";
				definition = "Report on collateral values or error report in case of business processing of the related request.";
				nextVersions_lazy = () -> Arrays.asList(CollateralValueReportOrError3Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public List<CollateralValueReport1> getBusinessReport() {
		return businessReport == null ? businessReport = new ArrayList<>() : businessReport;
	}

	public CollateralValueReportOrError1Choice setBusinessReport(List<CollateralValueReport1> businessReport) {
		this.businessReport = Objects.requireNonNull(businessReport);
		return this;
	}

	public List<ErrorHandling3> getOperationalError() {
		return operationalError == null ? operationalError = new ArrayList<>() : operationalError;
	}

	public CollateralValueReportOrError1Choice setOperationalError(List<ErrorHandling3> operationalError) {
		this.operationalError = Objects.requireNonNull(operationalError);
		return this;
	}
}