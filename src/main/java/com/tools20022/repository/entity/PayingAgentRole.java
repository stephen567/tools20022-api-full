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

import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

/**
 * Additional party appointed to distribute payment or securities on behalf of
 * the issuer.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PayingAgentRole" src="doc-files/PayingAgentRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PayingAgentRole#mmCommissionAmount
 * PayingAgentRole.mmCommissionAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PayingAgentRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Additional party appointed to distribute payment or securities on behalf of the issuer."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class PayingAgentRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyAndAmount commissionAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PayingAgentRole
	 * PayingAgentRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommissionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of paying/sub-paying agent commission."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PayingAgentRole, CurrencyAndAmount> mmCommissionAmount = new MMBusinessAttribute<PayingAgentRole, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PayingAgentRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CommissionAmount";
			definition = "Amount of paying/sub-paying agent commission.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(PayingAgentRole obj) {
			return obj.getCommissionAmount();
		}

		@Override
		public void setValue(PayingAgentRole obj, CurrencyAndAmount value) {
			obj.setCommissionAmount(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PayingAgentRole";
				definition = "Additional party appointed to distribute payment or securities on behalf of the issuer.";
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PayingAgentRole.mmCommissionAmount);
			}

			@Override
			public Class<?> getInstanceClass() {
				return PayingAgentRole.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getCommissionAmount() {
		return commissionAmount;
	}

	public PayingAgentRole setCommissionAmount(CurrencyAndAmount commissionAmount) {
		this.commissionAmount = Objects.requireNonNull(commissionAmount);
		return this;
	}
}