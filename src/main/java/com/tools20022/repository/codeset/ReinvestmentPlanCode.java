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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates the specific reinvestment plan type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentPlanCode#ForRetailInvestorsOnly
 * ReinvestmentPlanCode.ForRetailInvestorsOnly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentPlanCode#FullReinvestmentPlanOffered
 * ReinvestmentPlanCode.FullReinvestmentPlanOffered}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentPlanCode#SubjectToShareholderApproval
 * ReinvestmentPlanCode.SubjectToShareholderApproval}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ReinvestmentPlan1Code
 * ReinvestmentPlan1Code}</li>
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
 * "ReinvestmentPlanCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates the specific reinvestment plan type."</li>
 * </ul>
 */
public class ReinvestmentPlanCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Reinvestment plan is for retail investors only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReinvestmentPlanCode
	 * ReinvestmentPlanCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RETA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForRetailInvestorsOnly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reinvestment plan is for retail investors only."</li>
	 * </ul>
	 */
	public static final MMCode ForRetailInvestorsOnly = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForRetailInvestorsOnly";
			definition = "Reinvestment plan is for retail investors only.";
			owner_lazy = () -> ReinvestmentPlanCode.mmObject();
			codeName = "RETA";
		}
	};
	/**
	 * Full reinvestment plan offered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReinvestmentPlanCode
	 * ReinvestmentPlanCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FULL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullReinvestmentPlanOffered"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Full reinvestment plan offered."</li>
	 * </ul>
	 */
	public static final MMCode FullReinvestmentPlanOffered = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullReinvestmentPlanOffered";
			definition = "Full reinvestment plan offered.";
			owner_lazy = () -> ReinvestmentPlanCode.mmObject();
			codeName = "FULL";
		}
	};
	/**
	 * Reinvestment plan is subject to shareholder approval.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReinvestmentPlanCode
	 * ReinvestmentPlanCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUAP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubjectToShareholderApproval"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reinvestment plan is subject to shareholder approval."</li>
	 * </ul>
	 */
	public static final MMCode SubjectToShareholderApproval = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubjectToShareholderApproval";
			definition = "Reinvestment plan is subject to shareholder approval.";
			owner_lazy = () -> ReinvestmentPlanCode.mmObject();
			codeName = "SUAP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ReinvestmentPlanCode";
				definition = "Indicates the specific reinvestment plan type.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ReinvestmentPlanCode.ForRetailInvestorsOnly, com.tools20022.repository.codeset.ReinvestmentPlanCode.FullReinvestmentPlanOffered,
						com.tools20022.repository.codeset.ReinvestmentPlanCode.SubjectToShareholderApproval);
				derivation_lazy = () -> Arrays.asList(ReinvestmentPlan1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}