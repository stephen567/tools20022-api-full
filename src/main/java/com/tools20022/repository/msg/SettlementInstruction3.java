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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.CashSettlement;
import com.tools20022.repository.entity.CashSettlementInstructionPartyRole;
import com.tools20022.repository.entity.InstructedReimbursementAgent;
import com.tools20022.repository.entity.Organisation;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides further details on the settlement of the instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstruction3#mmInstructingReimbursementAgent
 * SettlementInstruction3.mmInstructingReimbursementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstruction3#mmInstructingReimbursementAgentAccount
 * SettlementInstruction3.mmInstructingReimbursementAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstruction3#mmInstructedReimbursementAgent
 * SettlementInstruction3.mmInstructedReimbursementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstruction3#mmInstructedReimbursementAgentAccount
 * SettlementInstruction3.mmInstructedReimbursementAgentAccount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashSettlement
 * CashSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructingReimbursementAgentAccountRule#forSettlementInstruction3
 * ConstraintInstructingReimbursementAgentAccountRule.forSettlementInstruction3}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructedReimbursementAgentAccountRule#forSettlementInstruction3
 * ConstraintInstructedReimbursementAgentAccountRule.forSettlementInstruction3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementInstruction3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides further details on the settlement of the instruction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SettlementInstruction3", propOrder = {"instructingReimbursementAgent", "instructingReimbursementAgentAccount", "instructedReimbursementAgent", "instructedReimbursementAgentAccount"})
public class SettlementInstruction3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "InstgRmbrsmntAgt")
	protected BranchAndFinancialInstitutionIdentification5 instructingReimbursementAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction3
	 * SettlementInstruction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstgRmbrsmntAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructingReimbursementAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent through which the instructing agent will reimburse the instructed agent.\nUsage: If InstructingAgent and InstructedAgent have the same reimbursement agent, then only InstructingReimbursementAgent must be used."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstructingReimbursementAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstruction3.mmObject();
			isDerived = false;
			xmlTag = "InstgRmbrsmntAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructingReimbursementAgent";
			definition = "Agent through which the instructing agent will reimburse the instructed agent.\nUsage: If InstructingAgent and InstructedAgent have the same reimbursement agent, then only InstructingReimbursementAgent must be used.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5.mmObject();
		}
	};
	@XmlElement(name = "InstgRmbrsmntAgtAcct")
	protected CashAccount24 instructingReimbursementAgentAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount24
	 * CashAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlementInstructionPartyRole#mmCashAccount
	 * CashSettlementInstructionPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction3
	 * SettlementInstruction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstgRmbrsmntAgtAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructingReimbursementAgentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account of the instructing reimbursement agent account at its servicing agent in the payment chain."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstructingReimbursementAgentAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CashSettlementInstructionPartyRole.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstruction3.mmObject();
			isDerived = false;
			xmlTag = "InstgRmbrsmntAgtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructingReimbursementAgentAccount";
			definition = "Unambiguous identification of the account of the instructing reimbursement agent account at its servicing agent in the payment chain.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount24.mmObject();
		}
	};
	@XmlElement(name = "InstdRmbrsmntAgt")
	protected BranchAndFinancialInstitutionIdentification5 instructedReimbursementAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InstructedReimbursementAgent
	 * InstructedReimbursementAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction3
	 * SettlementInstruction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstdRmbrsmntAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedReimbursementAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent at which the instructed agent will be reimbursed.\nUsage: If InstructedReimbursementAgent contains a branch of the InstructedAgent, then the party in InstructedAgent will claim reimbursement from that branch/will be paid by that branch.\nUsage: If InstructingAgent and InstructedAgent have the same reimbursement agent, then only InstructingReimbursementAgent must be used."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstructedReimbursementAgent = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> InstructedReimbursementAgent.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstruction3.mmObject();
			isDerived = false;
			xmlTag = "InstdRmbrsmntAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedReimbursementAgent";
			definition = "Agent at which the instructed agent will be reimbursed.\nUsage: If InstructedReimbursementAgent contains a branch of the InstructedAgent, then the party in InstructedAgent will claim reimbursement from that branch/will be paid by that branch.\nUsage: If InstructingAgent and InstructedAgent have the same reimbursement agent, then only InstructingReimbursementAgent must be used.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5.mmObject();
		}
	};
	@XmlElement(name = "InstdRmbrsmntAgtAcct")
	protected CashAccount24 instructedReimbursementAgentAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount24
	 * CashAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlementInstructionPartyRole#mmCashAccount
	 * CashSettlementInstructionPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction3
	 * SettlementInstruction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstdRmbrsmntAgtAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedReimbursementAgentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account of the instructed reimbursement agent account at its servicing agent in the payment chain."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstructedReimbursementAgentAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CashSettlementInstructionPartyRole.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstruction3.mmObject();
			isDerived = false;
			xmlTag = "InstdRmbrsmntAgtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedReimbursementAgentAccount";
			definition = "Unambiguous identification of the account of the instructed reimbursement agent account at its servicing agent in the payment chain.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount24.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementInstruction3.mmInstructingReimbursementAgent, com.tools20022.repository.msg.SettlementInstruction3.mmInstructingReimbursementAgentAccount,
						com.tools20022.repository.msg.SettlementInstruction3.mmInstructedReimbursementAgent, com.tools20022.repository.msg.SettlementInstruction3.mmInstructedReimbursementAgentAccount);
				trace_lazy = () -> CashSettlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInstructingReimbursementAgentAccountRule.forSettlementInstruction3,
						com.tools20022.repository.constraints.ConstraintInstructedReimbursementAgentAccountRule.forSettlementInstruction3);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementInstruction3";
				definition = "Provides further details on the settlement of the instruction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getInstructingReimbursementAgent() {
		return instructingReimbursementAgent == null ? Optional.empty() : Optional.of(instructingReimbursementAgent);
	}

	public SettlementInstruction3 setInstructingReimbursementAgent(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5 instructingReimbursementAgent) {
		this.instructingReimbursementAgent = instructingReimbursementAgent;
		return this;
	}

	public Optional<CashAccount24> getInstructingReimbursementAgentAccount() {
		return instructingReimbursementAgentAccount == null ? Optional.empty() : Optional.of(instructingReimbursementAgentAccount);
	}

	public SettlementInstruction3 setInstructingReimbursementAgentAccount(com.tools20022.repository.msg.CashAccount24 instructingReimbursementAgentAccount) {
		this.instructingReimbursementAgentAccount = instructingReimbursementAgentAccount;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getInstructedReimbursementAgent() {
		return instructedReimbursementAgent == null ? Optional.empty() : Optional.of(instructedReimbursementAgent);
	}

	public SettlementInstruction3 setInstructedReimbursementAgent(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5 instructedReimbursementAgent) {
		this.instructedReimbursementAgent = instructedReimbursementAgent;
		return this;
	}

	public Optional<CashAccount24> getInstructedReimbursementAgentAccount() {
		return instructedReimbursementAgentAccount == null ? Optional.empty() : Optional.of(instructedReimbursementAgentAccount);
	}

	public SettlementInstruction3 setInstructedReimbursementAgentAccount(com.tools20022.repository.msg.CashAccount24 instructedReimbursementAgentAccount) {
		this.instructedReimbursementAgentAccount = instructedReimbursementAgentAccount;
		return this;
	}
}