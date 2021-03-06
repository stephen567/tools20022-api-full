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

package com.tools20022.repository.constraints;

import com.tools20022.core.repo.NotImplementedConstraintException;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.*;
import com.tools20022.repository.msg.*;
import java.util.Arrays;

/**
 * Elements in AdditionalInformation and
 * CorporateActionInstruction/CorporateActionAdditionalInformation must not
 * contain information that can be provided in a structured field unless
 * bilaterally agreed or advised differently in the element definition as in
 * NarrativeVersion.
 */
public class ConstraintAdditionalInformationRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV05
	 * CorporateActionInstructionV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Elements in AdditionalInformation and CorporateActionInstruction/CorporateActionAdditionalInformation must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#for_seev_CorporateActionInstructionV06
	 * ConstraintAdditionalInformationRule.
	 * for_seev_CorporateActionInstructionV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#for_seev_CorporateActionInstructionV04
	 * ConstraintAdditionalInformationRule.
	 * for_seev_CorporateActionInstructionV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV05> for_seev_CorporateActionInstructionV05 = new MMConstraint<CorporateActionInstructionV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "Elements in AdditionalInformation and CorporateActionInstruction/CorporateActionAdditionalInformation must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.for_seev_CorporateActionInstructionV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.for_seev_CorporateActionInstructionV04;
			owner_lazy = () -> CorporateActionInstructionV05.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionV05 obj) throws Exception {
			check_seev_CorporateActionInstructionV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV07
	 * CorporateActionMovementReversalAdviceV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not\r\ncontain information that can be provided in a structured field unless\r\nbilaterally agreed or advised differently in the element definition\r\nas in AdditionalInformation/NarrativeVersion."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#for_seev_CorporateActionMovementReversalAdviceV08
	 * ConstraintAdditionalInformationRule.
	 * for_seev_CorporateActionMovementReversalAdviceV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#for_seev_CorporateActionMovementReversalAdviceV06
	 * ConstraintAdditionalInformationRule.
	 * for_seev_CorporateActionMovementReversalAdviceV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV07> for_seev_CorporateActionMovementReversalAdviceV07 = new MMConstraint<CorporateActionMovementReversalAdviceV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not\r\ncontain information that can be provided in a structured field unless\r\nbilaterally agreed or advised differently in the element definition\r\nas in AdditionalInformation/NarrativeVersion.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.for_seev_CorporateActionMovementReversalAdviceV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.for_seev_CorporateActionMovementReversalAdviceV06;
			owner_lazy = () -> CorporateActionMovementReversalAdviceV07.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementReversalAdviceV07 obj) throws Exception {
			check_seev_CorporateActionMovementReversalAdviceV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV03
	 * CorporateActionMovementConfirmationV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV03> for_seev_CorporateActionMovementConfirmationV03 = new MMConstraint<CorporateActionMovementConfirmationV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion.";
			owner_lazy = () -> CorporateActionMovementConfirmationV03.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmationV03 obj) throws Exception {
			check_seev_CorporateActionMovementConfirmationV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative29
	 * CorporateActionNarrative29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInforrmationRule#forCorporateActionNarrative20
	 * ConstraintAdditionalInforrmationRule.forCorporateActionNarrative20}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNarrative29> forCorporateActionNarrative29 = new MMConstraint<CorporateActionNarrative29>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInforrmationRule.forCorporateActionNarrative20;
			owner_lazy = () -> CorporateActionNarrative29.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNarrative29 obj) throws Exception {
			checkCorporateActionNarrative29(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV06
	 * CorporateActionInstructionCancellationRequestStatusAdviceV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#for_seev_CorporateActionInstructionCancellationRequestStatusAdviceV07
	 * ConstraintAdditionalInformationRule.
	 * for_seev_CorporateActionInstructionCancellationRequestStatusAdviceV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#for_seev_CorporateActionInstructionCancellationRequestStatusAdviceV05
	 * ConstraintAdditionalInformationRule.
	 * for_seev_CorporateActionInstructionCancellationRequestStatusAdviceV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV06> for_seev_CorporateActionInstructionCancellationRequestStatusAdviceV06 = new MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.for_seev_CorporateActionInstructionCancellationRequestStatusAdviceV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.for_seev_CorporateActionInstructionCancellationRequestStatusAdviceV05;
			owner_lazy = () -> CorporateActionInstructionCancellationRequestStatusAdviceV06.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionCancellationRequestStatusAdviceV06 obj) throws Exception {
			check_seev_CorporateActionInstructionCancellationRequestStatusAdviceV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative41
	 * CorporateActionNarrative41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNarrative41> forCorporateActionNarrative41 = new MMConstraint<CorporateActionNarrative41>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion.";
			owner_lazy = () -> CorporateActionNarrative41.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNarrative41 obj) throws Exception {
			checkCorporateActionNarrative41(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV04
	 * CorporateActionInstructionCancellationRequestStatusAdviceV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#for_seev_CorporateActionInstructionCancellationRequestStatusAdviceV05
	 * ConstraintAdditionalInformationRule.
	 * for_seev_CorporateActionInstructionCancellationRequestStatusAdviceV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV04> for_seev_CorporateActionInstructionCancellationRequestStatusAdviceV04 = new MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.for_seev_CorporateActionInstructionCancellationRequestStatusAdviceV05);
			owner_lazy = () -> CorporateActionInstructionCancellationRequestStatusAdviceV04.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionCancellationRequestStatusAdviceV04 obj) throws Exception {
			check_seev_CorporateActionInstructionCancellationRequestStatusAdviceV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV06
	 * CorporateActionInstructionV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Elements in AdditionalInformation and CorporateActionInstruction/AdditionalInformation must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#for_seev_CorporateActionInstructionV07
	 * ConstraintAdditionalInformationRule.
	 * for_seev_CorporateActionInstructionV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#for_seev_CorporateActionInstructionV05
	 * ConstraintAdditionalInformationRule.
	 * for_seev_CorporateActionInstructionV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV06> for_seev_CorporateActionInstructionV06 = new MMConstraint<CorporateActionInstructionV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "Elements in AdditionalInformation and CorporateActionInstruction/AdditionalInformation must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.for_seev_CorporateActionInstructionV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.for_seev_CorporateActionInstructionV05;
			owner_lazy = () -> CorporateActionInstructionV06.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionV06 obj) throws Exception {
			check_seev_CorporateActionInstructionV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV08
	 * CorporateActionInstructionCancellationRequestStatusAdviceV08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#for_seev_CorporateActionInstructionCancellationRequestStatusAdviceV07
	 * ConstraintAdditionalInformationRule.
	 * for_seev_CorporateActionInstructionCancellationRequestStatusAdviceV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV08> for_seev_CorporateActionInstructionCancellationRequestStatusAdviceV08 = new MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.for_seev_CorporateActionInstructionCancellationRequestStatusAdviceV07;
			owner_lazy = () -> CorporateActionInstructionCancellationRequestStatusAdviceV08.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionCancellationRequestStatusAdviceV08 obj) throws Exception {
			check_seev_CorporateActionInstructionCancellationRequestStatusAdviceV08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV05
	 * CorporateActionMovementConfirmationV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#for_seev_CorporateActionMovementConfirmationV06
	 * ConstraintAdditionalInformationRule.
	 * for_seev_CorporateActionMovementConfirmationV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#for_seev_CorporateActionMovementConfirmationV04
	 * ConstraintAdditionalInformationRule.
	 * for_seev_CorporateActionMovementConfirmationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV05> for_seev_CorporateActionMovementConfirmationV05 = new MMConstraint<CorporateActionMovementConfirmationV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.for_seev_CorporateActionMovementConfirmationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.for_seev_CorporateActionMovementConfirmationV04;
			owner_lazy = () -> CorporateActionMovementConfirmationV05.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmationV05 obj) throws Exception {
			check_seev_CorporateActionMovementConfirmationV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV05
	 * CorporateActionMovementReversalAdviceV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not\ncontain information that can be provided in a structured field unless\nbilaterally agreed or advised differently in the element definition\nas in NarrativeVersion."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#for_seev_CorporateActionMovementReversalAdviceV06
	 * ConstraintAdditionalInformationRule.
	 * for_seev_CorporateActionMovementReversalAdviceV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#for_seev_CorporateActionMovementReversalAdviceV04
	 * ConstraintAdditionalInformationRule.
	 * for_seev_CorporateActionMovementReversalAdviceV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV05> for_seev_CorporateActionMovementReversalAdviceV05 = new MMConstraint<CorporateActionMovementReversalAdviceV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not\ncontain information that can be provided in a structured field unless\nbilaterally agreed or advised differently in the element definition\nas in NarrativeVersion.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.for_seev_CorporateActionMovementReversalAdviceV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.for_seev_CorporateActionMovementReversalAdviceV04;
			owner_lazy = () -> CorporateActionMovementReversalAdviceV05.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementReversalAdviceV05 obj) throws Exception {
			check_seev_CorporateActionMovementReversalAdviceV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV06
	 * CorporateActionMovementConfirmationV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#for_seev_CorporateActionMovementConfirmationV07
	 * ConstraintAdditionalInformationRule.
	 * for_seev_CorporateActionMovementConfirmationV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#for_seev_CorporateActionMovementConfirmationV05
	 * ConstraintAdditionalInformationRule.
	 * for_seev_CorporateActionMovementConfirmationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV06> for_seev_CorporateActionMovementConfirmationV06 = new MMConstraint<CorporateActionMovementConfirmationV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.for_seev_CorporateActionMovementConfirmationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.for_seev_CorporateActionMovementConfirmationV05;
			owner_lazy = () -> CorporateActionMovementConfirmationV06.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmationV06 obj) throws Exception {
			check_seev_CorporateActionMovementConfirmationV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative39
	 * CorporateActionNarrative39}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNarrative39> forCorporateActionNarrative39 = new MMConstraint<CorporateActionNarrative39>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition.";
			owner_lazy = () -> CorporateActionNarrative39.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNarrative39 obj) throws Exception {
			checkCorporateActionNarrative39(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV02
	 * CorporateActionMovementConfirmationV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV02> for_seev_CorporateActionMovementConfirmationV02 = new MMConstraint<CorporateActionMovementConfirmationV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion.";
			owner_lazy = () -> CorporateActionMovementConfirmationV02.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmationV02 obj) throws Exception {
			check_seev_CorporateActionMovementConfirmationV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V07
	 * CorporateActionMovementConfirmation002V07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in AdditionalInformation/NarrativeVersion."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmation002V07> for_seev_CorporateActionMovementConfirmation002V07 = new MMConstraint<CorporateActionMovementConfirmation002V07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in AdditionalInformation/NarrativeVersion.";
			owner_lazy = () -> CorporateActionMovementConfirmation002V07.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmation002V07 obj) throws Exception {
			check_seev_CorporateActionMovementConfirmation002V07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative37
	 * CorporateActionNarrative37}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNarrative37> forCorporateActionNarrative37 = new MMConstraint<CorporateActionNarrative37>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion.";
			owner_lazy = () -> CorporateActionNarrative37.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNarrative37 obj) throws Exception {
			checkCorporateActionNarrative37(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V09
	 * CorporateActionMovementConfirmation002V09}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in AdditionalInformation/NarrativeVersion."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmation002V09> for_seev_CorporateActionMovementConfirmation002V09 = new MMConstraint<CorporateActionMovementConfirmation002V09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in AdditionalInformation/NarrativeVersion.";
			owner_lazy = () -> CorporateActionMovementConfirmation002V09.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmation002V09 obj) throws Exception {
			check_seev_CorporateActionMovementConfirmation002V09(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdvice002V09
	 * CorporateActionInstructionStatusAdvice002V09}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionStatusAdvice002V09> for_seev_CorporateActionInstructionStatusAdvice002V09 = new MMConstraint<CorporateActionInstructionStatusAdvice002V09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> CorporateActionInstructionStatusAdvice002V09.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionStatusAdvice002V09 obj) throws Exception {
			check_seev_CorporateActionInstructionStatusAdvice002V09(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV03
	 * CorporateActionInstructionStatusAdviceV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionStatusAdviceV03> for_seev_CorporateActionInstructionStatusAdviceV03 = new MMConstraint<CorporateActionInstructionStatusAdviceV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> CorporateActionInstructionStatusAdviceV03.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionStatusAdviceV03 obj) throws Exception {
			check_seev_CorporateActionInstructionStatusAdviceV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV06
	 * CorporateActionInstructionStatusAdviceV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#for_seev_CorporateActionInstructionStatusAdviceV07
	 * ConstraintAdditionalInformationRule.
	 * for_seev_CorporateActionInstructionStatusAdviceV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#for_seev_CorporateActionInstructionStatusAdviceV05
	 * ConstraintAdditionalInformationRule.
	 * for_seev_CorporateActionInstructionStatusAdviceV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionStatusAdviceV06> for_seev_CorporateActionInstructionStatusAdviceV06 = new MMConstraint<CorporateActionInstructionStatusAdviceV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.for_seev_CorporateActionInstructionStatusAdviceV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.for_seev_CorporateActionInstructionStatusAdviceV05;
			owner_lazy = () -> CorporateActionInstructionStatusAdviceV06.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionStatusAdviceV06 obj) throws Exception {
			check_seev_CorporateActionInstructionStatusAdviceV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative28
	 * CorporateActionNarrative28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInforrmationRule#forCorporateActionNarrative6
	 * ConstraintAdditionalInforrmationRule.forCorporateActionNarrative6}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNarrative28> forCorporateActionNarrative28 = new MMConstraint<CorporateActionNarrative28>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInforrmationRule.forCorporateActionNarrative6;
			owner_lazy = () -> CorporateActionNarrative28.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNarrative28 obj) throws Exception {
			checkCorporateActionNarrative28(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV08
	 * CorporateActionMovementConfirmationV08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in AdditionalInformation/NarrativeVersion."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#for_seev_CorporateActionMovementConfirmationV09
	 * ConstraintAdditionalInformationRule.
	 * for_seev_CorporateActionMovementConfirmationV09}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#for_seev_CorporateActionMovementConfirmationV07
	 * ConstraintAdditionalInformationRule.
	 * for_seev_CorporateActionMovementConfirmationV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV08> for_seev_CorporateActionMovementConfirmationV08 = new MMConstraint<CorporateActionMovementConfirmationV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in AdditionalInformation/NarrativeVersion.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.for_seev_CorporateActionMovementConfirmationV09);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.for_seev_CorporateActionMovementConfirmationV07;
			owner_lazy = () -> CorporateActionMovementConfirmationV08.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmationV08 obj) throws Exception {
			check_seev_CorporateActionMovementConfirmationV08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV01
	 * CorporateActionMovementReversalAdviceV01}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not\ncontain information that can be provided in a structured field unless\nbilaterally agreed or advised differently in the element definition\nas in NarrativeVersion."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV01> for_seev_CorporateActionMovementReversalAdviceV01 = new MMConstraint<CorporateActionMovementReversalAdviceV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not\ncontain information that can be provided in a structured field unless\nbilaterally agreed or advised differently in the element definition\nas in NarrativeVersion.";
			owner_lazy = () -> CorporateActionMovementReversalAdviceV01.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementReversalAdviceV01 obj) throws Exception {
			check_seev_CorporateActionMovementReversalAdviceV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative36
	 * CorporateActionNarrative36}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNarrative36> forCorporateActionNarrative36 = new MMConstraint<CorporateActionNarrative36>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion.";
			owner_lazy = () -> CorporateActionNarrative36.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNarrative36 obj) throws Exception {
			checkCorporateActionNarrative36(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV03
	 * CorporateActionInstructionV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Elements in AdditionalInformation and CorporateActionInstruction/CorporateActionAdditionalInformation must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV03> for_seev_CorporateActionInstructionV03 = new MMConstraint<CorporateActionInstructionV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "Elements in AdditionalInformation and CorporateActionInstruction/CorporateActionAdditionalInformation must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion.";
			owner_lazy = () -> CorporateActionInstructionV03.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionV03 obj) throws Exception {
			check_seev_CorporateActionInstructionV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV01
	 * CorporateActionInstructionCancellationRequestStatusAdviceV01}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV01> for_seev_CorporateActionInstructionCancellationRequestStatusAdviceV01 = new MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> CorporateActionInstructionCancellationRequestStatusAdviceV01.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionCancellationRequestStatusAdviceV01 obj) throws Exception {
			check_seev_CorporateActionInstructionCancellationRequestStatusAdviceV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV06
	 * CorporateActionMovementReversalAdviceV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not\ncontain information that can be provided in a structured field unless\nbilaterally agreed or advised differently in the element definition\nas in NarrativeVersion."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#for_seev_CorporateActionMovementReversalAdviceV07
	 * ConstraintAdditionalInformationRule.
	 * for_seev_CorporateActionMovementReversalAdviceV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#for_seev_CorporateActionMovementReversalAdviceV05
	 * ConstraintAdditionalInformationRule.
	 * for_seev_CorporateActionMovementReversalAdviceV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV06> for_seev_CorporateActionMovementReversalAdviceV06 = new MMConstraint<CorporateActionMovementReversalAdviceV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not\ncontain information that can be provided in a structured field unless\nbilaterally agreed or advised differently in the element definition\nas in NarrativeVersion.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.for_seev_CorporateActionMovementReversalAdviceV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.for_seev_CorporateActionMovementReversalAdviceV05;
			owner_lazy = () -> CorporateActionMovementReversalAdviceV06.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementReversalAdviceV06 obj) throws Exception {
			check_seev_CorporateActionMovementReversalAdviceV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdvice002V07
	 * CorporateActionInstructionStatusAdvice002V07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionStatusAdvice002V07> for_seev_CorporateActionInstructionStatusAdvice002V07 = new MMConstraint<CorporateActionInstructionStatusAdvice002V07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> CorporateActionInstructionStatusAdvice002V07.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionStatusAdvice002V07 obj) throws Exception {
			check_seev_CorporateActionInstructionStatusAdvice002V07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV07
	 * CorporateActionInstructionStatusAdviceV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#for_seev_CorporateActionInstructionStatusAdviceV08
	 * ConstraintAdditionalInformationRule.
	 * for_seev_CorporateActionInstructionStatusAdviceV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#for_seev_CorporateActionInstructionStatusAdviceV06
	 * ConstraintAdditionalInformationRule.
	 * for_seev_CorporateActionInstructionStatusAdviceV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionStatusAdviceV07> for_seev_CorporateActionInstructionStatusAdviceV07 = new MMConstraint<CorporateActionInstructionStatusAdviceV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.for_seev_CorporateActionInstructionStatusAdviceV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.for_seev_CorporateActionInstructionStatusAdviceV06;
			owner_lazy = () -> CorporateActionInstructionStatusAdviceV07.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionStatusAdviceV07 obj) throws Exception {
			check_seev_CorporateActionInstructionStatusAdviceV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative26
	 * CorporateActionNarrative26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInforrmationRule#forCorporateActionNarrative24
	 * ConstraintAdditionalInforrmationRule.forCorporateActionNarrative24}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNarrative26> forCorporateActionNarrative26 = new MMConstraint<CorporateActionNarrative26>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInforrmationRule.forCorporateActionNarrative24;
			owner_lazy = () -> CorporateActionNarrative26.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNarrative26 obj) throws Exception {
			checkCorporateActionNarrative26(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV02
	 * CorporateActionInstructionV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Elements in AdditionalInformation and CorporateActionInstruction/CorporateActionAdditionalInformation must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV02> for_seev_CorporateActionInstructionV02 = new MMConstraint<CorporateActionInstructionV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "Elements in AdditionalInformation and CorporateActionInstruction/CorporateActionAdditionalInformation must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion.";
			owner_lazy = () -> CorporateActionInstructionV02.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionV02 obj) throws Exception {
			check_seev_CorporateActionInstructionV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV08
	 * CorporateActionInstructionStatusAdviceV08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#for_seev_CorporateActionInstructionStatusAdviceV09
	 * ConstraintAdditionalInformationRule.
	 * for_seev_CorporateActionInstructionStatusAdviceV09}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#for_seev_CorporateActionInstructionStatusAdviceV07
	 * ConstraintAdditionalInformationRule.
	 * for_seev_CorporateActionInstructionStatusAdviceV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionStatusAdviceV08> for_seev_CorporateActionInstructionStatusAdviceV08 = new MMConstraint<CorporateActionInstructionStatusAdviceV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.for_seev_CorporateActionInstructionStatusAdviceV09);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.for_seev_CorporateActionInstructionStatusAdviceV07;
			owner_lazy = () -> CorporateActionInstructionStatusAdviceV08.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionStatusAdviceV08 obj) throws Exception {
			check_seev_CorporateActionInstructionStatusAdviceV08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstruction002V06
	 * CorporateActionInstruction002V06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Elements in AdditionalInformation and CorporateActionInstruction/AdditionalInformation must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstruction002V06> for_seev_CorporateActionInstruction002V06 = new MMConstraint<CorporateActionInstruction002V06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "Elements in AdditionalInformation and CorporateActionInstruction/AdditionalInformation must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition.";
			owner_lazy = () -> CorporateActionInstruction002V06.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstruction002V06 obj) throws Exception {
			check_seev_CorporateActionInstruction002V06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV02
	 * CorporateActionMovementReversalAdviceV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not\ncontain information that can be provided in a structured field unless\nbilaterally agreed or advised differently in the element definition\nas in NarrativeVersion."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV02> for_seev_CorporateActionMovementReversalAdviceV02 = new MMConstraint<CorporateActionMovementReversalAdviceV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not\ncontain information that can be provided in a structured field unless\nbilaterally agreed or advised differently in the element definition\nas in NarrativeVersion.";
			owner_lazy = () -> CorporateActionMovementReversalAdviceV02.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementReversalAdviceV02 obj) throws Exception {
			check_seev_CorporateActionMovementReversalAdviceV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV04
	 * CorporateActionInstructionV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Elements in AdditionalInformation and CorporateActionInstruction/CorporateActionAdditionalInformation must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#for_seev_CorporateActionInstructionV05
	 * ConstraintAdditionalInformationRule.
	 * for_seev_CorporateActionInstructionV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV04> for_seev_CorporateActionInstructionV04 = new MMConstraint<CorporateActionInstructionV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "Elements in AdditionalInformation and CorporateActionInstruction/CorporateActionAdditionalInformation must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.for_seev_CorporateActionInstructionV05);
			owner_lazy = () -> CorporateActionInstructionV04.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionV04 obj) throws Exception {
			check_seev_CorporateActionInstructionV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV01
	 * CorporateActionInstructionV01}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Elements in AdditionalInformation and CorporateActionInstruction/CorporateActionAdditionalInformation must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV01> for_seev_CorporateActionInstructionV01 = new MMConstraint<CorporateActionInstructionV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "Elements in AdditionalInformation and CorporateActionInstruction/CorporateActionAdditionalInformation must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion.";
			owner_lazy = () -> CorporateActionInstructionV01.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionV01 obj) throws Exception {
			check_seev_CorporateActionInstructionV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V09
	 * CorporateActionMovementReversalAdvice002V09}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in AdditionalInformation/NarrativeVersion."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdvice002V09> for_seev_CorporateActionMovementReversalAdvice002V09 = new MMConstraint<CorporateActionMovementReversalAdvice002V09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in AdditionalInformation/NarrativeVersion.";
			owner_lazy = () -> CorporateActionMovementReversalAdvice002V09.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementReversalAdvice002V09 obj) throws Exception {
			check_seev_CorporateActionMovementReversalAdvice002V09(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation8
	 * UpdatedAdditionalInformation8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Additionalnformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInforrmationRule#forUpdatedAdditionalInformation2
	 * ConstraintAdditionalInforrmationRule.forUpdatedAdditionalInformation2}</li>
	 * </ul>
	 */
	public static final MMConstraint<UpdatedAdditionalInformation8> forUpdatedAdditionalInformation8 = new MMConstraint<UpdatedAdditionalInformation8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "The Additionalnformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInforrmationRule.forUpdatedAdditionalInformation2;
			owner_lazy = () -> UpdatedAdditionalInformation8.mmObject();
		}

		@Override
		public void executeValidator(UpdatedAdditionalInformation8 obj) throws Exception {
			checkUpdatedAdditionalInformation8(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV03
	 * CorporateActionMovementReversalAdviceV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not\ncontain information that can be provided in a structured field unless\nbilaterally agreed or advised differently in the element definition\nas in NarrativeVersion."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV03> for_seev_CorporateActionMovementReversalAdviceV03 = new MMConstraint<CorporateActionMovementReversalAdviceV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not\ncontain information that can be provided in a structured field unless\nbilaterally agreed or advised differently in the element definition\nas in NarrativeVersion.";
			owner_lazy = () -> CorporateActionMovementReversalAdviceV03.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementReversalAdviceV03 obj) throws Exception {
			check_seev_CorporateActionMovementReversalAdviceV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV04
	 * CorporateActionMovementReversalAdviceV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not\ncontain information that can be provided in a structured field unless\nbilaterally agreed or advised differently in the element definition\nas in NarrativeVersion."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#for_seev_CorporateActionMovementReversalAdviceV05
	 * ConstraintAdditionalInformationRule.
	 * for_seev_CorporateActionMovementReversalAdviceV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV04> for_seev_CorporateActionMovementReversalAdviceV04 = new MMConstraint<CorporateActionMovementReversalAdviceV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not\ncontain information that can be provided in a structured field unless\nbilaterally agreed or advised differently in the element definition\nas in NarrativeVersion.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.for_seev_CorporateActionMovementReversalAdviceV05);
			owner_lazy = () -> CorporateActionMovementReversalAdviceV04.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementReversalAdviceV04 obj) throws Exception {
			check_seev_CorporateActionMovementReversalAdviceV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative27
	 * CorporateActionNarrative27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInforrmationRule#forCorporateActionNarrative11
	 * ConstraintAdditionalInforrmationRule.forCorporateActionNarrative11}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNarrative27> forCorporateActionNarrative27 = new MMConstraint<CorporateActionNarrative27>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInforrmationRule.forCorporateActionNarrative11;
			owner_lazy = () -> CorporateActionNarrative27.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNarrative27 obj) throws Exception {
			checkCorporateActionNarrative27(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV07
	 * CorporateActionInstructionCancellationRequestStatusAdviceV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#for_seev_CorporateActionInstructionCancellationRequestStatusAdviceV08
	 * ConstraintAdditionalInformationRule.
	 * for_seev_CorporateActionInstructionCancellationRequestStatusAdviceV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#for_seev_CorporateActionInstructionCancellationRequestStatusAdviceV06
	 * ConstraintAdditionalInformationRule.
	 * for_seev_CorporateActionInstructionCancellationRequestStatusAdviceV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV07> for_seev_CorporateActionInstructionCancellationRequestStatusAdviceV07 = new MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.for_seev_CorporateActionInstructionCancellationRequestStatusAdviceV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.for_seev_CorporateActionInstructionCancellationRequestStatusAdviceV06;
			owner_lazy = () -> CorporateActionInstructionCancellationRequestStatusAdviceV07.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionCancellationRequestStatusAdviceV07 obj) throws Exception {
			check_seev_CorporateActionInstructionCancellationRequestStatusAdviceV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV05
	 * CorporateActionInstructionStatusAdviceV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#for_seev_CorporateActionInstructionStatusAdviceV06
	 * ConstraintAdditionalInformationRule.
	 * for_seev_CorporateActionInstructionStatusAdviceV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#for_seev_CorporateActionInstructionStatusAdviceV04
	 * ConstraintAdditionalInformationRule.
	 * for_seev_CorporateActionInstructionStatusAdviceV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionStatusAdviceV05> for_seev_CorporateActionInstructionStatusAdviceV05 = new MMConstraint<CorporateActionInstructionStatusAdviceV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.for_seev_CorporateActionInstructionStatusAdviceV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.for_seev_CorporateActionInstructionStatusAdviceV04;
			owner_lazy = () -> CorporateActionInstructionStatusAdviceV05.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionStatusAdviceV05 obj) throws Exception {
			check_seev_CorporateActionInstructionStatusAdviceV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV08
	 * CorporateActionMovementReversalAdviceV08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not\r\ncontain information that can be provided in a structured field unless\r\nbilaterally agreed or advised differently in the element definition\r\nas in AdditionalInformation/NarrativeVersion."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#for_seev_CorporateActionMovementReversalAdviceV09
	 * ConstraintAdditionalInformationRule.
	 * for_seev_CorporateActionMovementReversalAdviceV09}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#for_seev_CorporateActionMovementReversalAdviceV07
	 * ConstraintAdditionalInformationRule.
	 * for_seev_CorporateActionMovementReversalAdviceV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV08> for_seev_CorporateActionMovementReversalAdviceV08 = new MMConstraint<CorporateActionMovementReversalAdviceV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not\r\ncontain information that can be provided in a structured field unless\r\nbilaterally agreed or advised differently in the element definition\r\nas in AdditionalInformation/NarrativeVersion.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.for_seev_CorporateActionMovementReversalAdviceV09);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.for_seev_CorporateActionMovementReversalAdviceV07;
			owner_lazy = () -> CorporateActionMovementReversalAdviceV08.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementReversalAdviceV08 obj) throws Exception {
			check_seev_CorporateActionMovementReversalAdviceV08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV07
	 * CorporateActionInstructionV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Elements in AdditionalInformation and CorporateActionInstruction/AdditionalInformation must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#for_seev_CorporateActionInstructionV08
	 * ConstraintAdditionalInformationRule.
	 * for_seev_CorporateActionInstructionV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#for_seev_CorporateActionInstructionV06
	 * ConstraintAdditionalInformationRule.
	 * for_seev_CorporateActionInstructionV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV07> for_seev_CorporateActionInstructionV07 = new MMConstraint<CorporateActionInstructionV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "Elements in AdditionalInformation and CorporateActionInstruction/AdditionalInformation must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.for_seev_CorporateActionInstructionV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.for_seev_CorporateActionInstructionV06;
			owner_lazy = () -> CorporateActionInstructionV07.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionV07 obj) throws Exception {
			check_seev_CorporateActionInstructionV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV02
	 * CorporateActionInstructionStatusAdviceV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionStatusAdviceV02> for_seev_CorporateActionInstructionStatusAdviceV02 = new MMConstraint<CorporateActionInstructionStatusAdviceV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> CorporateActionInstructionStatusAdviceV02.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionStatusAdviceV02 obj) throws Exception {
			check_seev_CorporateActionInstructionStatusAdviceV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV01
	 * CorporateActionMovementConfirmationV01}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV01> for_seev_CorporateActionMovementConfirmationV01 = new MMConstraint<CorporateActionMovementConfirmationV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion.";
			owner_lazy = () -> CorporateActionMovementConfirmationV01.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmationV01 obj) throws Exception {
			check_seev_CorporateActionMovementConfirmationV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdvice002V08
	 * CorporateActionInstructionCancellationRequestStatusAdvice002V08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionCancellationRequestStatusAdvice002V08> for_seev_CorporateActionInstructionCancellationRequestStatusAdvice002V08 = new MMConstraint<CorporateActionInstructionCancellationRequestStatusAdvice002V08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> CorporateActionInstructionCancellationRequestStatusAdvice002V08.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionCancellationRequestStatusAdvice002V08 obj) throws Exception {
			check_seev_CorporateActionInstructionCancellationRequestStatusAdvice002V08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation10
	 * UpdatedAdditionalInformation10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Additionalnformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<UpdatedAdditionalInformation10> forUpdatedAdditionalInformation10 = new MMConstraint<UpdatedAdditionalInformation10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "The Additionalnformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> UpdatedAdditionalInformation10.mmObject();
		}

		@Override
		public void executeValidator(UpdatedAdditionalInformation10 obj) throws Exception {
			checkUpdatedAdditionalInformation10(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV09
	 * CorporateActionInstructionStatusAdviceV09}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#for_seev_CorporateActionInstructionStatusAdviceV08
	 * ConstraintAdditionalInformationRule.
	 * for_seev_CorporateActionInstructionStatusAdviceV08}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionStatusAdviceV09> for_seev_CorporateActionInstructionStatusAdviceV09 = new MMConstraint<CorporateActionInstructionStatusAdviceV09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.for_seev_CorporateActionInstructionStatusAdviceV08;
			owner_lazy = () -> CorporateActionInstructionStatusAdviceV09.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionStatusAdviceV09 obj) throws Exception {
			check_seev_CorporateActionInstructionStatusAdviceV09(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV04
	 * CorporateActionMovementConfirmationV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#for_seev_CorporateActionMovementConfirmationV05
	 * ConstraintAdditionalInformationRule.
	 * for_seev_CorporateActionMovementConfirmationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV04> for_seev_CorporateActionMovementConfirmationV04 = new MMConstraint<CorporateActionMovementConfirmationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.for_seev_CorporateActionMovementConfirmationV05);
			owner_lazy = () -> CorporateActionMovementConfirmationV04.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmationV04 obj) throws Exception {
			check_seev_CorporateActionMovementConfirmationV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV07
	 * CorporateActionMovementConfirmationV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in AdditionalInformation/NarrativeVersion."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#for_seev_CorporateActionMovementConfirmationV08
	 * ConstraintAdditionalInformationRule.
	 * for_seev_CorporateActionMovementConfirmationV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#for_seev_CorporateActionMovementConfirmationV06
	 * ConstraintAdditionalInformationRule.
	 * for_seev_CorporateActionMovementConfirmationV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV07> for_seev_CorporateActionMovementConfirmationV07 = new MMConstraint<CorporateActionMovementConfirmationV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in AdditionalInformation/NarrativeVersion.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.for_seev_CorporateActionMovementConfirmationV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.for_seev_CorporateActionMovementConfirmationV06;
			owner_lazy = () -> CorporateActionMovementConfirmationV07.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmationV07 obj) throws Exception {
			check_seev_CorporateActionMovementConfirmationV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV01
	 * CorporateActionInstructionStatusAdviceV01}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionStatusAdviceV01> for_seev_CorporateActionInstructionStatusAdviceV01 = new MMConstraint<CorporateActionInstructionStatusAdviceV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> CorporateActionInstructionStatusAdviceV01.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionStatusAdviceV01 obj) throws Exception {
			check_seev_CorporateActionInstructionStatusAdviceV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV09
	 * CorporateActionMovementConfirmationV09}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in AdditionalInformation/NarrativeVersion."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#for_seev_CorporateActionMovementConfirmationV08
	 * ConstraintAdditionalInformationRule.
	 * for_seev_CorporateActionMovementConfirmationV08}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV09> for_seev_CorporateActionMovementConfirmationV09 = new MMConstraint<CorporateActionMovementConfirmationV09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in AdditionalInformation/NarrativeVersion.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.for_seev_CorporateActionMovementConfirmationV08;
			owner_lazy = () -> CorporateActionMovementConfirmationV09.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementConfirmationV09 obj) throws Exception {
			check_seev_CorporateActionMovementConfirmationV09(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV04
	 * CorporateActionInstructionStatusAdviceV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#for_seev_CorporateActionInstructionStatusAdviceV05
	 * ConstraintAdditionalInformationRule.
	 * for_seev_CorporateActionInstructionStatusAdviceV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionStatusAdviceV04> for_seev_CorporateActionInstructionStatusAdviceV04 = new MMConstraint<CorporateActionInstructionStatusAdviceV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.for_seev_CorporateActionInstructionStatusAdviceV05);
			owner_lazy = () -> CorporateActionInstructionStatusAdviceV04.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionStatusAdviceV04 obj) throws Exception {
			check_seev_CorporateActionInstructionStatusAdviceV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdvice002V06
	 * CorporateActionInstructionCancellationRequestStatusAdvice002V06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionCancellationRequestStatusAdvice002V06> for_seev_CorporateActionInstructionCancellationRequestStatusAdvice002V06 = new MMConstraint<CorporateActionInstructionCancellationRequestStatusAdvice002V06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> CorporateActionInstructionCancellationRequestStatusAdvice002V06.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionCancellationRequestStatusAdvice002V06 obj) throws Exception {
			check_seev_CorporateActionInstructionCancellationRequestStatusAdvice002V06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV02
	 * CorporateActionInstructionCancellationRequestStatusAdviceV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV02> for_seev_CorporateActionInstructionCancellationRequestStatusAdviceV02 = new MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> CorporateActionInstructionCancellationRequestStatusAdviceV02.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionCancellationRequestStatusAdviceV02 obj) throws Exception {
			check_seev_CorporateActionInstructionCancellationRequestStatusAdviceV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV09
	 * CorporateActionMovementReversalAdviceV09}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in AdditionalInformation/NarrativeVersion."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#for_seev_CorporateActionMovementReversalAdviceV08
	 * ConstraintAdditionalInformationRule.
	 * for_seev_CorporateActionMovementReversalAdviceV08}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV09> for_seev_CorporateActionMovementReversalAdviceV09 = new MMConstraint<CorporateActionMovementReversalAdviceV09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in AdditionalInformation/NarrativeVersion.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.for_seev_CorporateActionMovementReversalAdviceV08;
			owner_lazy = () -> CorporateActionMovementReversalAdviceV09.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementReversalAdviceV09 obj) throws Exception {
			check_seev_CorporateActionMovementReversalAdviceV09(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV03
	 * CorporateActionInstructionCancellationRequestStatusAdviceV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV03> for_seev_CorporateActionInstructionCancellationRequestStatusAdviceV03 = new MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> CorporateActionInstructionCancellationRequestStatusAdviceV03.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionCancellationRequestStatusAdviceV03 obj) throws Exception {
			check_seev_CorporateActionInstructionCancellationRequestStatusAdviceV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV05
	 * CorporateActionInstructionCancellationRequestStatusAdviceV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#for_seev_CorporateActionInstructionCancellationRequestStatusAdviceV06
	 * ConstraintAdditionalInformationRule.
	 * for_seev_CorporateActionInstructionCancellationRequestStatusAdviceV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#for_seev_CorporateActionInstructionCancellationRequestStatusAdviceV04
	 * ConstraintAdditionalInformationRule.
	 * for_seev_CorporateActionInstructionCancellationRequestStatusAdviceV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV05> for_seev_CorporateActionInstructionCancellationRequestStatusAdviceV05 = new MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.for_seev_CorporateActionInstructionCancellationRequestStatusAdviceV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.for_seev_CorporateActionInstructionCancellationRequestStatusAdviceV04;
			owner_lazy = () -> CorporateActionInstructionCancellationRequestStatusAdviceV05.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionCancellationRequestStatusAdviceV05 obj) throws Exception {
			check_seev_CorporateActionInstructionCancellationRequestStatusAdviceV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV08
	 * CorporateActionInstructionV08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Elements in AdditionalInformation and CorporateActionInstruction/AdditionalInformation must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#for_seev_CorporateActionInstructionV07
	 * ConstraintAdditionalInformationRule.
	 * for_seev_CorporateActionInstructionV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV08> for_seev_CorporateActionInstructionV08 = new MMConstraint<CorporateActionInstructionV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "Elements in AdditionalInformation and CorporateActionInstruction/AdditionalInformation must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.for_seev_CorporateActionInstructionV07;
			owner_lazy = () -> CorporateActionInstructionV08.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstructionV08 obj) throws Exception {
			check_seev_CorporateActionInstructionV08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstruction002V08
	 * CorporateActionInstruction002V08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Elements in AdditionalInformation and CorporateActionInstruction/AdditionalInformation must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstruction002V08> for_seev_CorporateActionInstruction002V08 = new MMConstraint<CorporateActionInstruction002V08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "Elements in AdditionalInformation and CorporateActionInstruction/AdditionalInformation must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition.";
			owner_lazy = () -> CorporateActionInstruction002V08.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionInstruction002V08 obj) throws Exception {
			check_seev_CorporateActionInstruction002V08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V07
	 * CorporateActionMovementReversalAdvice002V07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not\r\ncontain information that can be provided in a structured field unless\r\nbilaterally agreed or advised differently in the element definition\r\nas in AdditionalInformation/NarrativeVersion."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdvice002V07> for_seev_CorporateActionMovementReversalAdvice002V07 = new MMConstraint<CorporateActionMovementReversalAdvice002V07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not\r\ncontain information that can be provided in a structured field unless\r\nbilaterally agreed or advised differently in the element definition\r\nas in AdditionalInformation/NarrativeVersion.";
			owner_lazy = () -> CorporateActionMovementReversalAdvice002V07.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementReversalAdvice002V07 obj) throws Exception {
			check_seev_CorporateActionMovementReversalAdvice002V07(obj);
		}
	};

	/**
	 * Elements in AdditionalInformation and
	 * CorporateActionInstruction/CorporateActionAdditionalInformation must not
	 * contain information that can be provided in a structured field unless
	 * bilaterally agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void check_seev_CorporateActionInstructionV05(CorporateActionInstructionV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not<br>
	 * contain information that can be provided in a structured field unless<br>
	 * bilaterally agreed or advised differently in the element definition<br>
	 * as in AdditionalInformation/NarrativeVersion.
	 */
	public static void check_seev_CorporateActionMovementReversalAdviceV07(CorporateActionMovementReversalAdviceV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void check_seev_CorporateActionMovementConfirmationV03(CorporateActionMovementConfirmationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void checkCorporateActionNarrative29(CorporateActionNarrative29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed.
	 */
	public static void check_seev_CorporateActionInstructionCancellationRequestStatusAdviceV06(CorporateActionInstructionCancellationRequestStatusAdviceV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void checkCorporateActionNarrative41(CorporateActionNarrative41 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed.
	 */
	public static void check_seev_CorporateActionInstructionCancellationRequestStatusAdviceV04(CorporateActionInstructionCancellationRequestStatusAdviceV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Elements in AdditionalInformation and
	 * CorporateActionInstruction/AdditionalInformation must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition.
	 */
	public static void check_seev_CorporateActionInstructionV06(CorporateActionInstructionV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed.
	 */
	public static void check_seev_CorporateActionInstructionCancellationRequestStatusAdviceV08(CorporateActionInstructionCancellationRequestStatusAdviceV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void check_seev_CorporateActionMovementConfirmationV05(CorporateActionMovementConfirmationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void check_seev_CorporateActionMovementReversalAdviceV05(CorporateActionMovementReversalAdviceV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void check_seev_CorporateActionMovementConfirmationV06(CorporateActionMovementConfirmationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition.
	 */
	public static void checkCorporateActionNarrative39(CorporateActionNarrative39 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void check_seev_CorporateActionMovementConfirmationV02(CorporateActionMovementConfirmationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * AdditionalInformation/NarrativeVersion.
	 */
	public static void check_seev_CorporateActionMovementConfirmation002V07(CorporateActionMovementConfirmation002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void checkCorporateActionNarrative37(CorporateActionNarrative37 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * AdditionalInformation/NarrativeVersion.
	 */
	public static void check_seev_CorporateActionMovementConfirmation002V09(CorporateActionMovementConfirmation002V09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation element must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed.
	 */
	public static void check_seev_CorporateActionInstructionStatusAdvice002V09(CorporateActionInstructionStatusAdvice002V09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation element must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed.
	 */
	public static void check_seev_CorporateActionInstructionStatusAdviceV03(CorporateActionInstructionStatusAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation element must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed.
	 */
	public static void check_seev_CorporateActionInstructionStatusAdviceV06(CorporateActionInstructionStatusAdviceV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void checkCorporateActionNarrative28(CorporateActionNarrative28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * AdditionalInformation/NarrativeVersion.
	 */
	public static void check_seev_CorporateActionMovementConfirmationV08(CorporateActionMovementConfirmationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void check_seev_CorporateActionMovementReversalAdviceV01(CorporateActionMovementReversalAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void checkCorporateActionNarrative36(CorporateActionNarrative36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Elements in AdditionalInformation and
	 * CorporateActionInstruction/CorporateActionAdditionalInformation must not
	 * contain information that can be provided in a structured field unless
	 * bilaterally agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void check_seev_CorporateActionInstructionV03(CorporateActionInstructionV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed.
	 */
	public static void check_seev_CorporateActionInstructionCancellationRequestStatusAdviceV01(CorporateActionInstructionCancellationRequestStatusAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void check_seev_CorporateActionMovementReversalAdviceV06(CorporateActionMovementReversalAdviceV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation element must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed.
	 */
	public static void check_seev_CorporateActionInstructionStatusAdvice002V07(CorporateActionInstructionStatusAdvice002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation element must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed.
	 */
	public static void check_seev_CorporateActionInstructionStatusAdviceV07(CorporateActionInstructionStatusAdviceV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition.
	 */
	public static void checkCorporateActionNarrative26(CorporateActionNarrative26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Elements in AdditionalInformation and
	 * CorporateActionInstruction/CorporateActionAdditionalInformation must not
	 * contain information that can be provided in a structured field unless
	 * bilaterally agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void check_seev_CorporateActionInstructionV02(CorporateActionInstructionV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation element must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed.
	 */
	public static void check_seev_CorporateActionInstructionStatusAdviceV08(CorporateActionInstructionStatusAdviceV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Elements in AdditionalInformation and
	 * CorporateActionInstruction/AdditionalInformation must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition.
	 */
	public static void check_seev_CorporateActionInstruction002V06(CorporateActionInstruction002V06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void check_seev_CorporateActionMovementReversalAdviceV02(CorporateActionMovementReversalAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Elements in AdditionalInformation and
	 * CorporateActionInstruction/CorporateActionAdditionalInformation must not
	 * contain information that can be provided in a structured field unless
	 * bilaterally agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void check_seev_CorporateActionInstructionV04(CorporateActionInstructionV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Elements in AdditionalInformation and
	 * CorporateActionInstruction/CorporateActionAdditionalInformation must not
	 * contain information that can be provided in a structured field unless
	 * bilaterally agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void check_seev_CorporateActionInstructionV01(CorporateActionInstructionV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * AdditionalInformation/NarrativeVersion.
	 */
	public static void check_seev_CorporateActionMovementReversalAdvice002V09(CorporateActionMovementReversalAdvice002V09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Additionalnformation element must not contain information that can be
	 * provided in a structured field unless bilaterally agreed.
	 */
	public static void checkUpdatedAdditionalInformation8(UpdatedAdditionalInformation8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void check_seev_CorporateActionMovementReversalAdviceV03(CorporateActionMovementReversalAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void check_seev_CorporateActionMovementReversalAdviceV04(CorporateActionMovementReversalAdviceV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void checkCorporateActionNarrative27(CorporateActionNarrative27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed.
	 */
	public static void check_seev_CorporateActionInstructionCancellationRequestStatusAdviceV07(CorporateActionInstructionCancellationRequestStatusAdviceV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation element must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed.
	 */
	public static void check_seev_CorporateActionInstructionStatusAdviceV05(CorporateActionInstructionStatusAdviceV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not<br>
	 * contain information that can be provided in a structured field unless<br>
	 * bilaterally agreed or advised differently in the element definition<br>
	 * as in AdditionalInformation/NarrativeVersion.
	 */
	public static void check_seev_CorporateActionMovementReversalAdviceV08(CorporateActionMovementReversalAdviceV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Elements in AdditionalInformation and
	 * CorporateActionInstruction/AdditionalInformation must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition.
	 */
	public static void check_seev_CorporateActionInstructionV07(CorporateActionInstructionV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation element must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed.
	 */
	public static void check_seev_CorporateActionInstructionStatusAdviceV02(CorporateActionInstructionStatusAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void check_seev_CorporateActionMovementConfirmationV01(CorporateActionMovementConfirmationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed.
	 */
	public static void check_seev_CorporateActionInstructionCancellationRequestStatusAdvice002V08(CorporateActionInstructionCancellationRequestStatusAdvice002V08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Additionalnformation element must not contain information that can be
	 * provided in a structured field unless bilaterally agreed.
	 */
	public static void checkUpdatedAdditionalInformation10(UpdatedAdditionalInformation10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation element must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed.
	 */
	public static void check_seev_CorporateActionInstructionStatusAdviceV09(CorporateActionInstructionStatusAdviceV09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void check_seev_CorporateActionMovementConfirmationV04(CorporateActionMovementConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * AdditionalInformation/NarrativeVersion.
	 */
	public static void check_seev_CorporateActionMovementConfirmationV07(CorporateActionMovementConfirmationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation element must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed.
	 */
	public static void check_seev_CorporateActionInstructionStatusAdviceV01(CorporateActionInstructionStatusAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * AdditionalInformation/NarrativeVersion.
	 */
	public static void check_seev_CorporateActionMovementConfirmationV09(CorporateActionMovementConfirmationV09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation element must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed.
	 */
	public static void check_seev_CorporateActionInstructionStatusAdviceV04(CorporateActionInstructionStatusAdviceV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed.
	 */
	public static void check_seev_CorporateActionInstructionCancellationRequestStatusAdvice002V06(CorporateActionInstructionCancellationRequestStatusAdvice002V06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed.
	 */
	public static void check_seev_CorporateActionInstructionCancellationRequestStatusAdviceV02(CorporateActionInstructionCancellationRequestStatusAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * AdditionalInformation/NarrativeVersion.
	 */
	public static void check_seev_CorporateActionMovementReversalAdviceV09(CorporateActionMovementReversalAdviceV09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed.
	 */
	public static void check_seev_CorporateActionInstructionCancellationRequestStatusAdviceV03(CorporateActionInstructionCancellationRequestStatusAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed.
	 */
	public static void check_seev_CorporateActionInstructionCancellationRequestStatusAdviceV05(CorporateActionInstructionCancellationRequestStatusAdviceV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Elements in AdditionalInformation and
	 * CorporateActionInstruction/AdditionalInformation must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition.
	 */
	public static void check_seev_CorporateActionInstructionV08(CorporateActionInstructionV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Elements in AdditionalInformation and
	 * CorporateActionInstruction/AdditionalInformation must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition.
	 */
	public static void check_seev_CorporateActionInstruction002V08(CorporateActionInstruction002V08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not<br>
	 * contain information that can be provided in a structured field unless<br>
	 * bilaterally agreed or advised differently in the element definition<br>
	 * as in AdditionalInformation/NarrativeVersion.
	 */
	public static void check_seev_CorporateActionMovementReversalAdvice002V07(CorporateActionMovementReversalAdvice002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}