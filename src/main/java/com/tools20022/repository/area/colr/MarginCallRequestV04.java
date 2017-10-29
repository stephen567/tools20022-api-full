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

package com.tools20022.repository.area.colr;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.repository.area.CollateralManagementLatestVersion;
import com.tools20022.repository.choice.ExpectedCollateral2Choice;
import com.tools20022.repository.choice.MarginRequirement1Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.CollateralManagementISOLatestversion;
import com.tools20022.repository.msgset.CollateralManagementMaintenance20162017;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * <b>Scope</b><br>
 * The MarginCallRequest message is sent by the collateral taker or its
 * collateral manager to the collateral giver or its collateral manager<br>
 * This message is used to request new collateral at the initiation of an
 * exposure or request additional collateral for an existing exposure. It can
 * also be used to recall collateral upon the collateral giver or its collateral
 * manager's request.<br>
 * <br>
 * The message definition is intended for use with the ISO20022 Business
 * Application Header.<br>
 * <br>
 * <b>Usage</b><br>
 * When sent by the collateral taker the MarginCallRequest message is used to:<br>
 * - request new collateral at the initiation of an exposure<br>
 * - request additional collateral<br>
 * When sent by the collateral giver the MarginCallRequest message is used to:<br>
 * - request the return of collateral
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CollateralManagementLatestVersion
 * CollateralManagementLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CollateralManagementISOLatestversion
 * CollateralManagementISOLatestversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CollateralManagementMaintenance20162017
 * CollateralManagementMaintenance20162017}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "MrgnCallReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#TransactionIdentification
 * MarginCallRequestV04.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#Obligation
 * MarginCallRequestV04.Obligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#Agreement
 * MarginCallRequestV04.Agreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#MarginCallResult
 * MarginCallRequestV04.MarginCallResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#MarginDetailsDueToA
 * MarginCallRequestV04.MarginDetailsDueToA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#MarginDetailsDueToB
 * MarginCallRequestV04.MarginDetailsDueToB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#RequirementDetailsDueToA
 * MarginCallRequestV04.RequirementDetailsDueToA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#RequirementDetailsDueToB
 * MarginCallRequestV04.RequirementDetailsDueToB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#ExpectedCollateralDueToA
 * MarginCallRequestV04.ExpectedCollateralDueToA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#ExpectedCollateralDueToB
 * MarginCallRequestV04.ExpectedCollateralDueToB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#MarginCallDetails
 * MarginCallRequestV04.MarginCallDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#SupplementaryData
 * MarginCallRequestV04.SupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} =
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#identifier
 * MarginCallRequestV04.identifier}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MarginCallRequestV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe MarginCallRequest message is sent by the collateral taker or its collateral manager to the collateral giver or its collateral manager\r\nThis message is used to request new collateral at the initiation of an exposure or request additional collateral for an existing exposure. It can also be used to recall collateral upon the collateral giver or its collateral manager's request.\r\n\r\nThe message definition is intended for use with the ISO20022 Business Application Header.\r\n\r\nUsage\r\nWhen sent by the collateral taker the MarginCallRequest message is used to:\r\n- request new collateral at the initiation of an exposure\r\n- request additional collateral\r\nWhen sent by the collateral giver the MarginCallRequest message is used to:\r\n- request the return of collateral"
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV03
 * MarginCallRequestV03}</li>
 * </ul>
 */
public class MarginCallRequestV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unambiguous identification of the transaction as know by the instructing
	 * party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the transaction as know by the instructing party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV03#TransactionIdentification
	 * MarginCallRequestV03.TransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock TransactionIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "TxId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unambiguous identification of the transaction as know by the instructing party.";
			previousVersion_lazy = () -> com.tools20022.repository.area.colr.MarginCallRequestV03.TransactionIdentification;
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Provides information like the identification of the party or parties
	 * associated with the collateral agreement, the exposure type and the
	 * valuation date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Obligation4
	 * Obligation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Oblgtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Obligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information like the identification of the party or parties associated with the collateral agreement, the exposure type and the valuation date."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV03#Obligation
	 * MarginCallRequestV03.Obligation}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock Obligation = new MMMessageBuildingBlock() {
		{
			xmlTag = "Oblgtn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Obligation";
			definition = "Provides information like the identification of the party or parties associated with the collateral agreement, the exposure type and the valuation date.";
			previousVersion_lazy = () -> com.tools20022.repository.area.colr.MarginCallRequestV03.Obligation;
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> Obligation4.mmObject();
		}
	};
	/**
	 * Agreement details for the over the counter market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Agreement4
	 * Agreement4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Agrmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Agreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agreement details for the over the counter market."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV03#Agreement
	 * MarginCallRequestV03.Agreement}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock Agreement = new MMMessageBuildingBlock() {
		{
			xmlTag = "Agrmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Agreement";
			definition = "Agreement details for the over the counter market.";
			previousVersion_lazy = () -> com.tools20022.repository.area.colr.MarginCallRequestV03.Agreement;
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> Agreement4.mmObject();
		}
	};
	/**
	 * Summation of the call amounts per margin type. It is provided for the
	 * purposes of carrying forward for future messages that are used to compare
	 * the margin call results to determine whether a call is agreed or
	 * full/partially disputed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MarginCallResult3
	 * MarginCallResult3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrgnCallRslt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginCallResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Summation of the call amounts per margin type. It is provided for the purposes of carrying forward for future messages that are used to compare the margin call results to determine whether a call is agreed or full/partially disputed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV03#MarginCallResult
	 * MarginCallRequestV03.MarginCallResult}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock MarginCallResult = new MMMessageBuildingBlock() {
		{
			xmlTag = "MrgnCallRslt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginCallResult";
			definition = "Summation of the call amounts per margin type. It is provided for the purposes of carrying forward for future messages that are used to compare the margin call results to determine whether a call is agreed or full/partially disputed.";
			previousVersion_lazy = () -> com.tools20022.repository.area.colr.MarginCallRequestV03.MarginCallResult;
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> MarginCallResult3.mmObject();
		}
	};
	/**
	 * Provides details about the margin calculation that would be due to party
	 * A.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.MarginCall1
	 * MarginCall1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrgnDtlsDueToA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginDetailsDueToA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the margin calculation that would be due to party A."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV03#MarginDetailsDueToA
	 * MarginCallRequestV03.MarginDetailsDueToA}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock MarginDetailsDueToA = new MMMessageBuildingBlock() {
		{
			xmlTag = "MrgnDtlsDueToA";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginDetailsDueToA";
			definition = "Provides details about the margin calculation that would be due to party A.";
			previousVersion_lazy = () -> com.tools20022.repository.area.colr.MarginCallRequestV03.MarginDetailsDueToA;
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> MarginCall1.mmObject();
		}
	};
	/**
	 * Provides details about the margin calculation that would be due to party
	 * B.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.MarginCall1
	 * MarginCall1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrgnDtlsDueToB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginDetailsDueToB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the margin calculation that would be due to party B."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV03#MarginDetailsDueToB
	 * MarginCallRequestV03.MarginDetailsDueToB}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock MarginDetailsDueToB = new MMMessageBuildingBlock() {
		{
			xmlTag = "MrgnDtlsDueToB";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginDetailsDueToB";
			definition = "Provides details about the margin calculation that would be due to party B.";
			previousVersion_lazy = () -> com.tools20022.repository.area.colr.MarginCallRequestV03.MarginDetailsDueToB;
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> MarginCall1.mmObject();
		}
	};
	/**
	 * Amount of expected margin that will be either delivered to party A by
	 * party B or recalled to party A from party B.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.MarginRequirement1Choice
	 * MarginRequirement1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RqrmntDtlsDueToA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequirementDetailsDueToA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of expected margin that will be either delivered to party A by party B or recalled to party A from party B."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV03#RequirementDetailsDueToA
	 * MarginCallRequestV03.RequirementDetailsDueToA}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock RequirementDetailsDueToA = new MMMessageBuildingBlock() {
		{
			xmlTag = "RqrmntDtlsDueToA";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequirementDetailsDueToA";
			definition = "Amount of expected margin that will be either delivered to party A by party B or recalled to party A from party B.";
			previousVersion_lazy = () -> com.tools20022.repository.area.colr.MarginCallRequestV03.RequirementDetailsDueToA;
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> MarginRequirement1Choice.mmObject();
		}
	};
	/**
	 * Amount of expected margin that will be either delivered to party B by
	 * party A or recalled to party B from party A.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.MarginRequirement1Choice
	 * MarginRequirement1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RqrmntDtlsDueToB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequirementDetailsDueToB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of expected margin that will be either delivered to party B by party A or recalled to party B from party A."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV03#RequirementDetailsDueToB
	 * MarginCallRequestV03.RequirementDetailsDueToB}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock RequirementDetailsDueToB = new MMMessageBuildingBlock() {
		{
			xmlTag = "RqrmntDtlsDueToB";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequirementDetailsDueToB";
			definition = "Amount of expected margin that will be either delivered to party B by party A or recalled to party B from party A.";
			previousVersion_lazy = () -> com.tools20022.repository.area.colr.MarginCallRequestV03.RequirementDetailsDueToB;
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> MarginRequirement1Choice.mmObject();
		}
	};
	/**
	 * Provides details about the type of collateral that will be either
	 * delivered to party A by party B or recalled to party A from party B.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ExpectedCollateral2Choice
	 * ExpectedCollateral2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpctdCollDueToA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedCollateralDueToA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the type of collateral that will be either delivered to party A by party B or recalled to party A from party B."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV03#ExpectedCollateralDueToA
	 * MarginCallRequestV03.ExpectedCollateralDueToA}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock ExpectedCollateralDueToA = new MMMessageBuildingBlock() {
		{
			xmlTag = "XpctdCollDueToA";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedCollateralDueToA";
			definition = "Provides details about the type of collateral that will be either delivered to party A by party B or recalled to party A from party B.";
			previousVersion_lazy = () -> com.tools20022.repository.area.colr.MarginCallRequestV03.ExpectedCollateralDueToA;
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> ExpectedCollateral2Choice.mmObject();
		}
	};
	/**
	 * Provides details about the type of collateral that will be either
	 * delivered to party B by party A or recalled to party B from party A.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ExpectedCollateral2Choice
	 * ExpectedCollateral2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpctdCollDueToB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedCollateralDueToB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the type of collateral that will be either delivered to party B by party A or recalled to party B from party A."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV03#ExpectedCollateralDueToB
	 * MarginCallRequestV03.ExpectedCollateralDueToB}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock ExpectedCollateralDueToB = new MMMessageBuildingBlock() {
		{
			xmlTag = "XpctdCollDueToB";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedCollateralDueToB";
			definition = "Provides details about the type of collateral that will be either delivered to party B by party A or recalled to party B from party A.";
			previousVersion_lazy = () -> com.tools20022.repository.area.colr.MarginCallRequestV03.ExpectedCollateralDueToB;
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> ExpectedCollateral2Choice.mmObject();
		}
	};
	/**
	 * Allows the reporting of the margin requirements for multiple accounts and
	 * report a single margin call amount made up of the aggregate of all the
	 * individual requirement amounts.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.MarginCall2
	 * MarginCall2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrgnCallDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginCallDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Allows the reporting of the margin requirements for multiple accounts and report a single margin call amount made up of the aggregate of all the individual requirement amounts."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock MarginCallDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "MrgnCallDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginCallDetails";
			definition = "Allows the reporting of the margin requirements for multiple accounts and report a single margin call amount made up of the aggregate of all the individual requirement amounts.";
			minOccurs = 0;
			complexType_lazy = () -> MarginCall2.mmObject();
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
	 * "Additional information that can not be captured in the structured fields and/or any other specific block. "
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV03#SupplementaryData
	 * MarginCallRequestV03.SupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock SupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block. ";
			previousVersion_lazy = () -> com.tools20022.repository.area.colr.MarginCallRequestV03.SupplementaryData;
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
	 * version} = "04"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getBusinessArea
	 * businessArea} = "colr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getMessageFunctionality
	 * messageFunctionality} = "003"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getFlavour
	 * flavour} = "001"</li>
	 * </ul>
	 */
	public static final MMMessageDefinitionIdentifier identifier = new MMMessageDefinitionIdentifier() {
		{
			businessArea = "colr";
			messageFunctionality = "003";
			version = "04";
			flavour = "001";
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MarginCallRequestV04";
				definition = "Scope\r\nThe MarginCallRequest message is sent by the collateral taker or its collateral manager to the collateral giver or its collateral manager\r\nThis message is used to request new collateral at the initiation of an exposure or request additional collateral for an existing exposure. It can also be used to recall collateral upon the collateral giver or its collateral manager's request.\r\n\r\nThe message definition is intended for use with the ISO20022 Business Application Header.\r\n\r\nUsage\r\nWhen sent by the collateral taker the MarginCallRequest message is used to:\r\n- request new collateral at the initiation of an exposure\r\n- request additional collateral\r\nWhen sent by the collateral giver the MarginCallRequest message is used to:\r\n- request the return of collateral";
				previousVersion_lazy = () -> MarginCallRequestV03.mmObject();
				messageSet_lazy = () -> Arrays.asList(CollateralManagementISOLatestversion.mmObject(), CollateralManagementMaintenance20162017.mmObject());
				rootElement = "Document";
				xmlTag = "MrgnCallReq";
				businessArea_lazy = () -> CollateralManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.colr.MarginCallRequestV04.TransactionIdentification, com.tools20022.repository.area.colr.MarginCallRequestV04.Obligation,
						com.tools20022.repository.area.colr.MarginCallRequestV04.Agreement, com.tools20022.repository.area.colr.MarginCallRequestV04.MarginCallResult,
						com.tools20022.repository.area.colr.MarginCallRequestV04.MarginDetailsDueToA, com.tools20022.repository.area.colr.MarginCallRequestV04.MarginDetailsDueToB,
						com.tools20022.repository.area.colr.MarginCallRequestV04.RequirementDetailsDueToA, com.tools20022.repository.area.colr.MarginCallRequestV04.RequirementDetailsDueToB,
						com.tools20022.repository.area.colr.MarginCallRequestV04.ExpectedCollateralDueToA, com.tools20022.repository.area.colr.MarginCallRequestV04.ExpectedCollateralDueToB,
						com.tools20022.repository.area.colr.MarginCallRequestV04.MarginCallDetails, com.tools20022.repository.area.colr.MarginCallRequestV04.SupplementaryData);
				messageDefinitionIdentifier_lazy = () -> com.tools20022.repository.area.colr.MarginCallRequestV04.identifier;
			}
		});
		return mmObject_lazy.get();
	}
}