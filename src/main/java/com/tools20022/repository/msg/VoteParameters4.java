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
import com.tools20022.repository.choice.DateFormat29Choice;
import com.tools20022.repository.codeset.VoteInstruction2Code;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.ElectronicAddress;
import com.tools20022.repository.entity.PostalAddress;
import com.tools20022.repository.entity.VotingCondition;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information describing how the voting process is organised.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters4#SecuritiesQuantityRequiredToVote
 * VoteParameters4.SecuritiesQuantityRequiredToVote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters4#PartialVoteAllowed
 * VoteParameters4.PartialVoteAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters4#SplitVoteAllowed
 * VoteParameters4.SplitVoteAllowed}</li>
 * <li>{@linkplain com.tools20022.repository.msg.VoteParameters4#VoteDeadline
 * VoteParameters4.VoteDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters4#VoteSTPDeadline
 * VoteParameters4.VoteSTPDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters4#VoteMarketDeadline
 * VoteParameters4.VoteMarketDeadline}</li>
 * <li>{@linkplain com.tools20022.repository.msg.VoteParameters4#VoteMethods
 * VoteParameters4.VoteMethods}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters4#VotingBallotElectronicAddress
 * VoteParameters4.VotingBallotElectronicAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters4#VotingBallotRequestAddress
 * VoteParameters4.VotingBallotRequestAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters4#RevocabilityDeadline
 * VoteParameters4.RevocabilityDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters4#RevocabilitySTPDeadline
 * VoteParameters4.RevocabilitySTPDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters4#RevocabilityMarketDeadline
 * VoteParameters4.RevocabilityMarketDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters4#BeneficialOwnerDisclosure
 * VoteParameters4.BeneficialOwnerDisclosure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters4#VoteInstructionType
 * VoteParameters4.VoteInstructionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters4#EarlyIncentivePremium
 * VoteParameters4.EarlyIncentivePremium}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters4#IncentivePremium
 * VoteParameters4.IncentivePremium}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters4#EarlyVoteWithPremiumDeadline
 * VoteParameters4.EarlyVoteWithPremiumDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters4#VoteWithPremiumDeadline
 * VoteParameters4.VoteWithPremiumDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters4#VoteWithPremiumSTPDeadline
 * VoteParameters4.VoteWithPremiumSTPDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters4#VoteWithPremiumMarketDeadline
 * VoteParameters4.VoteWithPremiumMarketDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters4#AdditionalVotingRequirements
 * VoteParameters4.AdditionalVotingRequirements}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters4#PreviousInstructionInvalidityIndicator
 * VoteParameters4.PreviousInstructionInvalidityIndicator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.VotingCondition
 * VotingCondition}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV05#Vote
 * MeetingNotificationV05.Vote}</li>
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
 * "VoteParameters4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information describing how the voting process is organised."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.VoteParameters3
 * VoteParameters3}</li>
 * </ul>
 */
public class VoteParameters4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Number of holdings required for a vote.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.VotingCondition#SecuritiesQuantityRequiredToVote
	 * VotingCondition.SecuritiesQuantityRequiredToVote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4
	 * VoteParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesQtyReqrdToVote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesQuantityRequiredToVote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of holdings required for a vote."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#SecuritiesQuantityRequiredToVote
	 * VoteParameters3.SecuritiesQuantityRequiredToVote}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute SecuritiesQuantityRequiredToVote = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> VoteParameters4.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.VotingCondition.SecuritiesQuantityRequiredToVote;
			isDerived = false;
			xmlTag = "SctiesQtyReqrdToVote";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesQuantityRequiredToVote";
			definition = "Number of holdings required for a vote.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.VoteParameters3.SecuritiesQuantityRequiredToVote;
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Specifies whether it is allowed to only vote on a part of the entire
	 * holding, leaving part of the position un-voted.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.VotingCondition#PartialVoteAllowed
	 * VotingCondition.PartialVoteAllowed}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4
	 * VoteParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtlVoteAllwd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialVoteAllowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether it is allowed to only vote on a part of the entire holding, leaving part of the position un-voted."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#PartialVoteAllowed
	 * VoteParameters3.PartialVoteAllowed}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute PartialVoteAllowed = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> VoteParameters4.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.VotingCondition.PartialVoteAllowed;
			isDerived = false;
			xmlTag = "PrtlVoteAllwd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialVoteAllowed";
			definition = "Specifies whether it is allowed to only vote on a part of the entire holding, leaving part of the position un-voted.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.VoteParameters3.PartialVoteAllowed;
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies whether it is allowed to vote in different directions for the
	 * entire holding.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.VotingCondition#SplitVoteAllowed
	 * VotingCondition.SplitVoteAllowed}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4
	 * VoteParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SpltVoteAllwd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SplitVoteAllowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether it is allowed to vote in different directions for the entire holding."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#SplitVoteAllowed
	 * VoteParameters3.SplitVoteAllowed}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute SplitVoteAllowed = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> VoteParameters4.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.VotingCondition.SplitVoteAllowed;
			isDerived = false;
			xmlTag = "SpltVoteAllwd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SplitVoteAllowed";
			definition = "Specifies whether it is allowed to vote in different directions for the entire holding.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.VoteParameters3.SplitVoteAllowed;
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Date and time by which the vote instructions should be submitted to the
	 * intermediary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat29Choice
	 * DateFormat29Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#IntermediaryDeadline
	 * Deadline.IntermediaryDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4
	 * VoteParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VoteDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time by which the vote instructions should be submitted to the intermediary."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#VoteDeadline
	 * VoteParameters3.VoteDeadline}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute VoteDeadline = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> VoteParameters4.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Deadline.IntermediaryDeadline;
			isDerived = false;
			xmlTag = "VoteDdln";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteDeadline";
			definition = "Date and time by which the vote instructions should be submitted to the intermediary.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.VoteParameters3.VoteDeadline;
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> DateFormat29Choice.mmObject();
		}
	};
	/**
	 * Date and time by which the vote instructions should be submitted to the
	 * intermediary (STP mode).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat29Choice
	 * DateFormat29Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#STPDeadline
	 * Deadline.STPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4
	 * VoteParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VoteSTPDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteSTPDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time by which the vote instructions should be submitted to the intermediary (STP mode)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#VoteSTPDeadline
	 * VoteParameters3.VoteSTPDeadline}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute VoteSTPDeadline = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> VoteParameters4.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Deadline.STPDeadline;
			isDerived = false;
			xmlTag = "VoteSTPDdln";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteSTPDeadline";
			definition = "Date and time by which the vote instructions should be submitted to the intermediary (STP mode).";
			previousVersion_lazy = () -> com.tools20022.repository.msg.VoteParameters3.VoteSTPDeadline;
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> DateFormat29Choice.mmObject();
		}
	};
	/**
	 * Date and time by which the vote instructions should be submitted to the
	 * issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat29Choice
	 * DateFormat29Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#MarketDeadline
	 * Deadline.MarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4
	 * VoteParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VoteMktDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteMarketDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time by which the vote instructions should be submitted to the issuer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#VoteMarketDeadline
	 * VoteParameters3.VoteMarketDeadline}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute VoteMarketDeadline = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> VoteParameters4.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Deadline.MarketDeadline;
			isDerived = false;
			xmlTag = "VoteMktDdln";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteMarketDeadline";
			definition = "Date and time by which the vote instructions should be submitted to the issuer.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.VoteParameters3.VoteMarketDeadline;
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> DateFormat29Choice.mmObject();
		}
	};
	/**
	 * Indicates the different methods that can be used to vote.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.VoteMethods2
	 * VoteMethods2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.VotingCondition#VoteLocation
	 * VotingCondition.VoteLocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4
	 * VoteParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VoteMthds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteMethods"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the different methods that can be used to vote."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#VoteMethods
	 * VoteParameters3.VoteMethods}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd VoteMethods = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> VoteParameters4.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.VotingCondition.VoteLocation;
			isDerived = false;
			xmlTag = "VoteMthds";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteMethods";
			definition = "Indicates the different methods that can be used to vote.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.VoteParameters3.VoteMethods;
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> VoteMethods2.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Electronic location, e-mail or URL address, where the voting ballot can
	 * be requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CommunicationAddress4
	 * CommunicationAddress4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicAddress
	 * ElectronicAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4
	 * VoteParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VtngBlltElctrncAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VotingBallotElectronicAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Electronic location, e-mail or URL address, where the voting ballot can be requested."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#VotingBallotElectronicAddress
	 * VoteParameters3.VotingBallotElectronicAddress}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd VotingBallotElectronicAddress = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> VoteParameters4.mmObject();
			businessComponentTrace_lazy = () -> ElectronicAddress.mmObject();
			isDerived = false;
			xmlTag = "VtngBlltElctrncAdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VotingBallotElectronicAddress";
			definition = "Electronic location, e-mail or URL address, where the voting ballot can be requested.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.VoteParameters3.VotingBallotElectronicAddress;
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CommunicationAddress4.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Specifies the postal address where the voting ballot can be requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PostalAddress1
	 * PostalAddress1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4
	 * VoteParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VtngBlltReqAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VotingBallotRequestAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the postal address where the voting ballot can be requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#VotingBallotRequestAddress
	 * VoteParameters3.VotingBallotRequestAddress}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd VotingBallotRequestAddress = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> VoteParameters4.mmObject();
			businessComponentTrace_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			xmlTag = "VtngBlltReqAdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VotingBallotRequestAddress";
			definition = "Specifies the postal address where the voting ballot can be requested.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.VoteParameters3.VotingBallotRequestAddress;
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PostalAddress1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Date till which the instructing party can revoke, change or withdraw its
	 * voting instruction. This deadline is specified by an intermediary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat29Choice
	 * DateFormat29Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#IntermediaryDeadline
	 * Deadline.IntermediaryDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4
	 * VoteParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RvcbltyDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevocabilityDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date till which the instructing party can revoke, change or withdraw its voting instruction. This deadline is specified by an intermediary."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#RevocabilityDeadline
	 * VoteParameters3.RevocabilityDeadline}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute RevocabilityDeadline = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> VoteParameters4.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Deadline.IntermediaryDeadline;
			isDerived = false;
			xmlTag = "RvcbltyDdln";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevocabilityDeadline";
			definition = "Date till which the instructing party can revoke, change or withdraw its voting instruction. This deadline is specified by an intermediary.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.VoteParameters3.RevocabilityDeadline;
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> DateFormat29Choice.mmObject();
		}
	};
	/**
	 * Date till which the instructing party can revoke, change or withdraw its
	 * voting instruction. This deadline is specified by an intermediary (STP
	 * mode).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat29Choice
	 * DateFormat29Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#STPDeadline
	 * Deadline.STPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4
	 * VoteParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RvcbltySTPDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevocabilitySTPDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date till which the instructing party can revoke, change or withdraw its voting instruction. This deadline is specified by an intermediary (STP mode)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#RevocabilitySTPDeadline
	 * VoteParameters3.RevocabilitySTPDeadline}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute RevocabilitySTPDeadline = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> VoteParameters4.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Deadline.STPDeadline;
			isDerived = false;
			xmlTag = "RvcbltySTPDdln";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevocabilitySTPDeadline";
			definition = "Date till which the instructing party can revoke, change or withdraw its voting instruction. This deadline is specified by an intermediary (STP mode).";
			previousVersion_lazy = () -> com.tools20022.repository.msg.VoteParameters3.RevocabilitySTPDeadline;
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> DateFormat29Choice.mmObject();
		}
	};
	/**
	 * Date till which the instructing party can revoke, change or withdraw its
	 * voting instruction. This deadline is set by the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat29Choice
	 * DateFormat29Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#MarketDeadline
	 * Deadline.MarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4
	 * VoteParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RvcbltyMktDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevocabilityMarketDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date till which the instructing party can revoke, change or withdraw its voting instruction. This deadline is set by the issuer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#RevocabilityMarketDeadline
	 * VoteParameters3.RevocabilityMarketDeadline}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute RevocabilityMarketDeadline = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> VoteParameters4.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Deadline.MarketDeadline;
			isDerived = false;
			xmlTag = "RvcbltyMktDdln";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevocabilityMarketDeadline";
			definition = "Date till which the instructing party can revoke, change or withdraw its voting instruction. This deadline is set by the issuer.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.VoteParameters3.RevocabilityMarketDeadline;
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> DateFormat29Choice.mmObject();
		}
	};
	/**
	 * Indicates whether beneficiary details, for example, name and address,
	 * must be supplied in order to take part in a meeting.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.VotingCondition#BeneficialOwnerDisclosure
	 * VotingCondition.BeneficialOwnerDisclosure}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4
	 * VoteParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BnfclOwnrDsclsr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficialOwnerDisclosure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether beneficiary details, for example, name and address, must be supplied in order to take part in a meeting."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#BeneficialOwnerDisclosure
	 * VoteParameters3.BeneficialOwnerDisclosure}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute BeneficialOwnerDisclosure = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> VoteParameters4.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.VotingCondition.BeneficialOwnerDisclosure;
			isDerived = false;
			xmlTag = "BnfclOwnrDsclsr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficialOwnerDisclosure";
			definition = "Indicates whether beneficiary details, for example, name and address, must be supplied in order to take part in a meeting.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.VoteParameters3.BeneficialOwnerDisclosure;
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Identifies the possible types of voting instructions. When used at the
	 * resolution level, it supersedes the value specified in the meeting
	 * notice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.VoteInstruction2Code
	 * VoteInstruction2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.VotingCondition#VoteInstructionType
	 * VotingCondition.VoteInstructionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4
	 * VoteParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VoteInstrTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteInstructionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the possible types of voting instructions. When used at the resolution level, it supersedes the value specified in the meeting notice."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#VoteInstructionType
	 * VoteParameters3.VoteInstructionType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute VoteInstructionType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> VoteParameters4.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.VotingCondition.VoteInstructionType;
			isDerived = false;
			xmlTag = "VoteInstrTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteInstructionType";
			definition = "Identifies the possible types of voting instructions. When used at the resolution level, it supersedes the value specified in the meeting notice.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.VoteParameters3.VoteInstructionType;
			minOccurs = 0;
			maxOccurs = 8;
			simpleType_lazy = () -> VoteInstruction2Code.mmObject();
		}
	};
	/**
	 * Cash premium paid to the security holder when voting earlier (before the
	 * early vote with premium deadline).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IncentivePremium3
	 * IncentivePremium3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.VotingCondition#IncentivePremium
	 * VotingCondition.IncentivePremium}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4
	 * VoteParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EarlyIncntivPrm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarlyIncentivePremium"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash premium paid to the security holder when voting earlier (before the early vote with premium deadline)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd EarlyIncentivePremium = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> VoteParameters4.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.VotingCondition.IncentivePremium;
			isDerived = false;
			xmlTag = "EarlyIncntivPrm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarlyIncentivePremium";
			definition = "Cash premium paid to the security holder when voting earlier (before the early vote with premium deadline).";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> IncentivePremium3.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Cash premium paid to the security holder when voting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IncentivePremium3
	 * IncentivePremium3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.VotingCondition#IncentivePremium
	 * VotingCondition.IncentivePremium}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4
	 * VoteParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IncntivPrm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncentivePremium"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash premium paid to the security holder when voting."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#IncentivePremium
	 * VoteParameters3.IncentivePremium}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd IncentivePremium = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> VoteParameters4.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.VotingCondition.IncentivePremium;
			isDerived = false;
			xmlTag = "IncntivPrm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncentivePremium";
			definition = "Cash premium paid to the security holder when voting.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.VoteParameters3.IncentivePremium;
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> IncentivePremium3.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Date and time by which the vote instructions should be submitted to the
	 * intermediary to take advantage of the early incentive premium.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat29Choice
	 * DateFormat29Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#IntermediaryDeadline
	 * Deadline.IntermediaryDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4
	 * VoteParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EarlyVoteWthPrmDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarlyVoteWithPremiumDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time by which the vote instructions should be submitted to the intermediary to take advantage of the early incentive premium."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd EarlyVoteWithPremiumDeadline = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> VoteParameters4.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Deadline.IntermediaryDeadline;
			isDerived = false;
			xmlTag = "EarlyVoteWthPrmDdln";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarlyVoteWithPremiumDeadline";
			definition = "Date and time by which the vote instructions should be submitted to the intermediary to take advantage of the early incentive premium.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> DateFormat29Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Date and time by which the vote instructions should be submitted to the
	 * intermediary to take advantage of the premium.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat29Choice
	 * DateFormat29Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#IntermediaryDeadline
	 * Deadline.IntermediaryDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4
	 * VoteParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VoteWthPrmDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteWithPremiumDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time by which the vote instructions should be submitted to the intermediary to take advantage of the premium."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#VoteWithPremiumDeadline
	 * VoteParameters3.VoteWithPremiumDeadline}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute VoteWithPremiumDeadline = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> VoteParameters4.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Deadline.IntermediaryDeadline;
			isDerived = false;
			xmlTag = "VoteWthPrmDdln";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteWithPremiumDeadline";
			definition = "Date and time by which the vote instructions should be submitted to the intermediary to take advantage of the premium.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.VoteParameters3.VoteWithPremiumDeadline;
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> DateFormat29Choice.mmObject();
		}
	};
	/**
	 * Date and time by which the vote instructions should be submitted to the
	 * intermediary to take advantage of the premium (STP mode).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat29Choice
	 * DateFormat29Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#STPDeadline
	 * Deadline.STPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4
	 * VoteParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VoteWthPrmSTPDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteWithPremiumSTPDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time by which the vote instructions should be submitted to the intermediary to take advantage of the premium (STP mode)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#VoteWithPremiumSTPDeadline
	 * VoteParameters3.VoteWithPremiumSTPDeadline}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute VoteWithPremiumSTPDeadline = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> VoteParameters4.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Deadline.STPDeadline;
			isDerived = false;
			xmlTag = "VoteWthPrmSTPDdln";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteWithPremiumSTPDeadline";
			definition = "Date and time by which the vote instructions should be submitted to the intermediary to take advantage of the premium (STP mode).";
			previousVersion_lazy = () -> com.tools20022.repository.msg.VoteParameters3.VoteWithPremiumSTPDeadline;
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> DateFormat29Choice.mmObject();
		}
	};
	/**
	 * Date and time by which the vote instructions should be submitted to the
	 * issuer to take advantage of the premium.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat29Choice
	 * DateFormat29Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#MarketDeadline
	 * Deadline.MarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4
	 * VoteParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VoteWthPrmMktDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteWithPremiumMarketDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time by which the vote instructions should be submitted to the issuer to take advantage of the premium."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#VoteWithPremiumMarketDeadline
	 * VoteParameters3.VoteWithPremiumMarketDeadline}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute VoteWithPremiumMarketDeadline = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> VoteParameters4.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Deadline.MarketDeadline;
			isDerived = false;
			xmlTag = "VoteWthPrmMktDdln";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteWithPremiumMarketDeadline";
			definition = "Date and time by which the vote instructions should be submitted to the issuer to take advantage of the premium.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.VoteParameters3.VoteWithPremiumMarketDeadline;
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> DateFormat29Choice.mmObject();
		}
	};
	/**
	 * Additional information on specific requirements for allowing a person to
	 * vote.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4
	 * VoteParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlVtngRqrmnts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalVotingRequirements"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information on specific requirements for allowing a person to vote."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#AdditionalVotingRequirements
	 * VoteParameters3.AdditionalVotingRequirements}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute AdditionalVotingRequirements = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> VoteParameters4.mmObject();
			isDerived = false;
			xmlTag = "AddtlVtngRqrmnts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalVotingRequirements";
			definition = "Additional information on specific requirements for allowing a person to vote.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.VoteParameters3.AdditionalVotingRequirements;
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Indicates whether the previously sent instructions becomes invalid after
	 * a market deadline extension.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.VotingCondition#PreviousInstructionInvalidity
	 * VotingCondition.PreviousInstructionInvalidity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4
	 * VoteParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsInstrInvldtyInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousInstructionInvalidityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the previously sent instructions becomes invalid after a market deadline extension."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute PreviousInstructionInvalidityIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> VoteParameters4.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.VotingCondition.PreviousInstructionInvalidity;
			isDerived = false;
			xmlTag = "PrvsInstrInvldtyInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousInstructionInvalidityIndicator";
			definition = "Indicates whether the previously sent instructions becomes invalid after a market deadline extension.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.VoteParameters4.SecuritiesQuantityRequiredToVote, com.tools20022.repository.msg.VoteParameters4.PartialVoteAllowed,
						com.tools20022.repository.msg.VoteParameters4.SplitVoteAllowed, com.tools20022.repository.msg.VoteParameters4.VoteDeadline, com.tools20022.repository.msg.VoteParameters4.VoteSTPDeadline,
						com.tools20022.repository.msg.VoteParameters4.VoteMarketDeadline, com.tools20022.repository.msg.VoteParameters4.VoteMethods, com.tools20022.repository.msg.VoteParameters4.VotingBallotElectronicAddress,
						com.tools20022.repository.msg.VoteParameters4.VotingBallotRequestAddress, com.tools20022.repository.msg.VoteParameters4.RevocabilityDeadline, com.tools20022.repository.msg.VoteParameters4.RevocabilitySTPDeadline,
						com.tools20022.repository.msg.VoteParameters4.RevocabilityMarketDeadline, com.tools20022.repository.msg.VoteParameters4.BeneficialOwnerDisclosure, com.tools20022.repository.msg.VoteParameters4.VoteInstructionType,
						com.tools20022.repository.msg.VoteParameters4.EarlyIncentivePremium, com.tools20022.repository.msg.VoteParameters4.IncentivePremium, com.tools20022.repository.msg.VoteParameters4.EarlyVoteWithPremiumDeadline,
						com.tools20022.repository.msg.VoteParameters4.VoteWithPremiumDeadline, com.tools20022.repository.msg.VoteParameters4.VoteWithPremiumSTPDeadline,
						com.tools20022.repository.msg.VoteParameters4.VoteWithPremiumMarketDeadline, com.tools20022.repository.msg.VoteParameters4.AdditionalVotingRequirements,
						com.tools20022.repository.msg.VoteParameters4.PreviousInstructionInvalidityIndicator);
				trace_lazy = () -> VotingCondition.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.MeetingNotificationV05.Vote);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "VoteParameters4";
				definition = "Information describing how the voting process is organised.";
				previousVersion_lazy = () -> VoteParameters3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}