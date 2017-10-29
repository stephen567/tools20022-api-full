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

package com.tools20022.repository.msgset;

import com.tools20022.metamodel.MMMessageSet;
import com.tools20022.repository.area.remt.RemittanceAdviceV03;
import com.tools20022.repository.area.remt.RemittanceLocationAdviceV01;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * The Stand-Alone remittance messages can be used to send remittance advice
 * information to a financial institution, to customers directly or passed
 * through another financial institution via a clearing system format supporting
 * these messages.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.remt.RemittanceLocationAdviceV01
 * RemittanceLocationAdviceV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.remt.RemittanceAdviceV03
 * RemittanceAdviceV03}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelCatalogueEntry#getBusinessProcessCatalogue
 * businessProcessCatalogue} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#catalogue
 * GeneratedRepository.catalogue}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Stand-Alone Remittance Advice - ISO - Latest version"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The Stand-Alone remittance messages can be used to send remittance advice information to a financial institution, to customers directly or passed through another financial institution via a clearing system format supporting these messages."
 * </li>
 * </ul>
 */
public class StandAloneRemittanceAdviceISOLatestversion {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> com.tools20022.repository.GeneratedRepository.catalogue;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Stand-Alone Remittance Advice - ISO - Latest version";
				definition = "The Stand-Alone remittance messages can be used to send remittance advice information to a financial institution, to customers directly or passed through another financial institution via a clearing system format supporting these messages.";
				messageDefinition_lazy = () -> Arrays.asList(RemittanceLocationAdviceV01.mmObject(), RemittanceAdviceV03.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}