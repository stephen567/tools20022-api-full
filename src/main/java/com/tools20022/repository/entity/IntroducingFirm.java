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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.SecuritiesOrderPartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Party (broker or other intermediary) that owns the relationship with the
 * investor. It can relay an order directly to the trading floor, or give
 * clients direct access to the floor.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="IntroducingFirm" src="doc-files/IntroducingFirm.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationParties4#IntroducingFirm
 * ConfirmationParties4.IntroducingFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationParties2#IntroducingFirm
 * ConfirmationParties2.IntroducingFirm}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderPartyRole
 * SecuritiesOrderPartyRole}</li>
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
 * "IntroducingFirm"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Party (broker or other intermediary) that owns the relationship with the investor. It can relay an order directly to the trading floor, or give clients direct access to the floor."
 * </li>
 * </ul>
 */
public class IntroducingFirm extends SecuritiesOrderPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "IntroducingFirm";
				definition = "Party (broker or other intermediary) that owns the relationship with the investor. It can relay an order directly to the trading floor, or give clients direct access to the floor.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ConfirmationParties4.IntroducingFirm, com.tools20022.repository.msg.ConfirmationParties2.IntroducingFirm);
				superType_lazy = () -> SecuritiesOrderPartyRole.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}