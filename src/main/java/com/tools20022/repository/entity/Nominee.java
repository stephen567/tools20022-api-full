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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.entity.InvestmentAccountPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AccountParties2;
import com.tools20022.repository.msg.AccountParties3;
import com.tools20022.repository.msg.AccountParties4;
import com.tools20022.repository.msg.AccountParties5;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Entity (the registered owner) named by the beneficial owner to act on its
 * behalf, often to facilitate dealing, or to conceal the identity of the
 * beneficiary. Securities and other assets are recorded in the nominee's name.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Nominee" src="doc-files/Nominee.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
 * InvestmentAccountPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties2#mmNominee
 * AccountParties2.mmNominee}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties5#mmNominee
 * AccountParties5.mmNominee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties1Choice#mmNominee
 * AccountParties1Choice.mmNominee}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties3#mmNominee
 * AccountParties3.mmNominee}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties4#mmNominee
 * AccountParties4.mmNominee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties2Choice#mmNominee
 * AccountParties2Choice.mmNominee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties3Choice#mmNominee
 * AccountParties3Choice.mmNominee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties4Choice#mmNominee
 * AccountParties4Choice.mmNominee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties7Choice#mmNominee
 * AccountParties7Choice.mmNominee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties6Choice#mmNominee
 * AccountParties6Choice.mmNominee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties5Choice#mmNominee
 * AccountParties5Choice.mmNominee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties9Choice#mmNominee
 * AccountParties9Choice.mmNominee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties8Choice#mmNominee
 * AccountParties8Choice.mmNominee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties11Choice#mmNominee
 * AccountParties11Choice.mmNominee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties10Choice#mmNominee
 * AccountParties10Choice.mmNominee}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Nominee"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Entity (the registered owner) named by the beneficial owner to act on its behalf, often to facilitate dealing, or to conceal the identity of the beneficiary. Securities and other assets are recorded in the nominee's name."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class Nominee extends InvestmentAccountPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Nominee";
				definition = "Entity (the registered owner) named by the beneficial owner to act on its behalf, often to facilitate dealing, or to conceal the identity of the beneficiary. Securities and other assets are recorded in the nominee's name.";
				derivationElement_lazy = () -> Arrays.asList(AccountParties2.mmNominee, AccountParties5.mmNominee, AccountParties1Choice.mmNominee, AccountParties3.mmNominee, AccountParties4.mmNominee, AccountParties2Choice.mmNominee,
						AccountParties3Choice.mmNominee, AccountParties4Choice.mmNominee, AccountParties7Choice.mmNominee, AccountParties6Choice.mmNominee, AccountParties5Choice.mmNominee, AccountParties9Choice.mmNominee,
						AccountParties8Choice.mmNominee, AccountParties11Choice.mmNominee, AccountParties10Choice.mmNominee);
				superType_lazy = () -> InvestmentAccountPartyRole.mmObject();
			}

			@Override
			public Class<?> getInstanceClass() {
				return Nominee.class;
			}
		});
		return mmObject_lazy.get();
	}
}