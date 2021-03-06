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
import com.tools20022.repository.area.setr.SwitchOrderCancellationInstructionV02;
import com.tools20022.repository.area.setr.SwitchOrderCancellationRequestV03;
import com.tools20022.repository.area.setr.SwitchOrderCancellationRequestV04;
import java.util.Arrays;

/**
 * The cancellation of a switch order must be a full cancellation. Partial
 * cancellations are not allowed e.g. cancellation of a given leg.
 */
public class ConstraintSwitchRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderCancellationRequestV03
	 * SwitchOrderCancellationRequestV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwitchRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The cancellation of a switch order must be a full cancellation. Partial cancellations are not allowed e.g. cancellation of a given leg."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSwitchRule#for_setr_SwitchOrderCancellationRequestV04
	 * ConstraintSwitchRule.for_setr_SwitchOrderCancellationRequestV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchOrderCancellationRequestV03> for_setr_SwitchOrderCancellationRequestV03 = new MMConstraint<SwitchOrderCancellationRequestV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwitchRule";
			definition = "The cancellation of a switch order must be a full cancellation. Partial cancellations are not allowed e.g. cancellation of a given leg.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSwitchRule.for_setr_SwitchOrderCancellationRequestV04);
			owner_lazy = () -> SwitchOrderCancellationRequestV03.mmObject();
		}

		@Override
		public void executeValidator(SwitchOrderCancellationRequestV03 obj) throws Exception {
			check_setr_SwitchOrderCancellationRequestV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderCancellationInstructionV02
	 * SwitchOrderCancellationInstructionV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwitchRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The cancellation of a switch order must be a full cancellation. Partial cancellations are not allowed e.g. cancellation of a given leg."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchOrderCancellationInstructionV02> for_setr_SwitchOrderCancellationInstructionV02 = new MMConstraint<SwitchOrderCancellationInstructionV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwitchRule";
			definition = "The cancellation of a switch order must be a full cancellation. Partial cancellations are not allowed e.g. cancellation of a given leg.";
			owner_lazy = () -> SwitchOrderCancellationInstructionV02.mmObject();
		}

		@Override
		public void executeValidator(SwitchOrderCancellationInstructionV02 obj) throws Exception {
			check_setr_SwitchOrderCancellationInstructionV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderCancellationRequestV04
	 * SwitchOrderCancellationRequestV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwitchRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The cancellation of a switch order must be a full cancellation. Partial cancellations are not allowed, for example, the cancellation of a given leg."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSwitchRule#for_setr_SwitchOrderCancellationRequestV03
	 * ConstraintSwitchRule.for_setr_SwitchOrderCancellationRequestV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<SwitchOrderCancellationRequestV04> for_setr_SwitchOrderCancellationRequestV04 = new MMConstraint<SwitchOrderCancellationRequestV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwitchRule";
			definition = "The cancellation of a switch order must be a full cancellation. Partial cancellations are not allowed, for example, the cancellation of a given leg.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSwitchRule.for_setr_SwitchOrderCancellationRequestV03;
			owner_lazy = () -> SwitchOrderCancellationRequestV04.mmObject();
		}

		@Override
		public void executeValidator(SwitchOrderCancellationRequestV04 obj) throws Exception {
			check_setr_SwitchOrderCancellationRequestV04(obj);
		}
	};

	/**
	 * The cancellation of a switch order must be a full cancellation. Partial
	 * cancellations are not allowed e.g. cancellation of a given leg.
	 */
	public static void check_setr_SwitchOrderCancellationRequestV03(SwitchOrderCancellationRequestV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The cancellation of a switch order must be a full cancellation. Partial
	 * cancellations are not allowed e.g. cancellation of a given leg.
	 */
	public static void check_setr_SwitchOrderCancellationInstructionV02(SwitchOrderCancellationInstructionV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The cancellation of a switch order must be a full cancellation. Partial
	 * cancellations are not allowed, for example, the cancellation of a given
	 * leg.
	 */
	public static void check_setr_SwitchOrderCancellationRequestV04(SwitchOrderCancellationRequestV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}