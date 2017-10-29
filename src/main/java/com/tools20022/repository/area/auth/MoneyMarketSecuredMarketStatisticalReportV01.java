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

package com.tools20022.repository.area.auth;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.repository.area.AuthoritiesLatestVersion;
import com.tools20022.repository.choice.SecuredMarketReport3Choice;
import com.tools20022.repository.msg.MoneyMarketReportHeader1;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.MoneyMarketStatisticalReportingISOPreviousversion;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * The MoneyMarketSecuredMarketStatisticalReport message is sent by the
 * reporting agents to the relevant competent authority, to report all relevant
 * secured money market transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AuthoritiesLatestVersion
 * AuthoritiesLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.MoneyMarketStatisticalReportingISOPreviousversion
 * MoneyMarketStatisticalReportingISOPreviousversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "MnyMktScrdMktSttstclRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketSecuredMarketStatisticalReportV01#ReportHeader
 * MoneyMarketSecuredMarketStatisticalReportV01.ReportHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketSecuredMarketStatisticalReportV01#SecuredMarketReport
 * MoneyMarketSecuredMarketStatisticalReportV01.SecuredMarketReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketSecuredMarketStatisticalReportV01#SupplementaryData
 * MoneyMarketSecuredMarketStatisticalReportV01.SupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} =
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketSecuredMarketStatisticalReportV01#identifier
 * MoneyMarketSecuredMarketStatisticalReportV01.identifier}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MoneyMarketSecuredMarketStatisticalReportV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The MoneyMarketSecuredMarketStatisticalReport message is sent by the reporting agents to the relevant competent authority, to report all relevant secured money market transactions. "
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketSecuredMarketStatisticalReportV02
 * MoneyMarketSecuredMarketStatisticalReportV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class MoneyMarketSecuredMarketStatisticalReportV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * Provides the elements specific to the report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MoneyMarketReportHeader1
	 * MoneyMarketReportHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptHdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportHeader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the elements specific to the report."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketSecuredMarketStatisticalReportV02#ReportHeader
	 * MoneyMarketSecuredMarketStatisticalReportV02.ReportHeader}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock ReportHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "RptHdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportHeader";
			definition = "Provides the elements specific to the report.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.auth.MoneyMarketSecuredMarketStatisticalReportV02.ReportHeader);
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> MoneyMarketReportHeader1.mmObject();
		}
	};
	/**
	 * Provides the reason why no activity is reported or the required list of
	 * transactions for the secured market segment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SecuredMarketReport3Choice
	 * SecuredMarketReport3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScrdMktRpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuredMarketReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the reason why no activity is reported or the required list of transactions for the secured market segment."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketSecuredMarketStatisticalReportV02#SecuredMarketReport
	 * MoneyMarketSecuredMarketStatisticalReportV02.SecuredMarketReport}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock SecuredMarketReport = new MMMessageBuildingBlock() {
		{
			xmlTag = "ScrdMktRpt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuredMarketReport";
			definition = "Provides the reason why no activity is reported or the required list of transactions for the secured market segment.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.auth.MoneyMarketSecuredMarketStatisticalReportV02.SecuredMarketReport);
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> SecuredMarketReport3Choice.mmObject();
		}
	};
	/**
	 * Additional information that can not be captured in the structured fields
	 * and/or any other specific block.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that can not be captured in the structured fields and/or any other specific block."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketSecuredMarketStatisticalReportV02#SupplementaryData
	 * MoneyMarketSecuredMarketStatisticalReportV02.SupplementaryData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock SupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.auth.MoneyMarketSecuredMarketStatisticalReportV02.SupplementaryData);
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}
	};
	/**
	 * An instance of MessageDefinitionIdentifier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getVersion
	 * version} = "01"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getBusinessArea
	 * businessArea} = "auth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getMessageFunctionality
	 * messageFunctionality} = "012"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getFlavour
	 * flavour} = "001"</li>
	 * </ul>
	 */
	public static final MMMessageDefinitionIdentifier identifier = new MMMessageDefinitionIdentifier() {
		{
			businessArea = "auth";
			messageFunctionality = "012";
			version = "01";
			flavour = "001";
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MoneyMarketSecuredMarketStatisticalReportV01";
				definition = "The MoneyMarketSecuredMarketStatisticalReport message is sent by the reporting agents to the relevant competent authority, to report all relevant secured money market transactions. ";
				nextVersions_lazy = () -> Arrays.asList(MoneyMarketSecuredMarketStatisticalReportV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(MoneyMarketStatisticalReportingISOPreviousversion.mmObject());
				rootElement = "Document";
				xmlTag = "MnyMktScrdMktSttstclRpt";
				businessArea_lazy = () -> AuthoritiesLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.auth.MoneyMarketSecuredMarketStatisticalReportV01.ReportHeader,
						com.tools20022.repository.area.auth.MoneyMarketSecuredMarketStatisticalReportV01.SecuredMarketReport, com.tools20022.repository.area.auth.MoneyMarketSecuredMarketStatisticalReportV01.SupplementaryData);
				messageDefinitionIdentifier_lazy = () -> com.tools20022.repository.area.auth.MoneyMarketSecuredMarketStatisticalReportV01.identifier;
			}
		});
		return mmObject_lazy.get();
	}
}