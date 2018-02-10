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

package com.tools20022.repository.area.acmt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.AccountManagementArchive;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An account servicer, for example, a registrar, transfer agent or custodian
 * bank sends the AccountDetailsConfirmation message to the account owner, for
 * example, an investor to confirm the opening of an investment fund account,
 * execution of an AccountModificationInstruction or to return information
 * requested in a GetAccountDetails message.<br>
 * <b>Usage</b><br>
 * The AccountDetailsConfirmation message is used to confirm the opening of an
 * account, modification of an account or the provision of information requested
 * in a previously sent GetAccountDetails message. The message contains detailed
 * information relevant to the opened account.<br>
 * When the AccountDetailsConfirmation is used to confirm execution of an
 * AccountModificationInstruction message, it contains the modified subsets of
 * account details that were specified in the AccountModificationInstruction.<br>
 * When the AccountDetailsConfirmation is used to reply to a GetAccountDetails
 * message, it returns the selected subsets of account details that were
 * specified in the GetAccountDetails message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#mmMessageIdentification
 * AccountDetailsConfirmationV05.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#mmOrderReference
 * AccountDetailsConfirmationV05.mmOrderReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#mmRelatedReference
 * AccountDetailsConfirmationV05.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#mmConfirmationDetails
 * AccountDetailsConfirmationV05.mmConfirmationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#mmInvestmentAccount
 * AccountDetailsConfirmationV05.mmInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#mmAccountParties
 * AccountDetailsConfirmationV05.mmAccountParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#mmIntermediaries
 * AccountDetailsConfirmationV05.mmIntermediaries}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#mmPlacement
 * AccountDetailsConfirmationV05.mmPlacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#mmNewIssueAllocation
 * AccountDetailsConfirmationV05.mmNewIssueAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#mmSavingsInvestmentPlan
 * AccountDetailsConfirmationV05.mmSavingsInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#mmWithdrawalInvestmentPlan
 * AccountDetailsConfirmationV05.mmWithdrawalInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#mmCashSettlement
 * AccountDetailsConfirmationV05.mmCashSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#mmServiceLevelAgreement
 * AccountDetailsConfirmationV05.mmServiceLevelAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#mmMarketPracticeVersion
 * AccountDetailsConfirmationV05.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#mmExtension
 * AccountDetailsConfirmationV05.mmExtension}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AcctDtlsConf"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AccountManagementArchive
 * AccountManagementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code acmt.002.001.05}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestmentAccountRule#forAccountDetailsConfirmationV05
 * ConstraintInvestmentAccountRule.forAccountDetailsConfirmationV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintUnit1Rule#forAccountDetailsConfirmationV05
 * ConstraintUnit1Rule.forAccountDetailsConfirmationV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDividendPercentage1Rule#forAccountDetailsConfirmationV05
 * ConstraintDividendPercentage1Rule.forAccountDetailsConfirmationV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDividendPercentage2Rule#forAccountDetailsConfirmationV05
 * ConstraintDividendPercentage2Rule.forAccountDetailsConfirmationV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDividendPercentage3Rule#forAccountDetailsConfirmationV05
 * ConstraintDividendPercentage3Rule.forAccountDetailsConfirmationV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDividendPercentage4Rule#forAccountDetailsConfirmationV05
 * ConstraintDividendPercentage4Rule.forAccountDetailsConfirmationV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDividendPercentage5Rule#forAccountDetailsConfirmationV05
 * ConstraintDividendPercentage5Rule.forAccountDetailsConfirmationV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDividendPercentage6Rule#forAccountDetailsConfirmationV05
 * ConstraintDividendPercentage6Rule.forAccountDetailsConfirmationV05}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountDetailsConfirmationV05"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account servicer, for example, a registrar, transfer agent or custodian bank sends the AccountDetailsConfirmation message to the account owner, for example, an investor to confirm the opening of an investment fund account, execution of an AccountModificationInstruction or to return information requested in a GetAccountDetails message.\r\nUsage\r\nThe AccountDetailsConfirmation message is used to confirm the opening of an account, modification of an account or the provision of information requested in a previously sent GetAccountDetails message. The message contains detailed information relevant to the opened account.\r\nWhen the AccountDetailsConfirmation is used to confirm execution of an AccountModificationInstruction message, it contains the modified subsets of account details that were specified in the AccountModificationInstruction.\r\nWhen the AccountDetailsConfirmation is used to reply to a GetAccountDetails message, it returns the selected subsets of account details that were specified in the GetAccountDetails message."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06
 * AccountDetailsConfirmationV06}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04
 * AccountDetailsConfirmationV04}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountDetailsConfirmationV05", propOrder = {"messageIdentification", "orderReference", "relatedReference", "confirmationDetails", "investmentAccount", "accountParties", "intermediaries", "placement", "newIssueAllocation",
		"savingsInvestmentPlan", "withdrawalInvestmentPlan", "cashSettlement", "serviceLevelAgreement", "marketPracticeVersion", "extension"})
public class AccountDetailsConfirmationV05 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgId", required = true)
	protected MessageIdentification1 messageIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the message."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmMessageIdentification
	 * AccountDetailsConfirmationV06.mmMessageIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04#mmMessageIdentification
	 * AccountDetailsConfirmationV04.mmMessageIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessageIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Identifies the message.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV06.mmMessageIdentification);
			previousVersion_lazy = () -> AccountDetailsConfirmationV04.mmMessageIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountDetailsConfirmationV05.class.getMethod("getMessageIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "OrdrRef")
	protected InvestmentFundOrder4 orderReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder4
	 * InvestmentFundOrder4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies a related order."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmOrderReference
	 * AccountDetailsConfirmationV06.mmOrderReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04#mmOrderReference
	 * AccountDetailsConfirmationV04.mmOrderReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOrderReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "OrdrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderReference";
			definition = "Identifies a related order.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV06.mmOrderReference);
			previousVersion_lazy = () -> AccountDetailsConfirmationV04.mmOrderReference;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentFundOrder4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountDetailsConfirmationV05.class.getMethod("getOrderReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "RltdRef")
	protected AdditionalReference3 relatedReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to a linked message that was previously received."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmRelatedReference
	 * AccountDetailsConfirmationV06.mmRelatedReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04#mmRelatedReference
	 * AccountDetailsConfirmationV04.mmRelatedReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRelatedReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference to a linked message that was previously received.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV06.mmRelatedReference);
			previousVersion_lazy = () -> AccountDetailsConfirmationV04.mmRelatedReference;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountDetailsConfirmationV05.class.getMethod("getRelatedReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "ConfDtls", required = true)
	protected AccountManagementConfirmation2 confirmationDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementConfirmation2
	 * AccountManagementConfirmation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConfDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides detailed information about the request or instruction which triggered this confirmation. "
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmConfirmationDetails
	 * AccountDetailsConfirmationV06.mmConfirmationDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04#mmConfirmationDetails
	 * AccountDetailsConfirmationV04.mmConfirmationDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmConfirmationDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "ConfDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationDetails";
			definition = "Provides detailed information about the request or instruction which triggered this confirmation. ";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV06.mmConfirmationDetails);
			previousVersion_lazy = () -> AccountDetailsConfirmationV04.mmConfirmationDetails;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountManagementConfirmation2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountDetailsConfirmationV05.class.getMethod("getConfirmationDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "InvstmtAcct")
	protected InvestmentAccount46 investmentAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46
	 * InvestmentAccount46}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation of the information related to a selected investment account."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmInvestmentAccount
	 * AccountDetailsConfirmationV06.mmInvestmentAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04#mmInvestmentAccount
	 * AccountDetailsConfirmationV04.mmInvestmentAccount}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmInvestmentAccount = new MMMessageBuildingBlock() {
		{
			xmlTag = "InvstmtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccount";
			definition = "Confirmation of the information related to a selected investment account.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV06.mmInvestmentAccount);
			previousVersion_lazy = () -> AccountDetailsConfirmationV04.mmInvestmentAccount;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentAccount46.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountDetailsConfirmationV05.class.getMethod("getInvestmentAccount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "AcctPties")
	protected AccountParties12 accountParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties12
	 * AccountParties12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation of information related to parties who are related to a selected investment account."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmAccountParties
	 * AccountDetailsConfirmationV06.mmAccountParties}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04#mmAccountParties
	 * AccountDetailsConfirmationV04.mmAccountParties}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAccountParties = new MMMessageBuildingBlock() {
		{
			xmlTag = "AcctPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountParties";
			definition = "Confirmation of information related to parties who are related to a selected investment account.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV06.mmAccountParties);
			previousVersion_lazy = () -> AccountDetailsConfirmationV04.mmAccountParties;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AccountParties12.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountDetailsConfirmationV05.class.getMethod("getAccountParties", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "Intrmies")
	protected List<Intermediary24> intermediaries;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Intermediary24
	 * Intermediary24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Intrmies"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Intermediaries"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation of information related to intermediaries who are related to a selected investment account."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmIntermediaries
	 * AccountDetailsConfirmationV06.mmIntermediaries}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04#mmIntermediaries
	 * AccountDetailsConfirmationV04.mmIntermediaries}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmIntermediaries = new MMMessageBuildingBlock() {
		{
			xmlTag = "Intrmies";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Intermediaries";
			definition = "Confirmation of information related to intermediaries who are related to a selected investment account.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV06.mmIntermediaries);
			previousVersion_lazy = () -> AccountDetailsConfirmationV04.mmIntermediaries;
			maxOccurs = 10;
			minOccurs = 0;
			complexType_lazy = () -> Intermediary24.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountDetailsConfirmationV05.class.getMethod("getIntermediaries", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "Plcmnt")
	protected ReferredAgent1 placement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.ReferredAgent1
	 * ReferredAgent1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Plcmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Placement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Placement agent for the hedge fund industry."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmPlacement
	 * AccountDetailsConfirmationV06.mmPlacement}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04#mmPlacement
	 * AccountDetailsConfirmationV04.mmPlacement}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPlacement = new MMMessageBuildingBlock() {
		{
			xmlTag = "Plcmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Placement";
			definition = "Placement agent for the hedge fund industry.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV06.mmPlacement);
			previousVersion_lazy = () -> AccountDetailsConfirmationV04.mmPlacement;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ReferredAgent1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountDetailsConfirmationV05.class.getMethod("getPlacement", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "NewIsseAllcn")
	protected NewIssueAllocation2 newIssueAllocation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.NewIssueAllocation2
	 * NewIssueAllocation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewIsseAllcn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewIssueAllocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Eligibility conditions applicable when there is an allocation of new issues for hedge fund account opening."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmNewIssueAllocation
	 * AccountDetailsConfirmationV06.mmNewIssueAllocation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04#mmNewIssueAllocation
	 * AccountDetailsConfirmationV04.mmNewIssueAllocation}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmNewIssueAllocation = new MMMessageBuildingBlock() {
		{
			xmlTag = "NewIsseAllcn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewIssueAllocation";
			definition = "Eligibility conditions applicable when there is an allocation of new issues for hedge fund account opening.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV06.mmNewIssueAllocation);
			previousVersion_lazy = () -> AccountDetailsConfirmationV04.mmNewIssueAllocation;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> NewIssueAllocation2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountDetailsConfirmationV05.class.getMethod("getNewIssueAllocation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "SvgsInvstmtPlan")
	protected List<InvestmentPlan10> savingsInvestmentPlan;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan10
	 * InvestmentPlan10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvgsInvstmtPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SavingsInvestmentPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation of the information related to a savings plan that is related to a selected investment account."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmSavingsInvestmentPlan
	 * AccountDetailsConfirmationV06.mmSavingsInvestmentPlan}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04#mmSavingsInvestmentPlan
	 * AccountDetailsConfirmationV04.mmSavingsInvestmentPlan}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSavingsInvestmentPlan = new MMMessageBuildingBlock() {
		{
			xmlTag = "SvgsInvstmtPlan";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SavingsInvestmentPlan";
			definition = "Confirmation of the information related to a savings plan that is related to a selected investment account.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV06.mmSavingsInvestmentPlan);
			previousVersion_lazy = () -> AccountDetailsConfirmationV04.mmSavingsInvestmentPlan;
			maxOccurs = 50;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentPlan10.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountDetailsConfirmationV05.class.getMethod("getSavingsInvestmentPlan", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "WdrwlInvstmtPlan")
	protected List<InvestmentPlan10> withdrawalInvestmentPlan;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan10
	 * InvestmentPlan10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WdrwlInvstmtPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalInvestmentPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation of the information related to a withdrawal plan that is related to a selected investment account."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmWithdrawalInvestmentPlan
	 * AccountDetailsConfirmationV06.mmWithdrawalInvestmentPlan}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04#mmWithdrawalInvestmentPlan
	 * AccountDetailsConfirmationV04.mmWithdrawalInvestmentPlan}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmWithdrawalInvestmentPlan = new MMMessageBuildingBlock() {
		{
			xmlTag = "WdrwlInvstmtPlan";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalInvestmentPlan";
			definition = "Confirmation of the information related to a withdrawal plan that is related to a selected investment account.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV06.mmWithdrawalInvestmentPlan);
			previousVersion_lazy = () -> AccountDetailsConfirmationV04.mmWithdrawalInvestmentPlan;
			maxOccurs = 10;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentPlan10.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountDetailsConfirmationV05.class.getMethod("getWithdrawalInvestmentPlan", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "CshSttlm")
	protected List<InvestmentFundCashSettlementInformation7> cashSettlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation7
	 * InvestmentFundCashSettlementInformation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshSttlm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation of the cash settlement standing instruction associated to the investment fund transaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmCashSettlement
	 * AccountDetailsConfirmationV06.mmCashSettlement}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04#mmCashSettlement
	 * AccountDetailsConfirmationV04.mmCashSettlement}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCashSettlement = new MMMessageBuildingBlock() {
		{
			xmlTag = "CshSttlm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlement";
			definition = "Confirmation of the cash settlement standing instruction associated to the investment fund transaction.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV06.mmCashSettlement);
			previousVersion_lazy = () -> AccountDetailsConfirmationV04.mmCashSettlement;
			maxOccurs = 8;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentFundCashSettlementInformation7.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountDetailsConfirmationV05.class.getMethod("getCashSettlement", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "SvcLvlAgrmt")
	protected List<DocumentToSend2> serviceLevelAgreement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.DocumentToSend2
	 * DocumentToSend2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcLvlAgrmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceLevelAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies documents to be provided for the account opening."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmServiceLevelAgreement
	 * AccountDetailsConfirmationV06.mmServiceLevelAgreement}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04#mmServiceLevelAgreement
	 * AccountDetailsConfirmationV04.mmServiceLevelAgreement}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmServiceLevelAgreement = new MMMessageBuildingBlock() {
		{
			xmlTag = "SvcLvlAgrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceLevelAgreement";
			definition = "Identifies documents to be provided for the account opening.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV06.mmServiceLevelAgreement);
			previousVersion_lazy = () -> AccountDetailsConfirmationV04.mmServiceLevelAgreement;
			maxOccurs = 30;
			minOccurs = 0;
			complexType_lazy = () -> DocumentToSend2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountDetailsConfirmationV05.class.getMethod("getServiceLevelAgreement", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "MktPrctcVrsn")
	protected MarketPracticeVersion1 marketPracticeVersion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MarketPracticeVersion1
	 * MarketPracticeVersion1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktPrctcVrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketPracticeVersion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the market practice to which the message conforms."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmMarketPracticeVersion
	 * AccountDetailsConfirmationV06.mmMarketPracticeVersion}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04#mmMarketPracticeVersion
	 * AccountDetailsConfirmationV04.mmMarketPracticeVersion}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMarketPracticeVersion = new MMMessageBuildingBlock() {
		{
			xmlTag = "MktPrctcVrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketPracticeVersion";
			definition = "Identifies the market practice to which the message conforms.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV06.mmMarketPracticeVersion);
			previousVersion_lazy = () -> AccountDetailsConfirmationV04.mmMarketPracticeVersion;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MarketPracticeVersion1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountDetailsConfirmationV05.class.getMethod("getMarketPracticeVersion", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "Xtnsn")
	protected List<Extension1> extension;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Extension1
	 * Extension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Xtnsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Extension"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmExtension
	 * AccountDetailsConfirmationV06.mmExtension}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04#mmExtension
	 * AccountDetailsConfirmationV04.mmExtension}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmExtension = new MMMessageBuildingBlock() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV06.mmExtension);
			previousVersion_lazy = () -> AccountDetailsConfirmationV04.mmExtension;
			minOccurs = 0;
			complexType_lazy = () -> Extension1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountDetailsConfirmationV05.class.getMethod("getExtension", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInvestmentAccountRule.forAccountDetailsConfirmationV05,
						com.tools20022.repository.constraints.ConstraintUnit1Rule.forAccountDetailsConfirmationV05, com.tools20022.repository.constraints.ConstraintDividendPercentage1Rule.forAccountDetailsConfirmationV05,
						com.tools20022.repository.constraints.ConstraintDividendPercentage2Rule.forAccountDetailsConfirmationV05, com.tools20022.repository.constraints.ConstraintDividendPercentage3Rule.forAccountDetailsConfirmationV05,
						com.tools20022.repository.constraints.ConstraintDividendPercentage4Rule.forAccountDetailsConfirmationV05, com.tools20022.repository.constraints.ConstraintDividendPercentage5Rule.forAccountDetailsConfirmationV05,
						com.tools20022.repository.constraints.ConstraintDividendPercentage6Rule.forAccountDetailsConfirmationV05);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "AccountDetailsConfirmationV05";
				definition = "Scope\r\nAn account servicer, for example, a registrar, transfer agent or custodian bank sends the AccountDetailsConfirmation message to the account owner, for example, an investor to confirm the opening of an investment fund account, execution of an AccountModificationInstruction or to return information requested in a GetAccountDetails message.\r\nUsage\r\nThe AccountDetailsConfirmation message is used to confirm the opening of an account, modification of an account or the provision of information requested in a previously sent GetAccountDetails message. The message contains detailed information relevant to the opened account.\r\nWhen the AccountDetailsConfirmation is used to confirm execution of an AccountModificationInstruction message, it contains the modified subsets of account details that were specified in the AccountModificationInstruction.\r\nWhen the AccountDetailsConfirmation is used to reply to a GetAccountDetails message, it returns the selected subsets of account details that were specified in the GetAccountDetails message.";
				nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV06.mmObject());
				previousVersion_lazy = () -> AccountDetailsConfirmationV04.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "AcctDtlsConf";
				businessArea_lazy = () -> AccountManagementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05.mmMessageIdentification, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05.mmOrderReference,
						com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05.mmRelatedReference, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05.mmConfirmationDetails,
						com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05.mmInvestmentAccount, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05.mmAccountParties,
						com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05.mmIntermediaries, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05.mmPlacement,
						com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05.mmNewIssueAllocation, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05.mmSavingsInvestmentPlan,
						com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05.mmWithdrawalInvestmentPlan, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05.mmCashSettlement,
						com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05.mmServiceLevelAgreement, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05.mmMarketPracticeVersion,
						com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "acmt";
						messageFunctionality = "002";
						version = "05";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AccountDetailsConfirmationV05.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public AccountDetailsConfirmationV05 setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public Optional<InvestmentFundOrder4> getOrderReference() {
		return orderReference == null ? Optional.empty() : Optional.of(orderReference);
	}

	public AccountDetailsConfirmationV05 setOrderReference(InvestmentFundOrder4 orderReference) {
		this.orderReference = orderReference;
		return this;
	}

	public Optional<AdditionalReference3> getRelatedReference() {
		return relatedReference == null ? Optional.empty() : Optional.of(relatedReference);
	}

	public AccountDetailsConfirmationV05 setRelatedReference(AdditionalReference3 relatedReference) {
		this.relatedReference = relatedReference;
		return this;
	}

	public AccountManagementConfirmation2 getConfirmationDetails() {
		return confirmationDetails;
	}

	public AccountDetailsConfirmationV05 setConfirmationDetails(AccountManagementConfirmation2 confirmationDetails) {
		this.confirmationDetails = Objects.requireNonNull(confirmationDetails);
		return this;
	}

	public Optional<InvestmentAccount46> getInvestmentAccount() {
		return investmentAccount == null ? Optional.empty() : Optional.of(investmentAccount);
	}

	public AccountDetailsConfirmationV05 setInvestmentAccount(InvestmentAccount46 investmentAccount) {
		this.investmentAccount = investmentAccount;
		return this;
	}

	public Optional<AccountParties12> getAccountParties() {
		return accountParties == null ? Optional.empty() : Optional.of(accountParties);
	}

	public AccountDetailsConfirmationV05 setAccountParties(AccountParties12 accountParties) {
		this.accountParties = accountParties;
		return this;
	}

	public List<Intermediary24> getIntermediaries() {
		return intermediaries == null ? intermediaries = new ArrayList<>() : intermediaries;
	}

	public AccountDetailsConfirmationV05 setIntermediaries(List<Intermediary24> intermediaries) {
		this.intermediaries = Objects.requireNonNull(intermediaries);
		return this;
	}

	public Optional<ReferredAgent1> getPlacement() {
		return placement == null ? Optional.empty() : Optional.of(placement);
	}

	public AccountDetailsConfirmationV05 setPlacement(ReferredAgent1 placement) {
		this.placement = placement;
		return this;
	}

	public Optional<NewIssueAllocation2> getNewIssueAllocation() {
		return newIssueAllocation == null ? Optional.empty() : Optional.of(newIssueAllocation);
	}

	public AccountDetailsConfirmationV05 setNewIssueAllocation(NewIssueAllocation2 newIssueAllocation) {
		this.newIssueAllocation = newIssueAllocation;
		return this;
	}

	public List<InvestmentPlan10> getSavingsInvestmentPlan() {
		return savingsInvestmentPlan == null ? savingsInvestmentPlan = new ArrayList<>() : savingsInvestmentPlan;
	}

	public AccountDetailsConfirmationV05 setSavingsInvestmentPlan(List<InvestmentPlan10> savingsInvestmentPlan) {
		this.savingsInvestmentPlan = Objects.requireNonNull(savingsInvestmentPlan);
		return this;
	}

	public List<InvestmentPlan10> getWithdrawalInvestmentPlan() {
		return withdrawalInvestmentPlan == null ? withdrawalInvestmentPlan = new ArrayList<>() : withdrawalInvestmentPlan;
	}

	public AccountDetailsConfirmationV05 setWithdrawalInvestmentPlan(List<InvestmentPlan10> withdrawalInvestmentPlan) {
		this.withdrawalInvestmentPlan = Objects.requireNonNull(withdrawalInvestmentPlan);
		return this;
	}

	public List<InvestmentFundCashSettlementInformation7> getCashSettlement() {
		return cashSettlement == null ? cashSettlement = new ArrayList<>() : cashSettlement;
	}

	public AccountDetailsConfirmationV05 setCashSettlement(List<InvestmentFundCashSettlementInformation7> cashSettlement) {
		this.cashSettlement = Objects.requireNonNull(cashSettlement);
		return this;
	}

	public List<DocumentToSend2> getServiceLevelAgreement() {
		return serviceLevelAgreement == null ? serviceLevelAgreement = new ArrayList<>() : serviceLevelAgreement;
	}

	public AccountDetailsConfirmationV05 setServiceLevelAgreement(List<DocumentToSend2> serviceLevelAgreement) {
		this.serviceLevelAgreement = Objects.requireNonNull(serviceLevelAgreement);
		return this;
	}

	public Optional<MarketPracticeVersion1> getMarketPracticeVersion() {
		return marketPracticeVersion == null ? Optional.empty() : Optional.of(marketPracticeVersion);
	}

	public AccountDetailsConfirmationV05 setMarketPracticeVersion(MarketPracticeVersion1 marketPracticeVersion) {
		this.marketPracticeVersion = marketPracticeVersion;
		return this;
	}

	public List<Extension1> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public AccountDetailsConfirmationV05 setExtension(List<Extension1> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.002.001.05")
	static public class Document {
		@XmlElement(name = "AcctDtlsConf", required = true)
		public AccountDetailsConfirmationV05 messageBody;
	}
}